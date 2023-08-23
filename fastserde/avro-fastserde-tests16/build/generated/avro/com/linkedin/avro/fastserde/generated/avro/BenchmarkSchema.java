/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.avro.fastserde.generated.avro;  
@SuppressWarnings("all")
/** JMH micro benchmark schema template */
public class BenchmarkSchema extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"BenchmarkSchema\",\"namespace\":\"com.linkedin.avro.fastserde.generated.avro\",\"doc\":\"JMH micro benchmark schema template\",\"fields\":[{\"name\":\"testArray\",\"type\":{\"type\":\"array\",\"items\":\"double\"}}]}");
  @Deprecated public java.util.List<java.lang.Double> testArray;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return testArray;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: testArray = (java.util.List<java.lang.Double>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'testArray' field.
   */
  public java.util.List<java.lang.Double> getTestArray() {
    return testArray;
  }

  /**
   * Sets the value of the 'testArray' field.
   * @param value the value to set.
   */
  public void setTestArray(java.util.List<java.lang.Double> value) {
    this.testArray = value;
  }

  /** Creates a new BenchmarkSchema RecordBuilder */
  public static com.linkedin.avro.fastserde.generated.avro.BenchmarkSchema.Builder newBuilder() {
    return new com.linkedin.avro.fastserde.generated.avro.BenchmarkSchema.Builder();
  }
  
  /** Creates a new BenchmarkSchema RecordBuilder by copying an existing Builder */
  public static com.linkedin.avro.fastserde.generated.avro.BenchmarkSchema.Builder newBuilder(com.linkedin.avro.fastserde.generated.avro.BenchmarkSchema.Builder other) {
    return new com.linkedin.avro.fastserde.generated.avro.BenchmarkSchema.Builder(other);
  }
  
  /** Creates a new BenchmarkSchema RecordBuilder by copying an existing BenchmarkSchema instance */
  public static com.linkedin.avro.fastserde.generated.avro.BenchmarkSchema.Builder newBuilder(com.linkedin.avro.fastserde.generated.avro.BenchmarkSchema other) {
    return new com.linkedin.avro.fastserde.generated.avro.BenchmarkSchema.Builder(other);
  }
  
  /**
   * RecordBuilder for BenchmarkSchema instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<BenchmarkSchema>
    implements org.apache.avro.data.RecordBuilder<BenchmarkSchema> {

    private java.util.List<java.lang.Double> testArray;

    /** Creates a new Builder */
    private Builder() {
      super(com.linkedin.avro.fastserde.generated.avro.BenchmarkSchema.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.linkedin.avro.fastserde.generated.avro.BenchmarkSchema.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing BenchmarkSchema instance */
    private Builder(com.linkedin.avro.fastserde.generated.avro.BenchmarkSchema other) {
            super(com.linkedin.avro.fastserde.generated.avro.BenchmarkSchema.SCHEMA$);
      if (isValidValue(fields()[0], other.testArray)) {
        this.testArray = (java.util.List<java.lang.Double>) data().deepCopy(fields()[0].schema(), other.testArray);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'testArray' field */
    public java.util.List<java.lang.Double> getTestArray() {
      return testArray;
    }
    
    /** Sets the value of the 'testArray' field */
    public com.linkedin.avro.fastserde.generated.avro.BenchmarkSchema.Builder setTestArray(java.util.List<java.lang.Double> value) {
      validate(fields()[0], value);
      this.testArray = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'testArray' field has been set */
    public boolean hasTestArray() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'testArray' field */
    public com.linkedin.avro.fastserde.generated.avro.BenchmarkSchema.Builder clearTestArray() {
      testArray = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public BenchmarkSchema build() {
      try {
        BenchmarkSchema record = new BenchmarkSchema();
        record.testArray = fieldSetFlags()[0] ? this.testArray : (java.util.List<java.lang.Double>) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
