package com.linkedin.avro.fastserde.logical.types;

import static com.linkedin.avro.fastserde.FastSerdeTestsSupport.getCodeGenDirectory;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.ByteBuffer;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.apache.avro.Conversion;
import org.apache.avro.Conversions;
import org.apache.avro.Schema;
import org.apache.avro.data.TimeConversions;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.Decoder;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.avro.specific.SpecificRecordBase;
import org.testng.Assert;
import org.testng.collections.Lists;

import com.linkedin.avro.fastserde.FastDeserializer;
import com.linkedin.avro.fastserde.FastGenericDeserializerGenerator;
import com.linkedin.avro.fastserde.FastGenericSerializerGenerator;
import com.linkedin.avro.fastserde.FastSerializer;
import com.linkedin.avro.fastserde.FastSpecificDeserializerGenerator;
import com.linkedin.avro.fastserde.FastSpecificSerializerGenerator;
import com.linkedin.avroutil1.compatibility.AvroCompatibilityHelperCommon;
import com.linkedin.avroutil1.compatibility.AvroVersion;

public abstract class LogicalTypesTestBase {

    private final File classesDir;
    private final ClassLoader classLoader;

    LogicalTypesTestBase() {
        try {
            classesDir = getCodeGenDirectory();
            classLoader = URLClassLoader.newInstance(new URL[]{classesDir.toURI().toURL()}, getClass().getClassLoader());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected <T extends GenericData> T copyConversions(SpecificData fromSpecificData, T toModelData) {
        Optional.ofNullable(fromSpecificData.getConversions())
                .orElse(Collections.emptyList())
                .forEach(toModelData::addLogicalTypeConversion);

        fixConversionsIfAvro19(toModelData);

        return toModelData;
    }

    protected <T extends GenericData> void fixConversionsIfAvro19(T modelData) {
        if (AvroCompatibilityHelperCommon.getRuntimeAvroVersion() == AvroVersion.AVRO_1_9) {
            // 1. These conversions should be injected by default (avro-compiler issue).
            // 2. Missing DecimalConversion causes conflict with stringable feature (BigDecimal is considered as string, not bytes)
            //    details: GenericData.resolveUnion() + SpecificData.getSchemaName().
            // 3. Time-conversions are needed for GenericDatumWriter/Reader which sees logicalType in the schema
            //    but is unable to find corresponding converter.
            // 4. LocalTimestampMillisConversion not available in 1.9.

            List<Conversion<?>> missingConversions = Lists.newArrayList(
                    new Conversions.DecimalConversion(),
                    new TimeConversions.TimeMillisConversion(),
                    new TimeConversions.TimeMicrosConversion(),
                    new TimeConversions.TimestampMicrosConversion());

            for (Conversion<?> conversion : missingConversions) {
                modelData.addLogicalTypeConversion(conversion);
            }
        }
    }

    protected <T extends GenericRecord> byte[] serialize(FastSerializer<T> fastSerializer, T data) throws IOException {
        InMemoryEncoder encoder = new InMemoryEncoder(data.getSchema());
        fastSerializer.serialize(data, encoder);
        return encoder.toByteArray();
    }

    protected <T extends GenericRecord> byte[] serialize(DatumWriter<T> datumWriter, T data) throws IOException {
        InMemoryEncoder encoder = new InMemoryEncoder(data.getSchema());
        datumWriter.write(data, encoder);

        return encoder.toByteArray();
    }

    protected static Instant toInstant(Object maybeDate) {
        if (maybeDate == null) {
            return null;
        } else if (maybeDate instanceof LocalDate) {
            return ((LocalDate) maybeDate).atStartOfDay(ZoneId.systemDefault()).toInstant();
        } else if (maybeDate instanceof LocalDateTime) {
            return ((LocalDateTime) maybeDate).toInstant(ZoneOffset.UTC);
        } else {
            throw new UnsupportedOperationException(maybeDate + " is not supported (yet)");
        }
    }

    /**
     * Runs various serializers and ensures each one returned the same result.
     * @return result from default serialization, normally it's just {@code data.toByteBuffer().array()}
     */
    protected <T extends SpecificRecordBase> byte[] verifySerializers(T data,
            FunctionThrowingIOException<T, ByteBuffer> toByteBuffer) throws IOException {
        // given
        Schema schema = data.getSchema();
        FastSerializer<T> fastGenericSerializer = new FastGenericSerializerGenerator<T>(
                schema, classesDir, classLoader, null)
                .generateSerializer();

        FastSerializer<T> fastSpecificSerializer = new FastSpecificSerializerGenerator<T>(
                schema, classesDir, classLoader, null)
                .generateSerializer();

        GenericDatumWriter<T> genericDatumWriter = new GenericDatumWriter<>(
                schema, copyConversions(data.getSpecificData(), new GenericData()));

        SpecificDatumWriter<T> specificDatumWriter = new SpecificDatumWriter<>(
                schema, copyConversions(data.getSpecificData(), new SpecificData()));

        fixConversionsIfAvro19(data.getSpecificData());

        // when
        byte[] fastGenericBytes = serialize(fastGenericSerializer, data);
        byte[] fastSpecificBytes = serialize(fastSpecificSerializer, data);
        byte[] genericBytes = serialize(genericDatumWriter, data);
        byte[] specificBytes = serialize(specificDatumWriter, data);
        byte[] defaultBytes = toByteBuffer.apply(data).array();

        // then all 5 serializing methods should return the same array of bytes
        Assert.assertEquals(fastGenericBytes, defaultBytes);
        Assert.assertEquals(fastSpecificBytes, defaultBytes);
        Assert.assertEquals(genericBytes, defaultBytes);
        Assert.assertEquals(specificBytes, defaultBytes);

        return defaultBytes;
    }

    protected <T extends SpecificRecordBase> T verifyDeserializers(byte[] bytesWithHeader,
            FunctionThrowingIOException<ByteBuffer, T> fromByteBuffer) throws IOException {
        // given
        T data = fromByteBuffer.apply(ByteBuffer.wrap(bytesWithHeader));
        byte[] bytes = dropV1Header(bytesWithHeader);
        Schema schema = data.getSchema();
        Supplier<Decoder> decoderSupplier = () -> DecoderFactory.get().binaryDecoder(bytes, null);

        FastDeserializer<GenericData.Record> fastGenericDeserializer = new FastGenericDeserializerGenerator<GenericData.Record>(
                schema, schema, classesDir, classLoader, null)
                .generateDeserializer();

        FastDeserializer<T> fastSpecificDeserializer = new FastSpecificDeserializerGenerator<T>(
                schema, schema, classesDir, classLoader, null)
                .generateDeserializer();

        GenericDatumReader<GenericData.Record> genericDatumReader = new GenericDatumReader<>(
                schema, schema, copyConversions(data.getSpecificData(), new GenericData()));

        SpecificDatumReader<T> specificDatumReader = new SpecificDatumReader<>(
                schema, schema, copyConversions(data.getSpecificData(), new SpecificData()));

        // when deserializing with different serializers/writers
        GenericData.Record deserializedFastGeneric = fastGenericDeserializer.deserialize(decoderSupplier.get());
        T deserializedFastSpecific = fastSpecificDeserializer.deserialize(decoderSupplier.get());
        GenericData.Record deserializedGenericReader = genericDatumReader.read(null, decoderSupplier.get());
        T deserializedSpecificReader = specificDatumReader.read(null, decoderSupplier.get());

        // then
        Assert.assertEquals(deserializedFastSpecific, data);
        Assert.assertEquals(deserializedSpecificReader, data);
        assertEquals(deserializedFastGeneric, data);
        assertEquals(deserializedGenericReader, data);

        return deserializedFastSpecific;
    }

    protected <T extends SpecificRecordBase> void assertEquals(GenericData.Record actual, T expected) throws IOException {
        Assert.assertEquals(actual.toString(), expected.toString());

        GenericDatumWriter<GenericData.Record> genericDatumWriter = new GenericDatumWriter<>(
                actual.getSchema(), copyConversions(expected.getSpecificData(), new GenericData()));

        SpecificDatumWriter<T> specificDatumWriter = new SpecificDatumWriter<>(
                expected.getSchema(), copyConversions(expected.getSpecificData(), new SpecificData()));

        byte[] genericBytes = serialize(genericDatumWriter, actual);
        byte[] expectedBytes = serialize(specificDatumWriter, expected);

        Assert.assertEquals(genericBytes, expectedBytes);
    }

    protected byte[] dropV1Header(byte[] bytesWithHeader) {
        final int v1HeaderLength = 10;
        return Arrays.copyOfRange(bytesWithHeader, v1HeaderLength, bytesWithHeader.length);
    }
}
