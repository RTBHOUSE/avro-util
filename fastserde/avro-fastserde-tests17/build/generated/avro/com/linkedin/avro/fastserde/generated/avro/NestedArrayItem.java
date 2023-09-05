/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.avro.fastserde.generated.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class NestedArrayItem extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"NestedArrayItem\",\"namespace\":\"com.linkedin.avro.fastserde.generated.avro\",\"fields\":[{\"name\":\"ItemName\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence ItemName;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public NestedArrayItem() {}

  /**
   * All-args constructor.
   */
  public NestedArrayItem(java.lang.CharSequence ItemName) {
    this.ItemName = ItemName;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return ItemName;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: ItemName = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'ItemName' field.
   */
  public java.lang.CharSequence getItemName() {
    return ItemName;
  }

  /**
   * Sets the value of the 'ItemName' field.
   * @param value the value to set.
   */
  public void setItemName(java.lang.CharSequence value) {
    this.ItemName = value;
  }

  /** Creates a new NestedArrayItem RecordBuilder */
  public static com.linkedin.avro.fastserde.generated.avro.NestedArrayItem.Builder newBuilder() {
    return new com.linkedin.avro.fastserde.generated.avro.NestedArrayItem.Builder();
  }
  
  /** Creates a new NestedArrayItem RecordBuilder by copying an existing Builder */
  public static com.linkedin.avro.fastserde.generated.avro.NestedArrayItem.Builder newBuilder(com.linkedin.avro.fastserde.generated.avro.NestedArrayItem.Builder other) {
    return new com.linkedin.avro.fastserde.generated.avro.NestedArrayItem.Builder(other);
  }
  
  /** Creates a new NestedArrayItem RecordBuilder by copying an existing NestedArrayItem instance */
  public static com.linkedin.avro.fastserde.generated.avro.NestedArrayItem.Builder newBuilder(com.linkedin.avro.fastserde.generated.avro.NestedArrayItem other) {
    return new com.linkedin.avro.fastserde.generated.avro.NestedArrayItem.Builder(other);
  }
  
  /**
   * RecordBuilder for NestedArrayItem instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<NestedArrayItem>
    implements org.apache.avro.data.RecordBuilder<NestedArrayItem> {

    private java.lang.CharSequence ItemName;

    /** Creates a new Builder */
    private Builder() {
      super(com.linkedin.avro.fastserde.generated.avro.NestedArrayItem.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.linkedin.avro.fastserde.generated.avro.NestedArrayItem.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.ItemName)) {
        this.ItemName = data().deepCopy(fields()[0].schema(), other.ItemName);
        fieldSetFlags()[0] = true;
      }
    }
    
    /** Creates a Builder by copying an existing NestedArrayItem instance */
    private Builder(com.linkedin.avro.fastserde.generated.avro.NestedArrayItem other) {
            super(com.linkedin.avro.fastserde.generated.avro.NestedArrayItem.SCHEMA$);
      if (isValidValue(fields()[0], other.ItemName)) {
        this.ItemName = data().deepCopy(fields()[0].schema(), other.ItemName);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'ItemName' field */
    public java.lang.CharSequence getItemName() {
      return ItemName;
    }
    
    /** Sets the value of the 'ItemName' field */
    public com.linkedin.avro.fastserde.generated.avro.NestedArrayItem.Builder setItemName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.ItemName = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'ItemName' field has been set */
    public boolean hasItemName() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'ItemName' field */
    public com.linkedin.avro.fastserde.generated.avro.NestedArrayItem.Builder clearItemName() {
      ItemName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public NestedArrayItem build() {
      try {
        NestedArrayItem record = new NestedArrayItem();
        record.ItemName = fieldSetFlags()[0] ? this.ItemName : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}