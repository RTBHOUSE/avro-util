
package com.linkedin.avro.fastserde.generated.deserialization.AVRO_1_11;

import java.io.IOException;
import com.linkedin.avro.fastserde.FastDeserializer;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.IndexedRecord;
import org.apache.avro.io.Decoder;

public class record_GenericDeserializer_711533897_1556659421
    implements FastDeserializer<IndexedRecord>
{

    private final Schema readerSchema;
    private final GenericData modelData;
    private final Schema subRecord0;
    private final Schema subRecordRecordSchema0;

    public record_GenericDeserializer_711533897_1556659421(Schema readerSchema, GenericData modelData) {
        this.readerSchema = readerSchema;
        this.modelData = modelData;
        this.subRecord0 = readerSchema.getField("subRecord").schema();
        this.subRecordRecordSchema0 = subRecord0 .getTypes().get(1);
    }

    public IndexedRecord deserialize(IndexedRecord reuse, Decoder decoder)
        throws IOException
    {
        return deserializerecord0((reuse), (decoder));
    }

    public IndexedRecord deserializerecord0(Object reuse, Decoder decoder)
        throws IOException
    {
        IndexedRecord record;
        if ((((reuse)!= null)&&((reuse) instanceof IndexedRecord))&&(((IndexedRecord)(reuse)).getSchema() == readerSchema)) {
            record = ((IndexedRecord)(reuse));
        } else {
            record = new GenericData.Record(readerSchema);
        }
        record.put(0, deserializesubRecord0(record.get(0), (decoder)));
        return record;
    }

    public IndexedRecord deserializesubRecord0(Object reuse, Decoder decoder)
        throws IOException
    {
        IndexedRecord subRecord;
        if ((((reuse)!= null)&&((reuse) instanceof IndexedRecord))&&(((IndexedRecord)(reuse)).getSchema() == subRecordRecordSchema0)) {
            subRecord = ((IndexedRecord)(reuse));
        } else {
            subRecord = new GenericData.Record(subRecordRecordSchema0);
        }
        subRecord.put(0, (decoder.readInt()));
        populate_subRecord0((subRecord), (decoder));
        return subRecord;
    }

    private void populate_subRecord0(IndexedRecord subRecord, Decoder decoder)
        throws IOException
    {
        subRecord.put(1, (decoder.readInt()));
    }

}
