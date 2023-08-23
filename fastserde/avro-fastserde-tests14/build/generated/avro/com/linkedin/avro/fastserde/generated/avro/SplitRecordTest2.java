/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.avro.fastserde.generated.avro;

@SuppressWarnings("all")
public class SplitRecordTest2 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"SplitRecordTest2\",\"namespace\":\"com.linkedin.avro.fastserde.generated.avro\",\"fields\":[{\"name\":\"record1\",\"type\":{\"type\":\"record\",\"name\":\"StringRecord\",\"fields\":[{\"name\":\"field1\",\"type\":[\"null\",\"string\"],\"default\":null}],\"aliases\":[\"FullRecord\"]}},{\"name\":\"record2\",\"type\":{\"type\":\"record\",\"name\":\"IntRecord\",\"fields\":[{\"name\":\"field2\",\"type\":[\"null\",\"int\"],\"default\":null}],\"aliases\":[\"FullRecord\"]}},{\"name\":\"record3\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"FullRecord\",\"fields\":[{\"name\":\"field1\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"field2\",\"type\":[\"null\",\"int\"],\"default\":null}]}}}],\"aliases\":[\"SplitRecordTest1\"]}");
  public com.linkedin.avro.fastserde.generated.avro.StringRecord record1;
  public com.linkedin.avro.fastserde.generated.avro.IntRecord record2;
  public java.util.List<com.linkedin.avro.fastserde.generated.avro.FullRecord> record3;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return record1;
    case 1: return record2;
    case 2: return record3;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: record1 = (com.linkedin.avro.fastserde.generated.avro.StringRecord)value$; break;
    case 1: record2 = (com.linkedin.avro.fastserde.generated.avro.IntRecord)value$; break;
    case 2: record3 = (java.util.List<com.linkedin.avro.fastserde.generated.avro.FullRecord>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}
