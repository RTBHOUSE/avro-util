
package com.linkedin.avro.fastserde.generated.deserialization.AVRO_1_11;

import java.io.IOException;
import com.linkedin.avro.fastserde.FastDeserializer;
import com.linkedin.avro.fastserde.customized.DatumReaderCustomization;
import org.apache.avro.Schema;
import org.apache.avro.generic.IndexedRecord;
import org.apache.avro.io.Decoder;
import org.apache.avro.util.Utf8;

public class FastGenericDeserializerGeneratorTest_shouldSkipRemovedRecord_GenericDeserializer_1932590611_1452595291
    implements FastDeserializer<IndexedRecord>
{

    private final Schema readerSchema;
    private final Schema subRecord10;

    public FastGenericDeserializerGeneratorTest_shouldSkipRemovedRecord_GenericDeserializer_1932590611_1452595291(Schema readerSchema) {
        this.readerSchema = readerSchema;
        this.subRecord10 = readerSchema.getField("subRecord1").schema();
    }

    public IndexedRecord deserialize(IndexedRecord reuse, Decoder decoder, DatumReaderCustomization customization)
        throws IOException
    {
        return deserializeFastGenericDeserializerGeneratorTest_shouldSkipRemovedRecord0((reuse), (decoder), (customization));
    }

    public IndexedRecord deserializeFastGenericDeserializerGeneratorTest_shouldSkipRemovedRecord0(Object reuse, Decoder decoder, DatumReaderCustomization customization)
        throws IOException
    {
        IndexedRecord FastGenericDeserializerGeneratorTest_shouldSkipRemovedRecord;
        if ((((reuse)!= null)&&((reuse) instanceof IndexedRecord))&&(((IndexedRecord)(reuse)).getSchema() == readerSchema)) {
            FastGenericDeserializerGeneratorTest_shouldSkipRemovedRecord = ((IndexedRecord)(reuse));
        } else {
            FastGenericDeserializerGeneratorTest_shouldSkipRemovedRecord = new org.apache.avro.generic.GenericData.Record(readerSchema);
        }
        FastGenericDeserializerGeneratorTest_shouldSkipRemovedRecord.put(0, deserializesubRecord0(FastGenericDeserializerGeneratorTest_shouldSkipRemovedRecord.get(0), (decoder), (customization)));
        populate_FastGenericDeserializerGeneratorTest_shouldSkipRemovedRecord0((FastGenericDeserializerGeneratorTest_shouldSkipRemovedRecord), (customization), (decoder));
        populate_FastGenericDeserializerGeneratorTest_shouldSkipRemovedRecord1((FastGenericDeserializerGeneratorTest_shouldSkipRemovedRecord), (customization), (decoder));
        return FastGenericDeserializerGeneratorTest_shouldSkipRemovedRecord;
    }

    public IndexedRecord deserializesubRecord0(Object reuse, Decoder decoder, DatumReaderCustomization customization)
        throws IOException
    {
        IndexedRecord subRecord;
        if ((((reuse)!= null)&&((reuse) instanceof IndexedRecord))&&(((IndexedRecord)(reuse)).getSchema() == subRecord10)) {
            subRecord = ((IndexedRecord)(reuse));
        } else {
            subRecord = new org.apache.avro.generic.GenericData.Record(subRecord10);
        }
        Utf8 charSequence0;
        Object oldString0 = subRecord.get(0);
        if (oldString0 instanceof Utf8) {
            charSequence0 = (decoder).readString(((Utf8) oldString0));
        } else {
            charSequence0 = (decoder).readString(null);
        }
        subRecord.put(0, charSequence0);
        populate_subRecord0((subRecord), (customization), (decoder));
        return subRecord;
    }

    private void populate_subRecord0(IndexedRecord subRecord, DatumReaderCustomization customization, Decoder decoder)
        throws IOException
    {
        Utf8 charSequence1;
        Object oldString1 = subRecord.get(1);
        if (oldString1 instanceof Utf8) {
            charSequence1 = (decoder).readString(((Utf8) oldString1));
        } else {
            charSequence1 = (decoder).readString(null);
        }
        subRecord.put(1, charSequence1);
    }

    private void populate_FastGenericDeserializerGeneratorTest_shouldSkipRemovedRecord0(IndexedRecord FastGenericDeserializerGeneratorTest_shouldSkipRemovedRecord, DatumReaderCustomization customization, Decoder decoder)
        throws IOException
    {
        deserializesubRecord20(null, (decoder), (customization));
        int unionIndex0 = (decoder.readIndex());
        if (unionIndex0 == 0) {
            decoder.readNull();
        } else {
            if (unionIndex0 == 1) {
                deserializesubRecord20(null, (decoder), (customization));
            } else {
                throw new RuntimeException(("Illegal union index for 'subRecord3': "+ unionIndex0));
            }
        }
    }

    public void deserializesubRecord20(Object reuse, Decoder decoder, DatumReaderCustomization customization)
        throws IOException
    {
        decoder.skipString();
        populate_subRecord20((customization), (decoder));
    }

    private void populate_subRecord20(DatumReaderCustomization customization, Decoder decoder)
        throws IOException
    {
        decoder.skipString();
    }

    private void populate_FastGenericDeserializerGeneratorTest_shouldSkipRemovedRecord1(IndexedRecord FastGenericDeserializerGeneratorTest_shouldSkipRemovedRecord, DatumReaderCustomization customization, Decoder decoder)
        throws IOException
    {
        FastGenericDeserializerGeneratorTest_shouldSkipRemovedRecord.put(1, deserializesubRecord0(FastGenericDeserializerGeneratorTest_shouldSkipRemovedRecord.get(1), (decoder), (customization)));
    }

}
