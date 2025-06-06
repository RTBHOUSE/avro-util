
package com.linkedin.avro.fastserde.generated.deserialization.AVRO_1_11;

import java.io.IOException;
import com.linkedin.avro.api.PrimitiveIntList;
import com.linkedin.avro.fastserde.FastDeserializer;
import com.linkedin.avro.fastserde.customized.DatumReaderCustomization;
import com.linkedin.avro.fastserde.primitive.PrimitiveIntArrayList;
import org.apache.avro.Schema;
import org.apache.avro.generic.IndexedRecord;
import org.apache.avro.io.Decoder;

public class FastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingWithArrays_GenericDeserializer_1778260273_906204958
    implements FastDeserializer<IndexedRecord>
{

    private final Schema readerSchema;
    private final Schema test0;
    private final Schema testOptionSchema0;

    public FastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingWithArrays_GenericDeserializer_1778260273_906204958(Schema readerSchema) {
        this.readerSchema = readerSchema;
        this.test0 = readerSchema.getField("test").schema();
        this.testOptionSchema0 = test0 .getTypes().get(1);
    }

    public IndexedRecord deserialize(IndexedRecord reuse, Decoder decoder, DatumReaderCustomization customization)
        throws IOException
    {
        return deserializeFastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingWithArrays0((reuse), (decoder), (customization));
    }

    public IndexedRecord deserializeFastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingWithArrays0(Object reuse, Decoder decoder, DatumReaderCustomization customization)
        throws IOException
    {
        IndexedRecord fastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingWithArrays0;
        if ((((reuse)!= null)&&((reuse) instanceof IndexedRecord))&&(((IndexedRecord)(reuse)).getSchema() == readerSchema)) {
            fastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingWithArrays0 = ((IndexedRecord)(reuse));
        } else {
            fastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingWithArrays0 = new org.apache.avro.generic.GenericData.Record(readerSchema);
        }
        int unionIndex0 = (decoder.readIndex());
        if (unionIndex0 == 0) {
            PrimitiveIntList testOption0 = null;
            long chunkLen0 = (decoder.readArrayStart());
            Object oldArray0 = fastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingWithArrays0 .get(0);
            if (oldArray0 instanceof PrimitiveIntList) {
                testOption0 = ((PrimitiveIntList) oldArray0);
                testOption0 .clear();
            } else {
                testOption0 = new PrimitiveIntArrayList(((int) chunkLen0));
            }
            while (chunkLen0 > 0) {
                for (int counter0 = 0; (counter0 <chunkLen0); counter0 ++) {
                    testOption0 .addPrimitive((decoder.readInt()));
                }
                chunkLen0 = (decoder.arrayNext());
            }
            fastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingWithArrays0 .put(0, testOption0);
        } else {
            if (unionIndex0 == 1) {
                decoder.readNull();
                fastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingWithArrays0 .put(0, null);
            } else {
                throw new RuntimeException(("Illegal union index for 'test': "+ unionIndex0));
            }
        }
        return fastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingWithArrays0;
    }

}
