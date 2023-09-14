/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.avro.fastserde.generated.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class StringableSubRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"StringableSubRecord\",\"namespace\":\"com.linkedin.avro.fastserde.generated.avro\",\"fields\":[{\"name\":\"uriField\",\"type\":{\"type\":\"string\",\"java-class\":\"java.net.URI\"}},{\"name\":\"nullStringIntUnion\",\"type\":[\"null\",\"string\",\"int\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.net.URI uriField;
  @Deprecated public java.lang.Object nullStringIntUnion;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public StringableSubRecord() {}

  /**
   * All-args constructor.
   */
  public StringableSubRecord(java.net.URI uriField, java.lang.Object nullStringIntUnion) {
    this.uriField = uriField;
    this.nullStringIntUnion = nullStringIntUnion;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return uriField;
    case 1: return nullStringIntUnion;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: uriField = (java.net.URI)value$; break;
    case 1: nullStringIntUnion = (java.lang.Object)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'uriField' field.
   */
  public java.net.URI getUriField() {
    return uriField;
  }

  /**
   * Sets the value of the 'uriField' field.
   * @param value the value to set.
   */
  public void setUriField(java.net.URI value) {
    this.uriField = value;
  }

  /**
   * Gets the value of the 'nullStringIntUnion' field.
   */
  public java.lang.Object getNullStringIntUnion() {
    return nullStringIntUnion;
  }

  /**
   * Sets the value of the 'nullStringIntUnion' field.
   * @param value the value to set.
   */
  public void setNullStringIntUnion(java.lang.Object value) {
    this.nullStringIntUnion = value;
  }

  /** Creates a new StringableSubRecord RecordBuilder */
  public static com.linkedin.avro.fastserde.generated.avro.StringableSubRecord.Builder newBuilder() {
    return new com.linkedin.avro.fastserde.generated.avro.StringableSubRecord.Builder();
  }
  
  /** Creates a new StringableSubRecord RecordBuilder by copying an existing Builder */
  public static com.linkedin.avro.fastserde.generated.avro.StringableSubRecord.Builder newBuilder(com.linkedin.avro.fastserde.generated.avro.StringableSubRecord.Builder other) {
    return new com.linkedin.avro.fastserde.generated.avro.StringableSubRecord.Builder(other);
  }
  
  /** Creates a new StringableSubRecord RecordBuilder by copying an existing StringableSubRecord instance */
  public static com.linkedin.avro.fastserde.generated.avro.StringableSubRecord.Builder newBuilder(com.linkedin.avro.fastserde.generated.avro.StringableSubRecord other) {
    return new com.linkedin.avro.fastserde.generated.avro.StringableSubRecord.Builder(other);
  }
  
  /**
   * RecordBuilder for StringableSubRecord instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<StringableSubRecord>
    implements org.apache.avro.data.RecordBuilder<StringableSubRecord> {

    private java.net.URI uriField;
    private java.lang.Object nullStringIntUnion;

    /** Creates a new Builder */
    private Builder() {
      super(com.linkedin.avro.fastserde.generated.avro.StringableSubRecord.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.linkedin.avro.fastserde.generated.avro.StringableSubRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.uriField)) {
        this.uriField = data().deepCopy(fields()[0].schema(), other.uriField);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.nullStringIntUnion)) {
        this.nullStringIntUnion = data().deepCopy(fields()[1].schema(), other.nullStringIntUnion);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing StringableSubRecord instance */
    private Builder(com.linkedin.avro.fastserde.generated.avro.StringableSubRecord other) {
            super(com.linkedin.avro.fastserde.generated.avro.StringableSubRecord.SCHEMA$);
      if (isValidValue(fields()[0], other.uriField)) {
        this.uriField = data().deepCopy(fields()[0].schema(), other.uriField);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.nullStringIntUnion)) {
        this.nullStringIntUnion = data().deepCopy(fields()[1].schema(), other.nullStringIntUnion);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'uriField' field */
    public java.net.URI getUriField() {
      return uriField;
    }
    
    /** Sets the value of the 'uriField' field */
    public com.linkedin.avro.fastserde.generated.avro.StringableSubRecord.Builder setUriField(java.net.URI value) {
      validate(fields()[0], value);
      this.uriField = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'uriField' field has been set */
    public boolean hasUriField() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'uriField' field */
    public com.linkedin.avro.fastserde.generated.avro.StringableSubRecord.Builder clearUriField() {
      uriField = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'nullStringIntUnion' field */
    public java.lang.Object getNullStringIntUnion() {
      return nullStringIntUnion;
    }
    
    /** Sets the value of the 'nullStringIntUnion' field */
    public com.linkedin.avro.fastserde.generated.avro.StringableSubRecord.Builder setNullStringIntUnion(java.lang.Object value) {
      validate(fields()[1], value);
      this.nullStringIntUnion = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'nullStringIntUnion' field has been set */
    public boolean hasNullStringIntUnion() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'nullStringIntUnion' field */
    public com.linkedin.avro.fastserde.generated.avro.StringableSubRecord.Builder clearNullStringIntUnion() {
      nullStringIntUnion = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public StringableSubRecord build() {
      try {
        StringableSubRecord record = new StringableSubRecord();
        record.uriField = fieldSetFlags()[0] ? this.uriField : (java.net.URI) defaultValue(fields()[0]);
        record.nullStringIntUnion = fieldSetFlags()[1] ? this.nullStringIntUnion : (java.lang.Object) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
