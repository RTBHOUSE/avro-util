/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.avro.fastserde.generated.avro;

@SuppressWarnings("all")
/** Used in tests to confirm fast-serde supports logical-types */
public class FastSerdeLogicalTypesTest1 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"FastSerdeLogicalTypesTest1\",\"namespace\":\"com.linkedin.avro.fastserde.generated.avro\",\"fields\":[{\"name\":\"unionOfArrayAndMap\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"int\",\"logicalType\":\"time-millis\"}},{\"type\":\"map\",\"values\":{\"type\":\"int\",\"logicalType\":\"date\"}}]},{\"name\":\"mapOfUnionsOfDateAndTimestampMillis\",\"type\":{\"type\":\"map\",\"values\":[{\"type\":\"int\",\"logicalType\":\"date\"},{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}]}},{\"name\":\"timestampMillisMap\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}}},{\"name\":\"nullableArrayOfDates\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"int\",\"logicalType\":\"date\"}}],\"default\":null},{\"name\":\"arrayOfDates\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"int\",\"logicalType\":\"date\"}}},{\"name\":\"unionOfDecimalOrDate\",\"type\":[{\"type\":\"bytes\",\"logicalType\":\"decimal\"},{\"type\":\"int\",\"logicalType\":\"date\"}]},{\"name\":\"uuidField\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"timestampMillisField\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}},{\"name\":\"timestampMicrosField\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"}},{\"name\":\"timeMillisField\",\"type\":{\"type\":\"int\",\"logicalType\":\"time-millis\"}},{\"name\":\"timeMicrosField\",\"type\":{\"type\":\"long\",\"logicalType\":\"time-micros\"}},{\"name\":\"dateField\",\"type\":{\"type\":\"int\",\"logicalType\":\"date\"}},{\"name\":\"nestedLocalTimestampMillis\",\"type\":{\"type\":\"record\",\"name\":\"LocalTimestampRecord\",\"fields\":[{\"name\":\"nestedTimestamp\",\"type\":{\"type\":\"long\",\"logicalType\":\"local-timestamp-millis\"}},{\"name\":\"nullableNestedTimestamp\",\"type\":[\"null\",{\"type\":\"long\",\"logicalType\":\"local-timestamp-millis\"}]},{\"name\":\"nullableUnionOfDateAndLocalTimestamp\",\"type\":[\"null\",{\"type\":\"int\",\"logicalType\":\"date\"},{\"type\":\"long\",\"logicalType\":\"local-timestamp-millis\"}]},{\"name\":\"unionOfDateAndLocalTimestamp\",\"type\":[{\"type\":\"int\",\"logicalType\":\"date\"},{\"type\":\"long\",\"logicalType\":\"local-timestamp-millis\"}]}]}}]}");
  public java.lang.Object unionOfArrayAndMap;
  public java.util.Map<java.lang.CharSequence,java.lang.Object> mapOfUnionsOfDateAndTimestampMillis;
  public java.util.Map<java.lang.CharSequence,java.lang.Long> timestampMillisMap;
  public java.util.List<java.lang.Integer> nullableArrayOfDates;
  public java.util.List<java.lang.Integer> arrayOfDates;
  public java.lang.Object unionOfDecimalOrDate;
  public java.lang.CharSequence uuidField;
  public long timestampMillisField;
  public long timestampMicrosField;
  public int timeMillisField;
  public long timeMicrosField;
  public int dateField;
  public com.linkedin.avro.fastserde.generated.avro.LocalTimestampRecord nestedLocalTimestampMillis;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return unionOfArrayAndMap;
    case 1: return mapOfUnionsOfDateAndTimestampMillis;
    case 2: return timestampMillisMap;
    case 3: return nullableArrayOfDates;
    case 4: return arrayOfDates;
    case 5: return unionOfDecimalOrDate;
    case 6: return uuidField;
    case 7: return timestampMillisField;
    case 8: return timestampMicrosField;
    case 9: return timeMillisField;
    case 10: return timeMicrosField;
    case 11: return dateField;
    case 12: return nestedLocalTimestampMillis;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: unionOfArrayAndMap = (java.lang.Object)value$; break;
    case 1: mapOfUnionsOfDateAndTimestampMillis = (java.util.Map<java.lang.CharSequence,java.lang.Object>)value$; break;
    case 2: timestampMillisMap = (java.util.Map<java.lang.CharSequence,java.lang.Long>)value$; break;
    case 3: nullableArrayOfDates = (java.util.List<java.lang.Integer>)value$; break;
    case 4: arrayOfDates = (java.util.List<java.lang.Integer>)value$; break;
    case 5: unionOfDecimalOrDate = (java.lang.Object)value$; break;
    case 6: uuidField = (java.lang.CharSequence)value$; break;
    case 7: timestampMillisField = (java.lang.Long)value$; break;
    case 8: timestampMicrosField = (java.lang.Long)value$; break;
    case 9: timeMillisField = (java.lang.Integer)value$; break;
    case 10: timeMicrosField = (java.lang.Long)value$; break;
    case 11: dateField = (java.lang.Integer)value$; break;
    case 12: nestedLocalTimestampMillis = (com.linkedin.avro.fastserde.generated.avro.LocalTimestampRecord)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}
