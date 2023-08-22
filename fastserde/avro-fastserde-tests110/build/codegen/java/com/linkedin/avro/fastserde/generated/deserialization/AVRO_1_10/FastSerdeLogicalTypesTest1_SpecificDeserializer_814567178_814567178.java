
package com.linkedin.avro.fastserde.generated.deserialization.AVRO_1_10;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import com.linkedin.avro.api.PrimitiveIntList;
import com.linkedin.avro.fastserde.FastDeserializer;
import com.linkedin.avro.fastserde.primitive.PrimitiveIntArrayList;
import org.apache.avro.Schema;
import org.apache.avro.io.Decoder;
import org.apache.avro.util.Utf8;

public class FastSerdeLogicalTypesTest1_SpecificDeserializer_814567178_814567178
    implements FastDeserializer<com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1>
{

    private final Schema readerSchema;

    public FastSerdeLogicalTypesTest1_SpecificDeserializer_814567178_814567178(Schema readerSchema) {
        this.readerSchema = readerSchema;
    }

    public com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1 deserialize(com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1 reuse, Decoder decoder)
        throws IOException
    {
        return deserializeFastSerdeLogicalTypesTest10((reuse), (decoder));
    }

    public com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1 deserializeFastSerdeLogicalTypesTest10(Object reuse, Decoder decoder)
        throws IOException
    {
        com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1 FastSerdeLogicalTypesTest1;
        if ((reuse)!= null) {
            FastSerdeLogicalTypesTest1 = ((com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1)(reuse));
        } else {
            FastSerdeLogicalTypesTest1 = new com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1();
        }
        int unionIndex0 = (decoder.readIndex());
        if (unionIndex0 == 0) {
            PrimitiveIntList unionOfArrayAndMapOption0 = null;
            long chunkLen0 = (decoder.readArrayStart());
            Object oldArray0 = FastSerdeLogicalTypesTest1 .get(0);
            if (oldArray0 instanceof PrimitiveIntList) {
                unionOfArrayAndMapOption0 = ((PrimitiveIntList) oldArray0);
                unionOfArrayAndMapOption0 .clear();
            } else {
                unionOfArrayAndMapOption0 = new PrimitiveIntArrayList(((int) chunkLen0));
            }
            while (chunkLen0 > 0) {
                for (int counter0 = 0; (counter0 <chunkLen0); counter0 ++) {
                    unionOfArrayAndMapOption0 .addPrimitive((decoder.readInt()));
                }
                chunkLen0 = (decoder.arrayNext());
            }
            FastSerdeLogicalTypesTest1 .put(0, unionOfArrayAndMapOption0);
        } else {
            if (unionIndex0 == 1) {
                Map<Utf8, Integer> unionOfArrayAndMapOption1 = null;
                long chunkLen1 = (decoder.readMapStart());
                if (chunkLen1 > 0) {
                    Map<Utf8, Integer> unionOfArrayAndMapOptionReuse0 = null;
                    Object oldMap0 = FastSerdeLogicalTypesTest1 .get(0);
                    if (oldMap0 instanceof Map) {
                        unionOfArrayAndMapOptionReuse0 = ((Map) oldMap0);
                    }
                    if (unionOfArrayAndMapOptionReuse0 != (null)) {
                        unionOfArrayAndMapOptionReuse0 .clear();
                        unionOfArrayAndMapOption1 = unionOfArrayAndMapOptionReuse0;
                    } else {
                        unionOfArrayAndMapOption1 = new HashMap<Utf8, Integer>(((int)(((chunkLen1 * 4)+ 2)/ 3)));
                    }
                    do {
                        for (int counter1 = 0; (counter1 <chunkLen1); counter1 ++) {
                            Utf8 key0 = (decoder.readString(null));
                            unionOfArrayAndMapOption1 .put(key0, (decoder.readInt()));
                        }
                        chunkLen1 = (decoder.mapNext());
                    } while (chunkLen1 > 0);
                } else {
                    unionOfArrayAndMapOption1 = new HashMap<Utf8, Integer>(0);
                }
                FastSerdeLogicalTypesTest1 .put(0, unionOfArrayAndMapOption1);
            } else {
                throw new RuntimeException(("Illegal union index for 'unionOfArrayAndMap': "+ unionIndex0));
            }
        }
        populate_FastSerdeLogicalTypesTest10((FastSerdeLogicalTypesTest1), (decoder));
        populate_FastSerdeLogicalTypesTest11((FastSerdeLogicalTypesTest1), (decoder));
        populate_FastSerdeLogicalTypesTest12((FastSerdeLogicalTypesTest1), (decoder));
        populate_FastSerdeLogicalTypesTest13((FastSerdeLogicalTypesTest1), (decoder));
        populate_FastSerdeLogicalTypesTest14((FastSerdeLogicalTypesTest1), (decoder));
        populate_FastSerdeLogicalTypesTest15((FastSerdeLogicalTypesTest1), (decoder));
        return FastSerdeLogicalTypesTest1;
    }

    private void populate_FastSerdeLogicalTypesTest10(com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1 FastSerdeLogicalTypesTest1, Decoder decoder)
        throws IOException
    {
        Map<Utf8, Long> timestampMillisMap0 = null;
        long chunkLen2 = (decoder.readMapStart());
        if (chunkLen2 > 0) {
            Map<Utf8, Long> timestampMillisMapReuse0 = null;
            Object oldMap1 = FastSerdeLogicalTypesTest1 .get(1);
            if (oldMap1 instanceof Map) {
                timestampMillisMapReuse0 = ((Map) oldMap1);
            }
            if (timestampMillisMapReuse0 != (null)) {
                timestampMillisMapReuse0 .clear();
                timestampMillisMap0 = timestampMillisMapReuse0;
            } else {
                timestampMillisMap0 = new HashMap<Utf8, Long>(((int)(((chunkLen2 * 4)+ 2)/ 3)));
            }
            do {
                for (int counter2 = 0; (counter2 <chunkLen2); counter2 ++) {
                    Utf8 key1 = (decoder.readString(null));
                    timestampMillisMap0 .put(key1, (decoder.readLong()));
                }
                chunkLen2 = (decoder.mapNext());
            } while (chunkLen2 > 0);
        } else {
            timestampMillisMap0 = new HashMap<Utf8, Long>(0);
        }
        FastSerdeLogicalTypesTest1 .put(1, timestampMillisMap0);
        int unionIndex1 = (decoder.readIndex());
        if (unionIndex1 == 0) {
            decoder.readNull();
            FastSerdeLogicalTypesTest1 .put(2, null);
        } else {
            if (unionIndex1 == 1) {
                PrimitiveIntList nullableArrayOfDatesOption0 = null;
                long chunkLen3 = (decoder.readArrayStart());
                Object oldArray1 = FastSerdeLogicalTypesTest1 .get(2);
                if (oldArray1 instanceof PrimitiveIntList) {
                    nullableArrayOfDatesOption0 = ((PrimitiveIntList) oldArray1);
                    nullableArrayOfDatesOption0 .clear();
                } else {
                    nullableArrayOfDatesOption0 = new PrimitiveIntArrayList(((int) chunkLen3));
                }
                while (chunkLen3 > 0) {
                    for (int counter3 = 0; (counter3 <chunkLen3); counter3 ++) {
                        nullableArrayOfDatesOption0 .addPrimitive((decoder.readInt()));
                    }
                    chunkLen3 = (decoder.arrayNext());
                }
                FastSerdeLogicalTypesTest1 .put(2, nullableArrayOfDatesOption0);
            } else {
                throw new RuntimeException(("Illegal union index for 'nullableArrayOfDates': "+ unionIndex1));
            }
        }
    }

    private void populate_FastSerdeLogicalTypesTest11(com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1 FastSerdeLogicalTypesTest1, Decoder decoder)
        throws IOException
    {
        PrimitiveIntList arrayOfDates0 = null;
        long chunkLen4 = (decoder.readArrayStart());
        Object oldArray2 = FastSerdeLogicalTypesTest1 .get(3);
        if (oldArray2 instanceof PrimitiveIntList) {
            arrayOfDates0 = ((PrimitiveIntList) oldArray2);
            arrayOfDates0 .clear();
        } else {
            arrayOfDates0 = new PrimitiveIntArrayList(((int) chunkLen4));
        }
        while (chunkLen4 > 0) {
            for (int counter4 = 0; (counter4 <chunkLen4); counter4 ++) {
                arrayOfDates0 .addPrimitive((decoder.readInt()));
            }
            chunkLen4 = (decoder.arrayNext());
        }
        FastSerdeLogicalTypesTest1 .put(3, arrayOfDates0);
        int unionIndex2 = (decoder.readIndex());
        if (unionIndex2 == 0) {
            Object oldBytes0 = FastSerdeLogicalTypesTest1 .get(4);
            if (oldBytes0 instanceof ByteBuffer) {
                FastSerdeLogicalTypesTest1 .put(4, (decoder).readBytes(((ByteBuffer) oldBytes0)));
            } else {
                FastSerdeLogicalTypesTest1 .put(4, (decoder).readBytes((null)));
            }
        } else {
            if (unionIndex2 == 1) {
                FastSerdeLogicalTypesTest1 .put(4, (decoder.readInt()));
            } else {
                throw new RuntimeException(("Illegal union index for 'unionOfDecimalOrDate': "+ unionIndex2));
            }
        }
    }

    private void populate_FastSerdeLogicalTypesTest12(com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1 FastSerdeLogicalTypesTest1, Decoder decoder)
        throws IOException
    {
        Object oldString0 = FastSerdeLogicalTypesTest1 .get(5);
        if (oldString0 instanceof Utf8) {
            FastSerdeLogicalTypesTest1 .put(5, (decoder).readString(((Utf8) oldString0)));
        } else {
            FastSerdeLogicalTypesTest1 .put(5, (decoder).readString(null));
        }
        FastSerdeLogicalTypesTest1 .put(6, (decoder.readLong()));
    }

    private void populate_FastSerdeLogicalTypesTest13(com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1 FastSerdeLogicalTypesTest1, Decoder decoder)
        throws IOException
    {
        FastSerdeLogicalTypesTest1 .put(7, (decoder.readLong()));
        FastSerdeLogicalTypesTest1 .put(8, (decoder.readInt()));
    }

    private void populate_FastSerdeLogicalTypesTest14(com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1 FastSerdeLogicalTypesTest1, Decoder decoder)
        throws IOException
    {
        FastSerdeLogicalTypesTest1 .put(9, (decoder.readLong()));
        FastSerdeLogicalTypesTest1 .put(10, (decoder.readInt()));
    }

    private void populate_FastSerdeLogicalTypesTest15(com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1 FastSerdeLogicalTypesTest1, Decoder decoder)
        throws IOException
    {
        FastSerdeLogicalTypesTest1 .put(11, deserializeLocalTimestampRecord0(FastSerdeLogicalTypesTest1 .get(11), (decoder)));
    }

    public com.linkedin.avro.fastserde.generated.avro.LocalTimestampRecord deserializeLocalTimestampRecord0(Object reuse, Decoder decoder)
        throws IOException
    {
        com.linkedin.avro.fastserde.generated.avro.LocalTimestampRecord LocalTimestampRecord;
        if ((reuse)!= null) {
            LocalTimestampRecord = ((com.linkedin.avro.fastserde.generated.avro.LocalTimestampRecord)(reuse));
        } else {
            LocalTimestampRecord = new com.linkedin.avro.fastserde.generated.avro.LocalTimestampRecord();
        }
        LocalTimestampRecord.put(0, (decoder.readLong()));
        populate_LocalTimestampRecord0((LocalTimestampRecord), (decoder));
        populate_LocalTimestampRecord1((LocalTimestampRecord), (decoder));
        return LocalTimestampRecord;
    }

    private void populate_LocalTimestampRecord0(com.linkedin.avro.fastserde.generated.avro.LocalTimestampRecord LocalTimestampRecord, Decoder decoder)
        throws IOException
    {
        int unionIndex3 = (decoder.readIndex());
        if (unionIndex3 == 0) {
            decoder.readNull();
            LocalTimestampRecord.put(1, null);
        } else {
            if (unionIndex3 == 1) {
                LocalTimestampRecord.put(1, (decoder.readLong()));
            } else {
                throw new RuntimeException(("Illegal union index for 'nullableNestedTimestamp': "+ unionIndex3));
            }
        }
        int unionIndex4 = (decoder.readIndex());
        if (unionIndex4 == 0) {
            decoder.readNull();
            LocalTimestampRecord.put(2, null);
        } else {
            if (unionIndex4 == 1) {
                LocalTimestampRecord.put(2, (decoder.readInt()));
            } else {
                if (unionIndex4 == 2) {
                    LocalTimestampRecord.put(2, (decoder.readLong()));
                } else {
                    throw new RuntimeException(("Illegal union index for 'nullableUnionOfDateAndLocalTimestamp': "+ unionIndex4));
                }
            }
        }
    }

    private void populate_LocalTimestampRecord1(com.linkedin.avro.fastserde.generated.avro.LocalTimestampRecord LocalTimestampRecord, Decoder decoder)
        throws IOException
    {
        int unionIndex5 = (decoder.readIndex());
        if (unionIndex5 == 0) {
            LocalTimestampRecord.put(3, (decoder.readInt()));
        } else {
            if (unionIndex5 == 1) {
                LocalTimestampRecord.put(3, (decoder.readLong()));
            } else {
                throw new RuntimeException(("Illegal union index for 'unionOfDateAndLocalTimestamp': "+ unionIndex5));
            }
        }
    }

}