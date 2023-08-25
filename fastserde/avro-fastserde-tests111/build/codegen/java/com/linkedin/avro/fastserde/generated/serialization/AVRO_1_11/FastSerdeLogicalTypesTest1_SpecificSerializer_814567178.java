
package com.linkedin.avro.fastserde.generated.serialization.AVRO_1_11;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import com.linkedin.avro.api.PrimitiveIntList;
import com.linkedin.avro.fastserde.FastSerializer;
import com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1;
import com.linkedin.avro.fastserde.generated.avro.LocalTimestampRecord;
import org.apache.avro.Conversions;
import org.apache.avro.Schema;
import org.apache.avro.io.Encoder;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;

public class FastSerdeLogicalTypesTest1_SpecificSerializer_814567178
    implements FastSerializer<FastSerdeLogicalTypesTest1>
{

    private final SpecificData modelData;
    private final org.apache.avro.data.TimeConversions.DateConversion conversion_date = new org.apache.avro.data.TimeConversions.DateConversion();
    private final org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion conversion_local_timestamp_millis = new org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion();
    private final org.apache.avro.data.TimeConversions.TimeMicrosConversion conversion_time_micros = new org.apache.avro.data.TimeConversions.TimeMicrosConversion();
    private final org.apache.avro.data.TimeConversions.TimestampMicrosConversion conversion_timestamp_micros = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
    private final org.apache.avro.data.TimeConversions.TimeMillisConversion conversion_time_millis = new org.apache.avro.data.TimeConversions.TimeMillisConversion();
    private final Conversions.DecimalConversion conversion_decimal = new Conversions.DecimalConversion();
    private final Conversions.UUIDConversion conversion_uuid = new Conversions.UUIDConversion();
    private final org.apache.avro.data.TimeConversions.TimestampMillisConversion conversion_timestamp_millis = new org.apache.avro.data.TimeConversions.TimestampMillisConversion();
    private final Schema logicalTypeSchema__419105534 = Schema.parse("{\"type\":\"int\",\"logicalType\":\"time-millis\"}");
    private final Schema logicalTypeSchema__59052268 = Schema.parse("{\"type\":\"int\",\"logicalType\":\"date\"}");
    private final Schema logicalTypeSchema_1074306973 = Schema.parse("{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}");
    private final Schema logicalTypeSchema_120893213 = Schema.parse("{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":4,\"scale\":2}");
    private final Schema logicalTypeSchema__1245572876 = Schema.parse("{\"type\":\"string\",\"logicalType\":\"uuid\"}");
    private final Schema logicalTypeSchema__1252781617 = Schema.parse("{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"}");
    private final Schema logicalTypeSchema__1515894331 = Schema.parse("{\"type\":\"long\",\"logicalType\":\"time-micros\"}");
    private final Schema logicalTypeSchema__250645780 = Schema.parse("{\"type\":\"long\",\"logicalType\":\"local-timestamp-millis\"}");

    public FastSerdeLogicalTypesTest1_SpecificSerializer_814567178(SpecificData modelData) {
        this.modelData = modelData;
    }

    public void serialize(FastSerdeLogicalTypesTest1 data, Encoder encoder)
        throws IOException
    {
        serializeFastSerdeLogicalTypesTest10(data, (encoder));
    }

    @SuppressWarnings("unchecked")
    public void serializeFastSerdeLogicalTypesTest10(FastSerdeLogicalTypesTest1 data, Encoder encoder)
        throws IOException
    {
        Object unionOfArrayAndMap0 = ((Object) data.get(0));
        if (unionOfArrayAndMap0 instanceof List) {
            (encoder).writeIndex(0);
            (encoder).writeArrayStart();
            if ((((List<LocalTime> ) unionOfArrayAndMap0) == null)||((List<LocalTime> ) unionOfArrayAndMap0).isEmpty()) {
                (encoder).setItemCount(0);
            } else {
                (encoder).setItemCount(((List<LocalTime> ) unionOfArrayAndMap0).size());
                Object array0 = ((List<LocalTime> ) unionOfArrayAndMap0);
                if (array0 instanceof PrimitiveIntList) {
                    PrimitiveIntList primitiveList0 = ((PrimitiveIntList) array0);
                    for (int counter0 = 0; (counter0 <primitiveList0 .size()); counter0 ++) {
                        (encoder).startItem();
                        Object convertedValue0 = primitiveList0 .getPrimitive(counter0);
                        convertedValue0 = Conversions.convertToRawType(convertedValue0, this.logicalTypeSchema__419105534, this.logicalTypeSchema__419105534 .getLogicalType(), this.conversion_time_millis);
                        (encoder).writeInt(((Integer) convertedValue0));
                    }
                } else {
                    for (int counter1 = 0; (counter1 <((List<LocalTime> ) unionOfArrayAndMap0).size()); counter1 ++) {
                        (encoder).startItem();
                        Object convertedValue1 = ((List<LocalTime> ) unionOfArrayAndMap0).get(counter1);
                        convertedValue1 = Conversions.convertToRawType(convertedValue1, this.logicalTypeSchema__419105534, this.logicalTypeSchema__419105534 .getLogicalType(), this.conversion_time_millis);
                        (encoder).writeInt(((Integer) convertedValue1));
                    }
                }
            }
            (encoder).writeArrayEnd();
        } else {
            if (unionOfArrayAndMap0 instanceof Map) {
                (encoder).writeIndex(1);
                (encoder).writeMapStart();
                if ((((Map<CharSequence, LocalDate> ) unionOfArrayAndMap0) == null)||((Map<CharSequence, LocalDate> ) unionOfArrayAndMap0).isEmpty()) {
                    (encoder).setItemCount(0);
                } else {
                    (encoder).setItemCount(((Map<CharSequence, LocalDate> ) unionOfArrayAndMap0).size());
                    for (CharSequence key0 : ((Map<CharSequence, LocalDate> )((Map<CharSequence, LocalDate> ) unionOfArrayAndMap0)).keySet()) {
                        (encoder).startItem();
                        (encoder).writeString(key0);
                        Object convertedValue2 = ((Map<CharSequence, LocalDate> ) unionOfArrayAndMap0).get(key0);
                        convertedValue2 = Conversions.convertToRawType(convertedValue2, this.logicalTypeSchema__59052268, this.logicalTypeSchema__59052268 .getLogicalType(), this.conversion_date);
                        (encoder).writeInt(((Integer) convertedValue2));
                    }
                }
                (encoder).writeMapEnd();
            }
        }
        Map<CharSequence, Instant> timestampMillisMap0 = ((Map<CharSequence, Instant> ) data.get(1));
        (encoder).writeMapStart();
        if ((timestampMillisMap0 == null)||timestampMillisMap0 .isEmpty()) {
            (encoder).setItemCount(0);
        } else {
            (encoder).setItemCount(timestampMillisMap0 .size());
            for (CharSequence key1 : ((Map<CharSequence, Instant> ) timestampMillisMap0).keySet()) {
                (encoder).startItem();
                (encoder).writeString(key1);
                Object convertedValue3 = timestampMillisMap0 .get(key1);
                convertedValue3 = Conversions.convertToRawType(convertedValue3, this.logicalTypeSchema_1074306973, this.logicalTypeSchema_1074306973 .getLogicalType(), this.conversion_timestamp_millis);
                (encoder).writeLong(((Long) convertedValue3));
            }
        }
        (encoder).writeMapEnd();
        List<LocalDate> nullableArrayOfDates0 = ((List<LocalDate> ) data.get(2));
        if (nullableArrayOfDates0 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (nullableArrayOfDates0 instanceof List) {
                (encoder).writeIndex(1);
                (encoder).writeArrayStart();
                if ((((List<LocalDate> ) nullableArrayOfDates0) == null)||((List<LocalDate> ) nullableArrayOfDates0).isEmpty()) {
                    (encoder).setItemCount(0);
                } else {
                    (encoder).setItemCount(((List<LocalDate> ) nullableArrayOfDates0).size());
                    Object array1 = ((List<LocalDate> ) nullableArrayOfDates0);
                    if (array1 instanceof PrimitiveIntList) {
                        PrimitiveIntList primitiveList1 = ((PrimitiveIntList) array1);
                        for (int counter2 = 0; (counter2 <primitiveList1 .size()); counter2 ++) {
                            (encoder).startItem();
                            Object convertedValue4 = primitiveList1 .getPrimitive(counter2);
                            convertedValue4 = Conversions.convertToRawType(convertedValue4, this.logicalTypeSchema__59052268, this.logicalTypeSchema__59052268 .getLogicalType(), this.conversion_date);
                            (encoder).writeInt(((Integer) convertedValue4));
                        }
                    } else {
                        for (int counter3 = 0; (counter3 <((List<LocalDate> ) nullableArrayOfDates0).size()); counter3 ++) {
                            (encoder).startItem();
                            Object convertedValue5 = ((List<LocalDate> ) nullableArrayOfDates0).get(counter3);
                            convertedValue5 = Conversions.convertToRawType(convertedValue5, this.logicalTypeSchema__59052268, this.logicalTypeSchema__59052268 .getLogicalType(), this.conversion_date);
                            (encoder).writeInt(((Integer) convertedValue5));
                        }
                    }
                }
                (encoder).writeArrayEnd();
            }
        }
        List<LocalDate> arrayOfDates0 = ((List<LocalDate> ) data.get(3));
        (encoder).writeArrayStart();
        if ((arrayOfDates0 == null)||arrayOfDates0 .isEmpty()) {
            (encoder).setItemCount(0);
        } else {
            (encoder).setItemCount(arrayOfDates0 .size());
            Object array2 = arrayOfDates0;
            if (array2 instanceof PrimitiveIntList) {
                PrimitiveIntList primitiveList2 = ((PrimitiveIntList) array2);
                for (int counter4 = 0; (counter4 <primitiveList2 .size()); counter4 ++) {
                    (encoder).startItem();
                    Object convertedValue6 = primitiveList2 .getPrimitive(counter4);
                    convertedValue6 = Conversions.convertToRawType(convertedValue6, this.logicalTypeSchema__59052268, this.logicalTypeSchema__59052268 .getLogicalType(), this.conversion_date);
                    (encoder).writeInt(((Integer) convertedValue6));
                }
            } else {
                for (int counter5 = 0; (counter5 <arrayOfDates0 .size()); counter5 ++) {
                    (encoder).startItem();
                    Object convertedValue7 = arrayOfDates0 .get(counter5);
                    convertedValue7 = Conversions.convertToRawType(convertedValue7, this.logicalTypeSchema__59052268, this.logicalTypeSchema__59052268 .getLogicalType(), this.conversion_date);
                    (encoder).writeInt(((Integer) convertedValue7));
                }
            }
        }
        (encoder).writeArrayEnd();
        Object unionOfDecimalOrDate0 = ((Object) data.get(4));
        if (unionOfDecimalOrDate0 instanceof BigDecimal) {
            (encoder).writeIndex(0);
            Object convertedValue8 = unionOfDecimalOrDate0;
            convertedValue8 = Conversions.convertToRawType(convertedValue8, this.logicalTypeSchema_120893213, this.logicalTypeSchema_120893213 .getLogicalType(), this.conversion_decimal);
            (encoder).writeBytes(((ByteBuffer) convertedValue8));
        } else {
            if (unionOfDecimalOrDate0 instanceof LocalDate) {
                (encoder).writeIndex(1);
                Object convertedValue9 = unionOfDecimalOrDate0;
                convertedValue9 = Conversions.convertToRawType(convertedValue9, this.logicalTypeSchema__59052268, this.logicalTypeSchema__59052268 .getLogicalType(), this.conversion_date);
                (encoder).writeInt(((Integer) convertedValue9));
            }
        }
        Object convertedValue10 = data.get(5);
        convertedValue10 = Conversions.convertToRawType(convertedValue10, this.logicalTypeSchema__1245572876, this.logicalTypeSchema__1245572876 .getLogicalType(), this.conversion_uuid);
        if (((CharSequence) convertedValue10) instanceof Utf8) {
            (encoder).writeString(((Utf8)((CharSequence) convertedValue10)));
        } else {
            (encoder).writeString(((CharSequence) convertedValue10).toString());
        }
        Object convertedValue11 = data.get(6);
        convertedValue11 = Conversions.convertToRawType(convertedValue11, this.logicalTypeSchema_1074306973, this.logicalTypeSchema_1074306973 .getLogicalType(), this.conversion_timestamp_millis);
        (encoder).writeLong(((Long) convertedValue11));
        Object convertedValue12 = data.get(7);
        convertedValue12 = Conversions.convertToRawType(convertedValue12, this.logicalTypeSchema__1252781617, this.logicalTypeSchema__1252781617 .getLogicalType(), this.conversion_timestamp_micros);
        (encoder).writeLong(((Long) convertedValue12));
        Object convertedValue13 = data.get(8);
        convertedValue13 = Conversions.convertToRawType(convertedValue13, this.logicalTypeSchema__419105534, this.logicalTypeSchema__419105534 .getLogicalType(), this.conversion_time_millis);
        (encoder).writeInt(((Integer) convertedValue13));
        Object convertedValue14 = data.get(9);
        convertedValue14 = Conversions.convertToRawType(convertedValue14, this.logicalTypeSchema__1515894331, this.logicalTypeSchema__1515894331 .getLogicalType(), this.conversion_time_micros);
        (encoder).writeLong(((Long) convertedValue14));
        Object convertedValue15 = data.get(10);
        convertedValue15 = Conversions.convertToRawType(convertedValue15, this.logicalTypeSchema__59052268, this.logicalTypeSchema__59052268 .getLogicalType(), this.conversion_date);
        (encoder).writeInt(((Integer) convertedValue15));
        LocalTimestampRecord nestedLocalTimestampMillis0 = ((LocalTimestampRecord) data.get(11));
        serializeLocalTimestampRecord0(nestedLocalTimestampMillis0, (encoder));
    }

    @SuppressWarnings("unchecked")
    public void serializeLocalTimestampRecord0(LocalTimestampRecord data, Encoder encoder)
        throws IOException
    {
        Object convertedValue16 = data.get(0);
        convertedValue16 = Conversions.convertToRawType(convertedValue16, this.logicalTypeSchema__250645780, this.logicalTypeSchema__250645780 .getLogicalType(), this.conversion_local_timestamp_millis);
        (encoder).writeLong(((Long) convertedValue16));
        LocalDateTime nullableNestedTimestamp0 = ((LocalDateTime) data.get(1));
        if (nullableNestedTimestamp0 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            (encoder).writeIndex(1);
            Object convertedValue17 = nullableNestedTimestamp0;
            convertedValue17 = Conversions.convertToRawType(convertedValue17, this.logicalTypeSchema__250645780, this.logicalTypeSchema__250645780 .getLogicalType(), this.conversion_local_timestamp_millis);
            (encoder).writeLong(((Long) convertedValue17));
        }
        Object nullableUnionOfDateAndLocalTimestamp0 = ((Object) data.get(2));
        if (nullableUnionOfDateAndLocalTimestamp0 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (nullableUnionOfDateAndLocalTimestamp0 instanceof LocalDate) {
                (encoder).writeIndex(1);
                Object convertedValue18 = nullableUnionOfDateAndLocalTimestamp0;
                convertedValue18 = Conversions.convertToRawType(convertedValue18, this.logicalTypeSchema__59052268, this.logicalTypeSchema__59052268 .getLogicalType(), this.conversion_date);
                (encoder).writeInt(((Integer) convertedValue18));
            } else {
                if (nullableUnionOfDateAndLocalTimestamp0 instanceof LocalDateTime) {
                    (encoder).writeIndex(2);
                    Object convertedValue19 = nullableUnionOfDateAndLocalTimestamp0;
                    convertedValue19 = Conversions.convertToRawType(convertedValue19, this.logicalTypeSchema__250645780, this.logicalTypeSchema__250645780 .getLogicalType(), this.conversion_local_timestamp_millis);
                    (encoder).writeLong(((Long) convertedValue19));
                }
            }
        }
        Object unionOfDateAndLocalTimestamp0 = ((Object) data.get(3));
        if (unionOfDateAndLocalTimestamp0 instanceof LocalDate) {
            (encoder).writeIndex(0);
            Object convertedValue20 = unionOfDateAndLocalTimestamp0;
            convertedValue20 = Conversions.convertToRawType(convertedValue20, this.logicalTypeSchema__59052268, this.logicalTypeSchema__59052268 .getLogicalType(), this.conversion_date);
            (encoder).writeInt(((Integer) convertedValue20));
        } else {
            if (unionOfDateAndLocalTimestamp0 instanceof LocalDateTime) {
                (encoder).writeIndex(1);
                Object convertedValue21 = unionOfDateAndLocalTimestamp0;
                convertedValue21 = Conversions.convertToRawType(convertedValue21, this.logicalTypeSchema__250645780, this.logicalTypeSchema__250645780 .getLogicalType(), this.conversion_local_timestamp_millis);
                (encoder).writeLong(((Long) convertedValue21));
            }
        }
    }

}
