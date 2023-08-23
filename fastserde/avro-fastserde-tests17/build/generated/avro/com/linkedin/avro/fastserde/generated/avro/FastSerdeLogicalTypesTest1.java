/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.avro.fastserde.generated.avro;  
@SuppressWarnings("all")
/** Used in tests to confirm fast-serde supports logical-types */
@org.apache.avro.specific.AvroGenerated
public class FastSerdeLogicalTypesTest1 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FastSerdeLogicalTypesTest1\",\"namespace\":\"com.linkedin.avro.fastserde.generated.avro\",\"doc\":\"Used in tests to confirm fast-serde supports logical-types\",\"fields\":[{\"name\":\"unionOfArrayAndMap\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"int\",\"logicalType\":\"time-millis\"}},{\"type\":\"map\",\"values\":{\"type\":\"int\",\"logicalType\":\"date\"}}]},{\"name\":\"timestampMillisMap\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}}},{\"name\":\"nullableArrayOfDates\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"int\",\"logicalType\":\"date\"}}],\"default\":null},{\"name\":\"arrayOfDates\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"int\",\"logicalType\":\"date\"}}},{\"name\":\"unionOfDecimalOrDate\",\"type\":[{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":4,\"scale\":2},{\"type\":\"int\",\"logicalType\":\"date\"}]},{\"name\":\"uuidField\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"timestampMillisField\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}},{\"name\":\"timestampMicrosField\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"}},{\"name\":\"timeMillisField\",\"type\":{\"type\":\"int\",\"logicalType\":\"time-millis\"}},{\"name\":\"timeMicrosField\",\"type\":{\"type\":\"long\",\"logicalType\":\"time-micros\"}},{\"name\":\"dateField\",\"type\":{\"type\":\"int\",\"logicalType\":\"date\"}},{\"name\":\"nestedLocalTimestampMillis\",\"type\":{\"type\":\"record\",\"name\":\"LocalTimestampRecord\",\"fields\":[{\"name\":\"nestedTimestamp\",\"type\":{\"type\":\"long\",\"logicalType\":\"local-timestamp-millis\"}},{\"name\":\"nullableNestedTimestamp\",\"type\":[\"null\",{\"type\":\"long\",\"logicalType\":\"local-timestamp-millis\"}]},{\"name\":\"nullableUnionOfDateAndLocalTimestamp\",\"type\":[\"null\",{\"type\":\"int\",\"logicalType\":\"date\"},{\"type\":\"long\",\"logicalType\":\"local-timestamp-millis\"}]},{\"name\":\"unionOfDateAndLocalTimestamp\",\"type\":[{\"type\":\"int\",\"logicalType\":\"date\"},{\"type\":\"long\",\"logicalType\":\"local-timestamp-millis\"}]}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.Object unionOfArrayAndMap;
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.Long> timestampMillisMap;
  @Deprecated public java.util.List<java.lang.Integer> nullableArrayOfDates;
  @Deprecated public java.util.List<java.lang.Integer> arrayOfDates;
  @Deprecated public java.lang.Object unionOfDecimalOrDate;
  @Deprecated public java.lang.CharSequence uuidField;
  @Deprecated public long timestampMillisField;
  @Deprecated public long timestampMicrosField;
  @Deprecated public int timeMillisField;
  @Deprecated public long timeMicrosField;
  @Deprecated public int dateField;
  @Deprecated public com.linkedin.avro.fastserde.generated.avro.LocalTimestampRecord nestedLocalTimestampMillis;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public FastSerdeLogicalTypesTest1() {}

  /**
   * All-args constructor.
   */
  public FastSerdeLogicalTypesTest1(java.lang.Object unionOfArrayAndMap, java.util.Map<java.lang.CharSequence,java.lang.Long> timestampMillisMap, java.util.List<java.lang.Integer> nullableArrayOfDates, java.util.List<java.lang.Integer> arrayOfDates, java.lang.Object unionOfDecimalOrDate, java.lang.CharSequence uuidField, java.lang.Long timestampMillisField, java.lang.Long timestampMicrosField, java.lang.Integer timeMillisField, java.lang.Long timeMicrosField, java.lang.Integer dateField, com.linkedin.avro.fastserde.generated.avro.LocalTimestampRecord nestedLocalTimestampMillis) {
    this.unionOfArrayAndMap = unionOfArrayAndMap;
    this.timestampMillisMap = timestampMillisMap;
    this.nullableArrayOfDates = nullableArrayOfDates;
    this.arrayOfDates = arrayOfDates;
    this.unionOfDecimalOrDate = unionOfDecimalOrDate;
    this.uuidField = uuidField;
    this.timestampMillisField = timestampMillisField;
    this.timestampMicrosField = timestampMicrosField;
    this.timeMillisField = timeMillisField;
    this.timeMicrosField = timeMicrosField;
    this.dateField = dateField;
    this.nestedLocalTimestampMillis = nestedLocalTimestampMillis;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return unionOfArrayAndMap;
    case 1: return timestampMillisMap;
    case 2: return nullableArrayOfDates;
    case 3: return arrayOfDates;
    case 4: return unionOfDecimalOrDate;
    case 5: return uuidField;
    case 6: return timestampMillisField;
    case 7: return timestampMicrosField;
    case 8: return timeMillisField;
    case 9: return timeMicrosField;
    case 10: return dateField;
    case 11: return nestedLocalTimestampMillis;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: unionOfArrayAndMap = (java.lang.Object)value$; break;
    case 1: timestampMillisMap = (java.util.Map<java.lang.CharSequence,java.lang.Long>)value$; break;
    case 2: nullableArrayOfDates = (java.util.List<java.lang.Integer>)value$; break;
    case 3: arrayOfDates = (java.util.List<java.lang.Integer>)value$; break;
    case 4: unionOfDecimalOrDate = (java.lang.Object)value$; break;
    case 5: uuidField = (java.lang.CharSequence)value$; break;
    case 6: timestampMillisField = (java.lang.Long)value$; break;
    case 7: timestampMicrosField = (java.lang.Long)value$; break;
    case 8: timeMillisField = (java.lang.Integer)value$; break;
    case 9: timeMicrosField = (java.lang.Long)value$; break;
    case 10: dateField = (java.lang.Integer)value$; break;
    case 11: nestedLocalTimestampMillis = (com.linkedin.avro.fastserde.generated.avro.LocalTimestampRecord)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'unionOfArrayAndMap' field.
   */
  public java.lang.Object getUnionOfArrayAndMap() {
    return unionOfArrayAndMap;
  }

  /**
   * Sets the value of the 'unionOfArrayAndMap' field.
   * @param value the value to set.
   */
  public void setUnionOfArrayAndMap(java.lang.Object value) {
    this.unionOfArrayAndMap = value;
  }

  /**
   * Gets the value of the 'timestampMillisMap' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.Long> getTimestampMillisMap() {
    return timestampMillisMap;
  }

  /**
   * Sets the value of the 'timestampMillisMap' field.
   * @param value the value to set.
   */
  public void setTimestampMillisMap(java.util.Map<java.lang.CharSequence,java.lang.Long> value) {
    this.timestampMillisMap = value;
  }

  /**
   * Gets the value of the 'nullableArrayOfDates' field.
   */
  public java.util.List<java.lang.Integer> getNullableArrayOfDates() {
    return nullableArrayOfDates;
  }

  /**
   * Sets the value of the 'nullableArrayOfDates' field.
   * @param value the value to set.
   */
  public void setNullableArrayOfDates(java.util.List<java.lang.Integer> value) {
    this.nullableArrayOfDates = value;
  }

  /**
   * Gets the value of the 'arrayOfDates' field.
   */
  public java.util.List<java.lang.Integer> getArrayOfDates() {
    return arrayOfDates;
  }

  /**
   * Sets the value of the 'arrayOfDates' field.
   * @param value the value to set.
   */
  public void setArrayOfDates(java.util.List<java.lang.Integer> value) {
    this.arrayOfDates = value;
  }

  /**
   * Gets the value of the 'unionOfDecimalOrDate' field.
   */
  public java.lang.Object getUnionOfDecimalOrDate() {
    return unionOfDecimalOrDate;
  }

  /**
   * Sets the value of the 'unionOfDecimalOrDate' field.
   * @param value the value to set.
   */
  public void setUnionOfDecimalOrDate(java.lang.Object value) {
    this.unionOfDecimalOrDate = value;
  }

  /**
   * Gets the value of the 'uuidField' field.
   */
  public java.lang.CharSequence getUuidField() {
    return uuidField;
  }

  /**
   * Sets the value of the 'uuidField' field.
   * @param value the value to set.
   */
  public void setUuidField(java.lang.CharSequence value) {
    this.uuidField = value;
  }

  /**
   * Gets the value of the 'timestampMillisField' field.
   */
  public java.lang.Long getTimestampMillisField() {
    return timestampMillisField;
  }

  /**
   * Sets the value of the 'timestampMillisField' field.
   * @param value the value to set.
   */
  public void setTimestampMillisField(java.lang.Long value) {
    this.timestampMillisField = value;
  }

  /**
   * Gets the value of the 'timestampMicrosField' field.
   */
  public java.lang.Long getTimestampMicrosField() {
    return timestampMicrosField;
  }

  /**
   * Sets the value of the 'timestampMicrosField' field.
   * @param value the value to set.
   */
  public void setTimestampMicrosField(java.lang.Long value) {
    this.timestampMicrosField = value;
  }

  /**
   * Gets the value of the 'timeMillisField' field.
   */
  public java.lang.Integer getTimeMillisField() {
    return timeMillisField;
  }

  /**
   * Sets the value of the 'timeMillisField' field.
   * @param value the value to set.
   */
  public void setTimeMillisField(java.lang.Integer value) {
    this.timeMillisField = value;
  }

  /**
   * Gets the value of the 'timeMicrosField' field.
   */
  public java.lang.Long getTimeMicrosField() {
    return timeMicrosField;
  }

  /**
   * Sets the value of the 'timeMicrosField' field.
   * @param value the value to set.
   */
  public void setTimeMicrosField(java.lang.Long value) {
    this.timeMicrosField = value;
  }

  /**
   * Gets the value of the 'dateField' field.
   */
  public java.lang.Integer getDateField() {
    return dateField;
  }

  /**
   * Sets the value of the 'dateField' field.
   * @param value the value to set.
   */
  public void setDateField(java.lang.Integer value) {
    this.dateField = value;
  }

  /**
   * Gets the value of the 'nestedLocalTimestampMillis' field.
   */
  public com.linkedin.avro.fastserde.generated.avro.LocalTimestampRecord getNestedLocalTimestampMillis() {
    return nestedLocalTimestampMillis;
  }

  /**
   * Sets the value of the 'nestedLocalTimestampMillis' field.
   * @param value the value to set.
   */
  public void setNestedLocalTimestampMillis(com.linkedin.avro.fastserde.generated.avro.LocalTimestampRecord value) {
    this.nestedLocalTimestampMillis = value;
  }

  /** Creates a new FastSerdeLogicalTypesTest1 RecordBuilder */
  public static com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1.Builder newBuilder() {
    return new com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1.Builder();
  }
  
  /** Creates a new FastSerdeLogicalTypesTest1 RecordBuilder by copying an existing Builder */
  public static com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1.Builder newBuilder(com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1.Builder other) {
    return new com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1.Builder(other);
  }
  
  /** Creates a new FastSerdeLogicalTypesTest1 RecordBuilder by copying an existing FastSerdeLogicalTypesTest1 instance */
  public static com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1.Builder newBuilder(com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1 other) {
    return new com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1.Builder(other);
  }
  
  /**
   * RecordBuilder for FastSerdeLogicalTypesTest1 instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FastSerdeLogicalTypesTest1>
    implements org.apache.avro.data.RecordBuilder<FastSerdeLogicalTypesTest1> {

    private java.lang.Object unionOfArrayAndMap;
    private java.util.Map<java.lang.CharSequence,java.lang.Long> timestampMillisMap;
    private java.util.List<java.lang.Integer> nullableArrayOfDates;
    private java.util.List<java.lang.Integer> arrayOfDates;
    private java.lang.Object unionOfDecimalOrDate;
    private java.lang.CharSequence uuidField;
    private long timestampMillisField;
    private long timestampMicrosField;
    private int timeMillisField;
    private long timeMicrosField;
    private int dateField;
    private com.linkedin.avro.fastserde.generated.avro.LocalTimestampRecord nestedLocalTimestampMillis;

    /** Creates a new Builder */
    private Builder() {
      super(com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.unionOfArrayAndMap)) {
        this.unionOfArrayAndMap = data().deepCopy(fields()[0].schema(), other.unionOfArrayAndMap);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.timestampMillisMap)) {
        this.timestampMillisMap = data().deepCopy(fields()[1].schema(), other.timestampMillisMap);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.nullableArrayOfDates)) {
        this.nullableArrayOfDates = data().deepCopy(fields()[2].schema(), other.nullableArrayOfDates);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.arrayOfDates)) {
        this.arrayOfDates = data().deepCopy(fields()[3].schema(), other.arrayOfDates);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.unionOfDecimalOrDate)) {
        this.unionOfDecimalOrDate = data().deepCopy(fields()[4].schema(), other.unionOfDecimalOrDate);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.uuidField)) {
        this.uuidField = data().deepCopy(fields()[5].schema(), other.uuidField);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.timestampMillisField)) {
        this.timestampMillisField = data().deepCopy(fields()[6].schema(), other.timestampMillisField);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.timestampMicrosField)) {
        this.timestampMicrosField = data().deepCopy(fields()[7].schema(), other.timestampMicrosField);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.timeMillisField)) {
        this.timeMillisField = data().deepCopy(fields()[8].schema(), other.timeMillisField);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.timeMicrosField)) {
        this.timeMicrosField = data().deepCopy(fields()[9].schema(), other.timeMicrosField);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.dateField)) {
        this.dateField = data().deepCopy(fields()[10].schema(), other.dateField);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.nestedLocalTimestampMillis)) {
        this.nestedLocalTimestampMillis = data().deepCopy(fields()[11].schema(), other.nestedLocalTimestampMillis);
        fieldSetFlags()[11] = true;
      }
    }
    
    /** Creates a Builder by copying an existing FastSerdeLogicalTypesTest1 instance */
    private Builder(com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1 other) {
            super(com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1.SCHEMA$);
      if (isValidValue(fields()[0], other.unionOfArrayAndMap)) {
        this.unionOfArrayAndMap = data().deepCopy(fields()[0].schema(), other.unionOfArrayAndMap);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.timestampMillisMap)) {
        this.timestampMillisMap = data().deepCopy(fields()[1].schema(), other.timestampMillisMap);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.nullableArrayOfDates)) {
        this.nullableArrayOfDates = data().deepCopy(fields()[2].schema(), other.nullableArrayOfDates);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.arrayOfDates)) {
        this.arrayOfDates = data().deepCopy(fields()[3].schema(), other.arrayOfDates);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.unionOfDecimalOrDate)) {
        this.unionOfDecimalOrDate = data().deepCopy(fields()[4].schema(), other.unionOfDecimalOrDate);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.uuidField)) {
        this.uuidField = data().deepCopy(fields()[5].schema(), other.uuidField);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.timestampMillisField)) {
        this.timestampMillisField = data().deepCopy(fields()[6].schema(), other.timestampMillisField);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.timestampMicrosField)) {
        this.timestampMicrosField = data().deepCopy(fields()[7].schema(), other.timestampMicrosField);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.timeMillisField)) {
        this.timeMillisField = data().deepCopy(fields()[8].schema(), other.timeMillisField);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.timeMicrosField)) {
        this.timeMicrosField = data().deepCopy(fields()[9].schema(), other.timeMicrosField);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.dateField)) {
        this.dateField = data().deepCopy(fields()[10].schema(), other.dateField);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.nestedLocalTimestampMillis)) {
        this.nestedLocalTimestampMillis = data().deepCopy(fields()[11].schema(), other.nestedLocalTimestampMillis);
        fieldSetFlags()[11] = true;
      }
    }

    /** Gets the value of the 'unionOfArrayAndMap' field */
    public java.lang.Object getUnionOfArrayAndMap() {
      return unionOfArrayAndMap;
    }
    
    /** Sets the value of the 'unionOfArrayAndMap' field */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1.Builder setUnionOfArrayAndMap(java.lang.Object value) {
      validate(fields()[0], value);
      this.unionOfArrayAndMap = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'unionOfArrayAndMap' field has been set */
    public boolean hasUnionOfArrayAndMap() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'unionOfArrayAndMap' field */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1.Builder clearUnionOfArrayAndMap() {
      unionOfArrayAndMap = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'timestampMillisMap' field */
    public java.util.Map<java.lang.CharSequence,java.lang.Long> getTimestampMillisMap() {
      return timestampMillisMap;
    }
    
    /** Sets the value of the 'timestampMillisMap' field */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1.Builder setTimestampMillisMap(java.util.Map<java.lang.CharSequence,java.lang.Long> value) {
      validate(fields()[1], value);
      this.timestampMillisMap = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'timestampMillisMap' field has been set */
    public boolean hasTimestampMillisMap() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'timestampMillisMap' field */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1.Builder clearTimestampMillisMap() {
      timestampMillisMap = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'nullableArrayOfDates' field */
    public java.util.List<java.lang.Integer> getNullableArrayOfDates() {
      return nullableArrayOfDates;
    }
    
    /** Sets the value of the 'nullableArrayOfDates' field */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1.Builder setNullableArrayOfDates(java.util.List<java.lang.Integer> value) {
      validate(fields()[2], value);
      this.nullableArrayOfDates = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'nullableArrayOfDates' field has been set */
    public boolean hasNullableArrayOfDates() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'nullableArrayOfDates' field */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1.Builder clearNullableArrayOfDates() {
      nullableArrayOfDates = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'arrayOfDates' field */
    public java.util.List<java.lang.Integer> getArrayOfDates() {
      return arrayOfDates;
    }
    
    /** Sets the value of the 'arrayOfDates' field */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1.Builder setArrayOfDates(java.util.List<java.lang.Integer> value) {
      validate(fields()[3], value);
      this.arrayOfDates = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'arrayOfDates' field has been set */
    public boolean hasArrayOfDates() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'arrayOfDates' field */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1.Builder clearArrayOfDates() {
      arrayOfDates = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'unionOfDecimalOrDate' field */
    public java.lang.Object getUnionOfDecimalOrDate() {
      return unionOfDecimalOrDate;
    }
    
    /** Sets the value of the 'unionOfDecimalOrDate' field */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1.Builder setUnionOfDecimalOrDate(java.lang.Object value) {
      validate(fields()[4], value);
      this.unionOfDecimalOrDate = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'unionOfDecimalOrDate' field has been set */
    public boolean hasUnionOfDecimalOrDate() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'unionOfDecimalOrDate' field */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1.Builder clearUnionOfDecimalOrDate() {
      unionOfDecimalOrDate = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'uuidField' field */
    public java.lang.CharSequence getUuidField() {
      return uuidField;
    }
    
    /** Sets the value of the 'uuidField' field */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1.Builder setUuidField(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.uuidField = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'uuidField' field has been set */
    public boolean hasUuidField() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'uuidField' field */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1.Builder clearUuidField() {
      uuidField = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'timestampMillisField' field */
    public java.lang.Long getTimestampMillisField() {
      return timestampMillisField;
    }
    
    /** Sets the value of the 'timestampMillisField' field */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1.Builder setTimestampMillisField(long value) {
      validate(fields()[6], value);
      this.timestampMillisField = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'timestampMillisField' field has been set */
    public boolean hasTimestampMillisField() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'timestampMillisField' field */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1.Builder clearTimestampMillisField() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'timestampMicrosField' field */
    public java.lang.Long getTimestampMicrosField() {
      return timestampMicrosField;
    }
    
    /** Sets the value of the 'timestampMicrosField' field */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1.Builder setTimestampMicrosField(long value) {
      validate(fields()[7], value);
      this.timestampMicrosField = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'timestampMicrosField' field has been set */
    public boolean hasTimestampMicrosField() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'timestampMicrosField' field */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1.Builder clearTimestampMicrosField() {
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'timeMillisField' field */
    public java.lang.Integer getTimeMillisField() {
      return timeMillisField;
    }
    
    /** Sets the value of the 'timeMillisField' field */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1.Builder setTimeMillisField(int value) {
      validate(fields()[8], value);
      this.timeMillisField = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'timeMillisField' field has been set */
    public boolean hasTimeMillisField() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'timeMillisField' field */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1.Builder clearTimeMillisField() {
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'timeMicrosField' field */
    public java.lang.Long getTimeMicrosField() {
      return timeMicrosField;
    }
    
    /** Sets the value of the 'timeMicrosField' field */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1.Builder setTimeMicrosField(long value) {
      validate(fields()[9], value);
      this.timeMicrosField = value;
      fieldSetFlags()[9] = true;
      return this; 
    }
    
    /** Checks whether the 'timeMicrosField' field has been set */
    public boolean hasTimeMicrosField() {
      return fieldSetFlags()[9];
    }
    
    /** Clears the value of the 'timeMicrosField' field */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1.Builder clearTimeMicrosField() {
      fieldSetFlags()[9] = false;
      return this;
    }

    /** Gets the value of the 'dateField' field */
    public java.lang.Integer getDateField() {
      return dateField;
    }
    
    /** Sets the value of the 'dateField' field */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1.Builder setDateField(int value) {
      validate(fields()[10], value);
      this.dateField = value;
      fieldSetFlags()[10] = true;
      return this; 
    }
    
    /** Checks whether the 'dateField' field has been set */
    public boolean hasDateField() {
      return fieldSetFlags()[10];
    }
    
    /** Clears the value of the 'dateField' field */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1.Builder clearDateField() {
      fieldSetFlags()[10] = false;
      return this;
    }

    /** Gets the value of the 'nestedLocalTimestampMillis' field */
    public com.linkedin.avro.fastserde.generated.avro.LocalTimestampRecord getNestedLocalTimestampMillis() {
      return nestedLocalTimestampMillis;
    }
    
    /** Sets the value of the 'nestedLocalTimestampMillis' field */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1.Builder setNestedLocalTimestampMillis(com.linkedin.avro.fastserde.generated.avro.LocalTimestampRecord value) {
      validate(fields()[11], value);
      this.nestedLocalTimestampMillis = value;
      fieldSetFlags()[11] = true;
      return this; 
    }
    
    /** Checks whether the 'nestedLocalTimestampMillis' field has been set */
    public boolean hasNestedLocalTimestampMillis() {
      return fieldSetFlags()[11];
    }
    
    /** Clears the value of the 'nestedLocalTimestampMillis' field */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesTest1.Builder clearNestedLocalTimestampMillis() {
      nestedLocalTimestampMillis = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    @Override
    public FastSerdeLogicalTypesTest1 build() {
      try {
        FastSerdeLogicalTypesTest1 record = new FastSerdeLogicalTypesTest1();
        record.unionOfArrayAndMap = fieldSetFlags()[0] ? this.unionOfArrayAndMap : (java.lang.Object) defaultValue(fields()[0]);
        record.timestampMillisMap = fieldSetFlags()[1] ? this.timestampMillisMap : (java.util.Map<java.lang.CharSequence,java.lang.Long>) defaultValue(fields()[1]);
        record.nullableArrayOfDates = fieldSetFlags()[2] ? this.nullableArrayOfDates : (java.util.List<java.lang.Integer>) defaultValue(fields()[2]);
        record.arrayOfDates = fieldSetFlags()[3] ? this.arrayOfDates : (java.util.List<java.lang.Integer>) defaultValue(fields()[3]);
        record.unionOfDecimalOrDate = fieldSetFlags()[4] ? this.unionOfDecimalOrDate : (java.lang.Object) defaultValue(fields()[4]);
        record.uuidField = fieldSetFlags()[5] ? this.uuidField : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.timestampMillisField = fieldSetFlags()[6] ? this.timestampMillisField : (java.lang.Long) defaultValue(fields()[6]);
        record.timestampMicrosField = fieldSetFlags()[7] ? this.timestampMicrosField : (java.lang.Long) defaultValue(fields()[7]);
        record.timeMillisField = fieldSetFlags()[8] ? this.timeMillisField : (java.lang.Integer) defaultValue(fields()[8]);
        record.timeMicrosField = fieldSetFlags()[9] ? this.timeMicrosField : (java.lang.Long) defaultValue(fields()[9]);
        record.dateField = fieldSetFlags()[10] ? this.dateField : (java.lang.Integer) defaultValue(fields()[10]);
        record.nestedLocalTimestampMillis = fieldSetFlags()[11] ? this.nestedLocalTimestampMillis : (com.linkedin.avro.fastserde.generated.avro.LocalTimestampRecord) defaultValue(fields()[11]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
