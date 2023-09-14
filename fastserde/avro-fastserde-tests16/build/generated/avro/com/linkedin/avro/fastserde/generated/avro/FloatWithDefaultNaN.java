/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.avro.fastserde.generated.avro;  
@SuppressWarnings("all")
/** Used to verify Utils.getSchemaFingerprint() method */
public class FloatWithDefaultNaN extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FloatWithDefaultNaN\",\"namespace\":\"com.linkedin.avro.fastserde.generated.avro\",\"doc\":\"Used to verify Utils.getSchemaFingerprint() method\",\"fields\":[{\"name\":\"floatWithDefaultNaN\",\"type\":\"float\",\"default\":\"NaN\"}]}");
  @Deprecated public float floatWithDefaultNaN;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return floatWithDefaultNaN;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: floatWithDefaultNaN = (java.lang.Float)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'floatWithDefaultNaN' field.
   */
  public java.lang.Float getFloatWithDefaultNaN() {
    return floatWithDefaultNaN;
  }

  /**
   * Sets the value of the 'floatWithDefaultNaN' field.
   * @param value the value to set.
   */
  public void setFloatWithDefaultNaN(java.lang.Float value) {
    this.floatWithDefaultNaN = value;
  }

  /** Creates a new FloatWithDefaultNaN RecordBuilder */
  public static com.linkedin.avro.fastserde.generated.avro.FloatWithDefaultNaN.Builder newBuilder() {
    return new com.linkedin.avro.fastserde.generated.avro.FloatWithDefaultNaN.Builder();
  }
  
  /** Creates a new FloatWithDefaultNaN RecordBuilder by copying an existing Builder */
  public static com.linkedin.avro.fastserde.generated.avro.FloatWithDefaultNaN.Builder newBuilder(com.linkedin.avro.fastserde.generated.avro.FloatWithDefaultNaN.Builder other) {
    return new com.linkedin.avro.fastserde.generated.avro.FloatWithDefaultNaN.Builder(other);
  }
  
  /** Creates a new FloatWithDefaultNaN RecordBuilder by copying an existing FloatWithDefaultNaN instance */
  public static com.linkedin.avro.fastserde.generated.avro.FloatWithDefaultNaN.Builder newBuilder(com.linkedin.avro.fastserde.generated.avro.FloatWithDefaultNaN other) {
    return new com.linkedin.avro.fastserde.generated.avro.FloatWithDefaultNaN.Builder(other);
  }
  
  /**
   * RecordBuilder for FloatWithDefaultNaN instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FloatWithDefaultNaN>
    implements org.apache.avro.data.RecordBuilder<FloatWithDefaultNaN> {

    private float floatWithDefaultNaN;

    /** Creates a new Builder */
    private Builder() {
      super(com.linkedin.avro.fastserde.generated.avro.FloatWithDefaultNaN.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.linkedin.avro.fastserde.generated.avro.FloatWithDefaultNaN.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing FloatWithDefaultNaN instance */
    private Builder(com.linkedin.avro.fastserde.generated.avro.FloatWithDefaultNaN other) {
            super(com.linkedin.avro.fastserde.generated.avro.FloatWithDefaultNaN.SCHEMA$);
      if (isValidValue(fields()[0], other.floatWithDefaultNaN)) {
        this.floatWithDefaultNaN = (java.lang.Float) data().deepCopy(fields()[0].schema(), other.floatWithDefaultNaN);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'floatWithDefaultNaN' field */
    public java.lang.Float getFloatWithDefaultNaN() {
      return floatWithDefaultNaN;
    }
    
    /** Sets the value of the 'floatWithDefaultNaN' field */
    public com.linkedin.avro.fastserde.generated.avro.FloatWithDefaultNaN.Builder setFloatWithDefaultNaN(float value) {
      validate(fields()[0], value);
      this.floatWithDefaultNaN = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'floatWithDefaultNaN' field has been set */
    public boolean hasFloatWithDefaultNaN() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'floatWithDefaultNaN' field */
    public com.linkedin.avro.fastserde.generated.avro.FloatWithDefaultNaN.Builder clearFloatWithDefaultNaN() {
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public FloatWithDefaultNaN build() {
      try {
        FloatWithDefaultNaN record = new FloatWithDefaultNaN();
        record.floatWithDefaultNaN = fieldSetFlags()[0] ? this.floatWithDefaultNaN : (java.lang.Float) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
