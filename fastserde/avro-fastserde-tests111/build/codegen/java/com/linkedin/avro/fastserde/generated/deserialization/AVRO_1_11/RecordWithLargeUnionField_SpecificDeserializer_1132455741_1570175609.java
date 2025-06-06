
package com.linkedin.avro.fastserde.generated.deserialization.AVRO_1_11;

import java.io.IOException;
import com.linkedin.avro.fastserde.FastDeserializer;
import com.linkedin.avro.fastserde.customized.DatumReaderCustomization;
import com.linkedin.avro.fastserde.generated.avro.RecordWithLargeUnionField;
import org.apache.avro.AvroTypeException;
import org.apache.avro.Schema;
import org.apache.avro.io.Decoder;
import org.apache.avro.util.Utf8;

public class RecordWithLargeUnionField_SpecificDeserializer_1132455741_1570175609
    implements FastDeserializer<RecordWithLargeUnionField>
{

    private final Schema readerSchema;

    public RecordWithLargeUnionField_SpecificDeserializer_1132455741_1570175609(Schema readerSchema) {
        this.readerSchema = readerSchema;
    }

    public RecordWithLargeUnionField deserialize(RecordWithLargeUnionField reuse, Decoder decoder, DatumReaderCustomization customization)
        throws IOException
    {
        return deserializeRecordWithLargeUnionField0((reuse), (decoder), (customization));
    }

    public RecordWithLargeUnionField deserializeRecordWithLargeUnionField0(Object reuse, Decoder decoder, DatumReaderCustomization customization)
        throws IOException
    {
        RecordWithLargeUnionField recordWithLargeUnionField0;
        if ((reuse)!= null) {
            recordWithLargeUnionField0 = ((RecordWithLargeUnionField)(reuse));
        } else {
            recordWithLargeUnionField0 = new RecordWithLargeUnionField();
        }
        int unionIndex0 = (decoder.readIndex());
        if (unionIndex0 == 0) {
            Utf8 charSequence0;
            Object oldString0 = recordWithLargeUnionField0 .get(0);
            if (oldString0 instanceof Utf8) {
                charSequence0 = (decoder).readString(((Utf8) oldString0));
            } else {
                charSequence0 = (decoder).readString(null);
            }
            recordWithLargeUnionField0 .put(0, charSequence0);
        } else {
            if (unionIndex0 == 1) {
                recordWithLargeUnionField0 .put(0, (decoder.readInt()));
            } else {
                if (unionIndex0 == 2) {
                    throw new AvroTypeException(new StringBuilder().append("Found").append(" \"byt").append("es\", ").append("expec").append("ting ").append("[\"str").append("ing\",").append(" \"int").append("\"]").toString());
                } else {
                    throw new RuntimeException(("Illegal union index for 'unionField': "+ unionIndex0));
                }
            }
        }
        return recordWithLargeUnionField0;
    }

}
