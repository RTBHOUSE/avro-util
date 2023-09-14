/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.avro.fastserde.generated.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

/** Used in tests to confirm fast-serde supports logical-types */
@org.apache.avro.specific.AvroGenerated
public class FastSerdeLogicalTypesDefined extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5384773174528622628L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FastSerdeLogicalTypesDefined\",\"namespace\":\"com.linkedin.avro.fastserde.generated.avro\",\"doc\":\"Used in tests to confirm fast-serde supports logical-types\",\"fields\":[{\"name\":\"timeMillisField\",\"type\":{\"type\":\"int\",\"logicalType\":\"time-millis\"}},{\"name\":\"dateField\",\"type\":{\"type\":\"int\",\"logicalType\":\"date\"}},{\"name\":\"arrayOfUnionOfDateAndTimestampMillis\",\"type\":{\"type\":\"array\",\"items\":[{\"type\":\"int\",\"logicalType\":\"date\"},{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.DateConversion());
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.TimestampMillisConversion());
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.TimeMillisConversion());
  }

  private static final BinaryMessageEncoder<FastSerdeLogicalTypesDefined> ENCODER =
      new BinaryMessageEncoder<FastSerdeLogicalTypesDefined>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<FastSerdeLogicalTypesDefined> DECODER =
      new BinaryMessageDecoder<FastSerdeLogicalTypesDefined>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<FastSerdeLogicalTypesDefined> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<FastSerdeLogicalTypesDefined> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<FastSerdeLogicalTypesDefined> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<FastSerdeLogicalTypesDefined>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this FastSerdeLogicalTypesDefined to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a FastSerdeLogicalTypesDefined from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a FastSerdeLogicalTypesDefined instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static FastSerdeLogicalTypesDefined fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.time.LocalTime timeMillisField;
   private java.time.LocalDate dateField;
   private java.util.List<java.lang.Object> arrayOfUnionOfDateAndTimestampMillis;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public FastSerdeLogicalTypesDefined() {}

  /**
   * All-args constructor.
   * @param timeMillisField The new value for timeMillisField
   * @param dateField The new value for dateField
   * @param arrayOfUnionOfDateAndTimestampMillis The new value for arrayOfUnionOfDateAndTimestampMillis
   */
  public FastSerdeLogicalTypesDefined(java.time.LocalTime timeMillisField, java.time.LocalDate dateField, java.util.List<java.lang.Object> arrayOfUnionOfDateAndTimestampMillis) {
    this.timeMillisField = timeMillisField.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
    this.dateField = dateField;
    this.arrayOfUnionOfDateAndTimestampMillis = arrayOfUnionOfDateAndTimestampMillis;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return timeMillisField;
    case 1: return dateField;
    case 2: return arrayOfUnionOfDateAndTimestampMillis;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      new org.apache.avro.data.TimeConversions.TimeMillisConversion(),
      new org.apache.avro.data.TimeConversions.DateConversion(),
      null,
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: timeMillisField = (java.time.LocalTime)value$; break;
    case 1: dateField = (java.time.LocalDate)value$; break;
    case 2: arrayOfUnionOfDateAndTimestampMillis = (java.util.List<java.lang.Object>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'timeMillisField' field.
   * @return The value of the 'timeMillisField' field.
   */
  public java.time.LocalTime getTimeMillisField() {
    return timeMillisField;
  }


  /**
   * Sets the value of the 'timeMillisField' field.
   * @param value the value to set.
   */
  public void setTimeMillisField(java.time.LocalTime value) {
    this.timeMillisField = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
  }

  /**
   * Gets the value of the 'dateField' field.
   * @return The value of the 'dateField' field.
   */
  public java.time.LocalDate getDateField() {
    return dateField;
  }


  /**
   * Sets the value of the 'dateField' field.
   * @param value the value to set.
   */
  public void setDateField(java.time.LocalDate value) {
    this.dateField = value;
  }

  /**
   * Gets the value of the 'arrayOfUnionOfDateAndTimestampMillis' field.
   * @return The value of the 'arrayOfUnionOfDateAndTimestampMillis' field.
   */
  public java.util.List<java.lang.Object> getArrayOfUnionOfDateAndTimestampMillis() {
    return arrayOfUnionOfDateAndTimestampMillis;
  }


  /**
   * Sets the value of the 'arrayOfUnionOfDateAndTimestampMillis' field.
   * @param value the value to set.
   */
  public void setArrayOfUnionOfDateAndTimestampMillis(java.util.List<java.lang.Object> value) {
    this.arrayOfUnionOfDateAndTimestampMillis = value;
  }

  /**
   * Creates a new FastSerdeLogicalTypesDefined RecordBuilder.
   * @return A new FastSerdeLogicalTypesDefined RecordBuilder
   */
  public static com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesDefined.Builder newBuilder() {
    return new com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesDefined.Builder();
  }

  /**
   * Creates a new FastSerdeLogicalTypesDefined RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new FastSerdeLogicalTypesDefined RecordBuilder
   */
  public static com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesDefined.Builder newBuilder(com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesDefined.Builder other) {
    if (other == null) {
      return new com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesDefined.Builder();
    } else {
      return new com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesDefined.Builder(other);
    }
  }

  /**
   * Creates a new FastSerdeLogicalTypesDefined RecordBuilder by copying an existing FastSerdeLogicalTypesDefined instance.
   * @param other The existing instance to copy.
   * @return A new FastSerdeLogicalTypesDefined RecordBuilder
   */
  public static com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesDefined.Builder newBuilder(com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesDefined other) {
    if (other == null) {
      return new com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesDefined.Builder();
    } else {
      return new com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesDefined.Builder(other);
    }
  }

  /**
   * RecordBuilder for FastSerdeLogicalTypesDefined instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FastSerdeLogicalTypesDefined>
    implements org.apache.avro.data.RecordBuilder<FastSerdeLogicalTypesDefined> {

    private java.time.LocalTime timeMillisField;
    private java.time.LocalDate dateField;
    private java.util.List<java.lang.Object> arrayOfUnionOfDateAndTimestampMillis;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesDefined.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.timeMillisField)) {
        this.timeMillisField = data().deepCopy(fields()[0].schema(), other.timeMillisField);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.dateField)) {
        this.dateField = data().deepCopy(fields()[1].schema(), other.dateField);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.arrayOfUnionOfDateAndTimestampMillis)) {
        this.arrayOfUnionOfDateAndTimestampMillis = data().deepCopy(fields()[2].schema(), other.arrayOfUnionOfDateAndTimestampMillis);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing FastSerdeLogicalTypesDefined instance
     * @param other The existing instance to copy.
     */
    private Builder(com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesDefined other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.timeMillisField)) {
        this.timeMillisField = data().deepCopy(fields()[0].schema(), other.timeMillisField);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.dateField)) {
        this.dateField = data().deepCopy(fields()[1].schema(), other.dateField);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.arrayOfUnionOfDateAndTimestampMillis)) {
        this.arrayOfUnionOfDateAndTimestampMillis = data().deepCopy(fields()[2].schema(), other.arrayOfUnionOfDateAndTimestampMillis);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'timeMillisField' field.
      * @return The value.
      */
    public java.time.LocalTime getTimeMillisField() {
      return timeMillisField;
    }


    /**
      * Sets the value of the 'timeMillisField' field.
      * @param value The value of 'timeMillisField'.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesDefined.Builder setTimeMillisField(java.time.LocalTime value) {
      validate(fields()[0], value);
      this.timeMillisField = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'timeMillisField' field has been set.
      * @return True if the 'timeMillisField' field has been set, false otherwise.
      */
    public boolean hasTimeMillisField() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'timeMillisField' field.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesDefined.Builder clearTimeMillisField() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'dateField' field.
      * @return The value.
      */
    public java.time.LocalDate getDateField() {
      return dateField;
    }


    /**
      * Sets the value of the 'dateField' field.
      * @param value The value of 'dateField'.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesDefined.Builder setDateField(java.time.LocalDate value) {
      validate(fields()[1], value);
      this.dateField = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'dateField' field has been set.
      * @return True if the 'dateField' field has been set, false otherwise.
      */
    public boolean hasDateField() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'dateField' field.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesDefined.Builder clearDateField() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'arrayOfUnionOfDateAndTimestampMillis' field.
      * @return The value.
      */
    public java.util.List<java.lang.Object> getArrayOfUnionOfDateAndTimestampMillis() {
      return arrayOfUnionOfDateAndTimestampMillis;
    }


    /**
      * Sets the value of the 'arrayOfUnionOfDateAndTimestampMillis' field.
      * @param value The value of 'arrayOfUnionOfDateAndTimestampMillis'.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesDefined.Builder setArrayOfUnionOfDateAndTimestampMillis(java.util.List<java.lang.Object> value) {
      validate(fields()[2], value);
      this.arrayOfUnionOfDateAndTimestampMillis = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'arrayOfUnionOfDateAndTimestampMillis' field has been set.
      * @return True if the 'arrayOfUnionOfDateAndTimestampMillis' field has been set, false otherwise.
      */
    public boolean hasArrayOfUnionOfDateAndTimestampMillis() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'arrayOfUnionOfDateAndTimestampMillis' field.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeLogicalTypesDefined.Builder clearArrayOfUnionOfDateAndTimestampMillis() {
      arrayOfUnionOfDateAndTimestampMillis = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public FastSerdeLogicalTypesDefined build() {
      try {
        FastSerdeLogicalTypesDefined record = new FastSerdeLogicalTypesDefined();
        record.timeMillisField = fieldSetFlags()[0] ? this.timeMillisField : (java.time.LocalTime) defaultValue(fields()[0]);
        record.dateField = fieldSetFlags()[1] ? this.dateField : (java.time.LocalDate) defaultValue(fields()[1]);
        record.arrayOfUnionOfDateAndTimestampMillis = fieldSetFlags()[2] ? this.arrayOfUnionOfDateAndTimestampMillis : (java.util.List<java.lang.Object>) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<FastSerdeLogicalTypesDefined>
    WRITER$ = (org.apache.avro.io.DatumWriter<FastSerdeLogicalTypesDefined>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<FastSerdeLogicalTypesDefined>
    READER$ = (org.apache.avro.io.DatumReader<FastSerdeLogicalTypesDefined>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










