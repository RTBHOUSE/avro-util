
package com.linkedin.avro.fastserde.generated.deserialization.AVRO_1_10;

import java.io.IOException;
import com.linkedin.avro.fastserde.FastDeserializer;
import org.apache.avro.Schema;
import org.apache.avro.io.Decoder;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;

public class RemovedTypesTestRecord_SpecificDeserializer_1438463600_36310691
    implements FastDeserializer<com.linkedin.avro.fastserde.generated.avro.RemovedTypesTestRecord>
{

    private final Schema readerSchema;
    private final SpecificData modelData;

    public RemovedTypesTestRecord_SpecificDeserializer_1438463600_36310691(Schema readerSchema, SpecificData modelData) {
        this.readerSchema = readerSchema;
        this.modelData = modelData;
    }

    public com.linkedin.avro.fastserde.generated.avro.RemovedTypesTestRecord deserialize(com.linkedin.avro.fastserde.generated.avro.RemovedTypesTestRecord reuse, Decoder decoder)
        throws IOException
    {
        return deserializeRemovedTypesTestRecord0((reuse), (decoder));
    }

    public com.linkedin.avro.fastserde.generated.avro.RemovedTypesTestRecord deserializeRemovedTypesTestRecord0(Object reuse, Decoder decoder)
        throws IOException
    {
        com.linkedin.avro.fastserde.generated.avro.RemovedTypesTestRecord RemovedTypesTestRecord;
        if ((reuse)!= null) {
            RemovedTypesTestRecord = ((com.linkedin.avro.fastserde.generated.avro.RemovedTypesTestRecord)(reuse));
        } else {
            RemovedTypesTestRecord = new com.linkedin.avro.fastserde.generated.avro.RemovedTypesTestRecord();
        }
        Utf8 charSequence0;
        Object oldString0 = RemovedTypesTestRecord.get(0);
        if (oldString0 instanceof Utf8) {
            charSequence0 = (decoder).readString(((Utf8) oldString0));
        } else {
            charSequence0 = (decoder).readString(null);
        }
        RemovedTypesTestRecord.put(0, charSequence0);
        return RemovedTypesTestRecord;
    }

}
