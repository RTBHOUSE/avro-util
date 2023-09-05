/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.avro.fastserde.generated.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class AnotherSubRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AnotherSubRecord\",\"namespace\":\"com.linkedin.avro.fastserde.generated.avro\",\"fields\":[{\"name\":\"subRecord\",\"type\":{\"type\":\"record\",\"name\":\"StringableSubRecord\",\"fields\":[{\"name\":\"uriField\",\"type\":{\"type\":\"string\",\"java-class\":\"java.net.URI\"}},{\"name\":\"nullStringIntUnion\",\"type\":[\"null\",\"string\",\"int\"]}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public com.linkedin.avro.fastserde.generated.avro.StringableSubRecord subRecord;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public AnotherSubRecord() {}

  /**
   * All-args constructor.
   */
  public AnotherSubRecord(com.linkedin.avro.fastserde.generated.avro.StringableSubRecord subRecord) {
    this.subRecord = subRecord;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return subRecord;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: subRecord = (com.linkedin.avro.fastserde.generated.avro.StringableSubRecord)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'subRecord' field.
   */
  public com.linkedin.avro.fastserde.generated.avro.StringableSubRecord getSubRecord() {
    return subRecord;
  }

  /**
   * Sets the value of the 'subRecord' field.
   * @param value the value to set.
   */
  public void setSubRecord(com.linkedin.avro.fastserde.generated.avro.StringableSubRecord value) {
    this.subRecord = value;
  }

  /** Creates a new AnotherSubRecord RecordBuilder */
  public static com.linkedin.avro.fastserde.generated.avro.AnotherSubRecord.Builder newBuilder() {
    return new com.linkedin.avro.fastserde.generated.avro.AnotherSubRecord.Builder();
  }
  
  /** Creates a new AnotherSubRecord RecordBuilder by copying an existing Builder */
  public static com.linkedin.avro.fastserde.generated.avro.AnotherSubRecord.Builder newBuilder(com.linkedin.avro.fastserde.generated.avro.AnotherSubRecord.Builder other) {
    return new com.linkedin.avro.fastserde.generated.avro.AnotherSubRecord.Builder(other);
  }
  
  /** Creates a new AnotherSubRecord RecordBuilder by copying an existing AnotherSubRecord instance */
  public static com.linkedin.avro.fastserde.generated.avro.AnotherSubRecord.Builder newBuilder(com.linkedin.avro.fastserde.generated.avro.AnotherSubRecord other) {
    return new com.linkedin.avro.fastserde.generated.avro.AnotherSubRecord.Builder(other);
  }
  
  /**
   * RecordBuilder for AnotherSubRecord instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AnotherSubRecord>
    implements org.apache.avro.data.RecordBuilder<AnotherSubRecord> {

    private com.linkedin.avro.fastserde.generated.avro.StringableSubRecord subRecord;

    /** Creates a new Builder */
    private Builder() {
      super(com.linkedin.avro.fastserde.generated.avro.AnotherSubRecord.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.linkedin.avro.fastserde.generated.avro.AnotherSubRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.subRecord)) {
        this.subRecord = data().deepCopy(fields()[0].schema(), other.subRecord);
        fieldSetFlags()[0] = true;
      }
    }
    
    /** Creates a Builder by copying an existing AnotherSubRecord instance */
    private Builder(com.linkedin.avro.fastserde.generated.avro.AnotherSubRecord other) {
            super(com.linkedin.avro.fastserde.generated.avro.AnotherSubRecord.SCHEMA$);
      if (isValidValue(fields()[0], other.subRecord)) {
        this.subRecord = data().deepCopy(fields()[0].schema(), other.subRecord);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'subRecord' field */
    public com.linkedin.avro.fastserde.generated.avro.StringableSubRecord getSubRecord() {
      return subRecord;
    }
    
    /** Sets the value of the 'subRecord' field */
    public com.linkedin.avro.fastserde.generated.avro.AnotherSubRecord.Builder setSubRecord(com.linkedin.avro.fastserde.generated.avro.StringableSubRecord value) {
      validate(fields()[0], value);
      this.subRecord = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'subRecord' field has been set */
    public boolean hasSubRecord() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'subRecord' field */
    public com.linkedin.avro.fastserde.generated.avro.AnotherSubRecord.Builder clearSubRecord() {
      subRecord = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public AnotherSubRecord build() {
      try {
        AnotherSubRecord record = new AnotherSubRecord();
        record.subRecord = fieldSetFlags()[0] ? this.subRecord : (com.linkedin.avro.fastserde.generated.avro.StringableSubRecord) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}