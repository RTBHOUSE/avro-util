
package com.linkedin.avro.fastserde.generated.deserialization.AVRO_1_9;

import java.io.IOException;
import java.util.List;
import com.linkedin.avro.fastserde.FastDeserializer;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericArray;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.IndexedRecord;
import org.apache.avro.io.Decoder;

public class UNION_GenericDeserializer_2018567528_1606337179
    implements FastDeserializer<List<IndexedRecord>>
{

    private final Schema readerSchema;
    private final GenericData modelData;
    private final Schema arrayArraySchema0;
    private final Schema arrayArrayElemSchema0;

    public UNION_GenericDeserializer_2018567528_1606337179(Schema readerSchema, GenericData modelData) {
        this.readerSchema = readerSchema;
        this.modelData = modelData;
        this.arrayArraySchema0 = readerSchema.getTypes().get(1);
        this.arrayArrayElemSchema0 = arrayArraySchema0 .getElementType();
    }

    public List<IndexedRecord> deserialize(List<IndexedRecord> reuse, Decoder decoder)
        throws IOException
    {
        List<IndexedRecord> array0 = null;
        long chunkLen0 = (decoder.readArrayStart());
        if ((reuse) instanceof List) {
            array0 = ((List)(reuse));
            array0 .clear();
        } else {
            array0 = new GenericData.Array<IndexedRecord>(((int) chunkLen0), arrayArraySchema0);
        }
        while (chunkLen0 > 0) {
            for (int counter0 = 0; (counter0 <chunkLen0); counter0 ++) {
                Object arrayArrayElementReuseVar0 = null;
                if ((reuse) instanceof GenericArray) {
                    arrayArrayElementReuseVar0 = ((GenericArray)(reuse)).peek();
                }
                array0 .add(deserializerecord0(arrayArrayElementReuseVar0, (decoder)));
            }
            chunkLen0 = (decoder.arrayNext());
        }
        return array0;
    }

    public IndexedRecord deserializerecord0(Object reuse, Decoder decoder)
        throws IOException
    {
        IndexedRecord record;
        if ((((reuse)!= null)&&((reuse) instanceof IndexedRecord))&&(((IndexedRecord)(reuse)).getSchema() == arrayArrayElemSchema0)) {
            record = ((IndexedRecord)(reuse));
        } else {
            record = new GenericData.Record(arrayArrayElemSchema0);
        }
        record.put(0, (decoder.readInt()));
        return record;
    }

}
