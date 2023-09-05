
package com.linkedin.avro.fastserde.generated.serialization.AVRO_1_4;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import com.linkedin.avro.fastserde.FastSerializer;
import org.apache.avro.Schema;
import org.apache.avro.generic.IndexedRecord;
import org.apache.avro.io.Encoder;

public class FastSerdeEnums_GenericSerializer_808559686
    implements FastSerializer<IndexedRecord>
{

    private final Schema justSimpleEnumEnumSchema0 = Schema.parse("{\"type\":\"enum\",\"name\":\"JustSimpleEnum\",\"namespace\":\"com.linkedin.avro.fastserde.generated.avro\",\"symbols\":[\"E1\",\"E2\",\"E3\",\"E4\",\"E5\"]}");

    public void serialize(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        serializeFastSerdeEnums0(data, (encoder));
    }

    @SuppressWarnings("unchecked")
    public void serializeFastSerdeEnums0(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        (encoder).writeEnum(justSimpleEnumEnumSchema0 .getEnumOrdinal(((org.apache.avro.generic.GenericData.EnumSymbol) data.get(0)).toString()));
        List<org.apache.avro.generic.GenericData.EnumSymbol> arrayOfEnums0 = ((List<org.apache.avro.generic.GenericData.EnumSymbol> ) data.get(1));
        if (arrayOfEnums0 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (arrayOfEnums0 instanceof List) {
                (encoder).writeIndex(1);
                (encoder).writeArrayStart();
                if ((((List<org.apache.avro.generic.GenericData.EnumSymbol> ) arrayOfEnums0) == null)||((List<org.apache.avro.generic.GenericData.EnumSymbol> ) arrayOfEnums0).isEmpty()) {
                    (encoder).setItemCount(0);
                } else {
                    (encoder).setItemCount(((List<org.apache.avro.generic.GenericData.EnumSymbol> ) arrayOfEnums0).size());
                    for (int counter0 = 0; (counter0 <((List<org.apache.avro.generic.GenericData.EnumSymbol> ) arrayOfEnums0).size()); counter0 ++) {
                        (encoder).startItem();
                        (encoder).writeEnum(justSimpleEnumEnumSchema0 .getEnumOrdinal(((org.apache.avro.generic.GenericData.EnumSymbol)((List<org.apache.avro.generic.GenericData.EnumSymbol> ) arrayOfEnums0).get(counter0)).toString()));
                    }
                }
                (encoder).writeArrayEnd();
            }
        }
        Map<CharSequence, org.apache.avro.generic.GenericData.EnumSymbol> mapOfEnums0 = ((Map<CharSequence, org.apache.avro.generic.GenericData.EnumSymbol> ) data.get(2));
        (encoder).writeMapStart();
        if ((mapOfEnums0 == null)||mapOfEnums0 .isEmpty()) {
            (encoder).setItemCount(0);
        } else {
            (encoder).setItemCount(mapOfEnums0 .size());
            for (CharSequence key0 : ((Map<CharSequence, org.apache.avro.generic.GenericData.EnumSymbol> ) mapOfEnums0).keySet()) {
                (encoder).startItem();
                (encoder).writeString(key0);
                (encoder).writeEnum(justSimpleEnumEnumSchema0 .getEnumOrdinal(((org.apache.avro.generic.GenericData.EnumSymbol) mapOfEnums0 .get(key0)).toString()));
            }
        }
        (encoder).writeMapEnd();
    }

}
