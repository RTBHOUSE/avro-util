
package com.linkedin.avro.fastserde.generated.deserialization.AVRO_1_4;

import java.io.IOException;
import com.linkedin.avro.api.PrimitiveIntList;
import com.linkedin.avro.fastserde.FastDeserializer;
import com.linkedin.avro.fastserde.primitive.PrimitiveIntArrayList;
import org.apache.avro.Schema;
import org.apache.avro.generic.IndexedRecord;
import org.apache.avro.io.Decoder;

public class FastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingWithArrays_GenericDeserializer_4705761037408502843_4705761037408502843
    implements FastDeserializer<IndexedRecord>
{

    private final Schema readerSchema;
    private final Schema test0;
    private final Schema testOptionSchema0;

    public FastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingWithArrays_GenericDeserializer_4705761037408502843_4705761037408502843(Schema readerSchema) {
        this.readerSchema = readerSchema;
        this.test0 = readerSchema.getField("test").schema();
        this.testOptionSchema0 = test0 .getTypes().get(0);
    }

    public IndexedRecord deserialize(IndexedRecord reuse, Decoder decoder)
        throws IOException
    {
        return deserializeFastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingWithArrays0((reuse), (decoder));
    }

    public IndexedRecord deserializeFastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingWithArrays0(Object reuse, Decoder decoder)
        throws IOException
    {
        IndexedRecord FastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingWithArrays;
        if ((((reuse)!= null)&&((reuse) instanceof IndexedRecord))&&(((IndexedRecord)(reuse)).getSchema() == readerSchema)) {
            FastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingWithArrays = ((IndexedRecord)(reuse));
        } else {
            FastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingWithArrays = new org.apache.avro.generic.GenericData.Record(readerSchema);
        }
        int unionIndex0 = (decoder.readIndex());
        if (unionIndex0 == 0) {
            PrimitiveIntList testOption0 = null;
            long chunkLen0 = (decoder.readArrayStart());
            if (FastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingWithArrays.get(0) instanceof PrimitiveIntList) {
                testOption0 = ((PrimitiveIntList) FastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingWithArrays.get(0));
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
            FastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingWithArrays.put(0, testOption0);
        } else {
            if (unionIndex0 == 1) {
                decoder.readNull();
            }
        }
        return FastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingWithArrays;
    }

}