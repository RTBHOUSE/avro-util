package com.linkedin.avro.fastserde.logical.types;

import static com.linkedin.avro.fastserde.FastSerdeTestsSupport.getCodeGenDirectory;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.testng.annotations.Test;

import com.linkedin.avro.fastserde.FastGenericDeserializerGenerator;
import com.linkedin.avro.fastserde.FastGenericSerializerGenerator;
import com.linkedin.avro.fastserde.FastSpecificDeserializerGenerator;
import com.linkedin.avro.fastserde.FastSpecificSerializerGenerator;
import com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesDefined;
import com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1;
import com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesUndefined;

/**
 * Temporary test just to generate fast-avro (de)serializer classes
 * so that we can easily see differences after adding some changes to fast-avro generators.
 */
public class LogicalTypesFastSerdeGeneratorDummyTest {

    private final File classesDir;
    private final ClassLoader classLoader;

    public LogicalTypesFastSerdeGeneratorDummyTest() {
        try {
            classesDir = getCodeGenDirectory();
            classLoader = URLClassLoader.newInstance(new URL[]{classesDir.toURI().toURL()}, getClass().getClassLoader());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void generateSerializerClasses() {
        Schema schema = FastSerdeLogicalTypesTest1.SCHEMA$;
        new FastGenericSerializerGenerator<FastSerdeLogicalTypesTest1>(
                schema, classesDir, classLoader, null)
                .generateSerializer();
        new FastSpecificSerializerGenerator<FastSerdeLogicalTypesTest1>(
                schema, classesDir, classLoader, null)
                .generateSerializer();

        schema = FastSerdeLogicalTypesDefined.SCHEMA$;
        new FastGenericSerializerGenerator<FastSerdeLogicalTypesDefined>(
                schema, classesDir, classLoader, null)
                .generateSerializer();
        new FastSpecificSerializerGenerator<FastSerdeLogicalTypesDefined>(
                schema, classesDir, classLoader, null)
                .generateSerializer();

        schema = FastSerdeLogicalTypesUndefined.SCHEMA$;
        new FastGenericSerializerGenerator<FastSerdeLogicalTypesUndefined>(
                schema, classesDir, classLoader, null)
                .generateSerializer();
        new FastSpecificSerializerGenerator<FastSerdeLogicalTypesUndefined>(
                schema, classesDir, classLoader, null)
                .generateSerializer();
    }

    @Test
    void generateDeserializers() {
        Schema schema = FastSerdeLogicalTypesTest1.SCHEMA$;
        new FastGenericDeserializerGenerator<GenericData.Record>(
                schema, schema, classesDir, classLoader, null)
                .generateDeserializer();
        new FastSpecificDeserializerGenerator<FastSerdeLogicalTypesTest1>(
                schema, schema, classesDir, classLoader, null)
                .generateDeserializer();

        schema = FastSerdeLogicalTypesDefined.SCHEMA$;
        new FastGenericDeserializerGenerator<GenericData.Record>(
                schema, schema, classesDir, classLoader, null)
                .generateDeserializer();
        new FastSpecificDeserializerGenerator<FastSerdeLogicalTypesDefined>(
                schema, schema, classesDir, classLoader, null)
                .generateDeserializer();

        schema = FastSerdeLogicalTypesUndefined.SCHEMA$;
        new FastGenericDeserializerGenerator<GenericData.Record>(
                schema, schema, classesDir, classLoader, null)
                .generateDeserializer();
        new FastSpecificDeserializerGenerator<FastSerdeLogicalTypesUndefined>(
                schema, schema, classesDir, classLoader, null)
                .generateDeserializer();
    }
}
