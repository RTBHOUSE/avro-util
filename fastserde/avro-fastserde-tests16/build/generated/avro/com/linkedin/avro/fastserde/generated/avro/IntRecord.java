/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.avro.fastserde.generated.avro;  
@SuppressWarnings("all")
public class IntRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"IntRecord\",\"namespace\":\"com.linkedin.avro.fastserde.generated.avro\",\"fields\":[{\"name\":\"field2\",\"type\":[\"null\",\"int\"],\"default\":null}],\"aliases\":[\"FullRecord\"]}");
  @Deprecated public java.lang.Integer field2;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return field2;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: field2 = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'field2' field.
   */
  public java.lang.Integer getField2() {
    return field2;
  }

  /**
   * Sets the value of the 'field2' field.
   * @param value the value to set.
   */
  public void setField2(java.lang.Integer value) {
    this.field2 = value;
  }

  /** Creates a new IntRecord RecordBuilder */
  public static com.linkedin.avro.fastserde.generated.avro.IntRecord.Builder newBuilder() {
    return new com.linkedin.avro.fastserde.generated.avro.IntRecord.Builder();
  }
  
  /** Creates a new IntRecord RecordBuilder by copying an existing Builder */
  public static com.linkedin.avro.fastserde.generated.avro.IntRecord.Builder newBuilder(com.linkedin.avro.fastserde.generated.avro.IntRecord.Builder other) {
    return new com.linkedin.avro.fastserde.generated.avro.IntRecord.Builder(other);
  }
  
  /** Creates a new IntRecord RecordBuilder by copying an existing IntRecord instance */
  public static com.linkedin.avro.fastserde.generated.avro.IntRecord.Builder newBuilder(com.linkedin.avro.fastserde.generated.avro.IntRecord other) {
    return new com.linkedin.avro.fastserde.generated.avro.IntRecord.Builder(other);
  }
  
  /**
   * RecordBuilder for IntRecord instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<IntRecord>
    implements org.apache.avro.data.RecordBuilder<IntRecord> {

    private java.lang.Integer field2;

    /** Creates a new Builder */
    private Builder() {
      super(com.linkedin.avro.fastserde.generated.avro.IntRecord.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.linkedin.avro.fastserde.generated.avro.IntRecord.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing IntRecord instance */
    private Builder(com.linkedin.avro.fastserde.generated.avro.IntRecord other) {
            super(com.linkedin.avro.fastserde.generated.avro.IntRecord.SCHEMA$);
      if (isValidValue(fields()[0], other.field2)) {
        this.field2 = (java.lang.Integer) data().deepCopy(fields()[0].schema(), other.field2);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'field2' field */
    public java.lang.Integer getField2() {
      return field2;
    }
    
    /** Sets the value of the 'field2' field */
    public com.linkedin.avro.fastserde.generated.avro.IntRecord.Builder setField2(java.lang.Integer value) {
      validate(fields()[0], value);
      this.field2 = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'field2' field has been set */
    public boolean hasField2() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'field2' field */
    public com.linkedin.avro.fastserde.generated.avro.IntRecord.Builder clearField2() {
      field2 = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public IntRecord build() {
      try {
        IntRecord record = new IntRecord();
        record.field2 = fieldSetFlags()[0] ? this.field2 : (java.lang.Integer) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}