/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.avro.fastserde.generated.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
/** Used in tests to confirm generic-FastSerializer supports enum types */
@org.apache.avro.specific.AvroGenerated
public class FastSerdeEnums extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2416291394405373749L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FastSerdeEnums\",\"namespace\":\"com.linkedin.avro.fastserde.generated.avro\",\"doc\":\"Used in tests to confirm generic-FastSerializer supports enum types\",\"fields\":[{\"name\":\"enumField\",\"type\":{\"type\":\"enum\",\"name\":\"JustSimpleEnum\",\"symbols\":[\"E1\",\"E2\",\"E3\",\"E4\",\"E5\"]}},{\"name\":\"arrayOfEnums\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"JustSimpleEnum\"}],\"default\":null},{\"name\":\"mapOfEnums\",\"type\":{\"type\":\"map\",\"values\":\"JustSimpleEnum\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<FastSerdeEnums> ENCODER =
      new BinaryMessageEncoder<FastSerdeEnums>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<FastSerdeEnums> DECODER =
      new BinaryMessageDecoder<FastSerdeEnums>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<FastSerdeEnums> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<FastSerdeEnums> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<FastSerdeEnums>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this FastSerdeEnums to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a FastSerdeEnums from a ByteBuffer. */
  public static FastSerdeEnums fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public com.linkedin.avro.fastserde.generated.avro.JustSimpleEnum enumField;
  @Deprecated public java.util.List<com.linkedin.avro.fastserde.generated.avro.JustSimpleEnum> arrayOfEnums;
  @Deprecated public java.util.Map<java.lang.CharSequence,com.linkedin.avro.fastserde.generated.avro.JustSimpleEnum> mapOfEnums;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public FastSerdeEnums() {}

  /**
   * All-args constructor.
   * @param enumField The new value for enumField
   * @param arrayOfEnums The new value for arrayOfEnums
   * @param mapOfEnums The new value for mapOfEnums
   */
  public FastSerdeEnums(com.linkedin.avro.fastserde.generated.avro.JustSimpleEnum enumField, java.util.List<com.linkedin.avro.fastserde.generated.avro.JustSimpleEnum> arrayOfEnums, java.util.Map<java.lang.CharSequence,com.linkedin.avro.fastserde.generated.avro.JustSimpleEnum> mapOfEnums) {
    this.enumField = enumField;
    this.arrayOfEnums = arrayOfEnums;
    this.mapOfEnums = mapOfEnums;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return enumField;
    case 1: return arrayOfEnums;
    case 2: return mapOfEnums;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: enumField = (com.linkedin.avro.fastserde.generated.avro.JustSimpleEnum)value$; break;
    case 1: arrayOfEnums = (java.util.List<com.linkedin.avro.fastserde.generated.avro.JustSimpleEnum>)value$; break;
    case 2: mapOfEnums = (java.util.Map<java.lang.CharSequence,com.linkedin.avro.fastserde.generated.avro.JustSimpleEnum>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'enumField' field.
   * @return The value of the 'enumField' field.
   */
  public com.linkedin.avro.fastserde.generated.avro.JustSimpleEnum getEnumField() {
    return enumField;
  }

  /**
   * Sets the value of the 'enumField' field.
   * @param value the value to set.
   */
  public void setEnumField(com.linkedin.avro.fastserde.generated.avro.JustSimpleEnum value) {
    this.enumField = value;
  }

  /**
   * Gets the value of the 'arrayOfEnums' field.
   * @return The value of the 'arrayOfEnums' field.
   */
  public java.util.List<com.linkedin.avro.fastserde.generated.avro.JustSimpleEnum> getArrayOfEnums() {
    return arrayOfEnums;
  }

  /**
   * Sets the value of the 'arrayOfEnums' field.
   * @param value the value to set.
   */
  public void setArrayOfEnums(java.util.List<com.linkedin.avro.fastserde.generated.avro.JustSimpleEnum> value) {
    this.arrayOfEnums = value;
  }

  /**
   * Gets the value of the 'mapOfEnums' field.
   * @return The value of the 'mapOfEnums' field.
   */
  public java.util.Map<java.lang.CharSequence,com.linkedin.avro.fastserde.generated.avro.JustSimpleEnum> getMapOfEnums() {
    return mapOfEnums;
  }

  /**
   * Sets the value of the 'mapOfEnums' field.
   * @param value the value to set.
   */
  public void setMapOfEnums(java.util.Map<java.lang.CharSequence,com.linkedin.avro.fastserde.generated.avro.JustSimpleEnum> value) {
    this.mapOfEnums = value;
  }

  /**
   * Creates a new FastSerdeEnums RecordBuilder.
   * @return A new FastSerdeEnums RecordBuilder
   */
  public static com.linkedin.avro.fastserde.generated.avro.FastSerdeEnums.Builder newBuilder() {
    return new com.linkedin.avro.fastserde.generated.avro.FastSerdeEnums.Builder();
  }

  /**
   * Creates a new FastSerdeEnums RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new FastSerdeEnums RecordBuilder
   */
  public static com.linkedin.avro.fastserde.generated.avro.FastSerdeEnums.Builder newBuilder(com.linkedin.avro.fastserde.generated.avro.FastSerdeEnums.Builder other) {
    return new com.linkedin.avro.fastserde.generated.avro.FastSerdeEnums.Builder(other);
  }

  /**
   * Creates a new FastSerdeEnums RecordBuilder by copying an existing FastSerdeEnums instance.
   * @param other The existing instance to copy.
   * @return A new FastSerdeEnums RecordBuilder
   */
  public static com.linkedin.avro.fastserde.generated.avro.FastSerdeEnums.Builder newBuilder(com.linkedin.avro.fastserde.generated.avro.FastSerdeEnums other) {
    return new com.linkedin.avro.fastserde.generated.avro.FastSerdeEnums.Builder(other);
  }

  /**
   * RecordBuilder for FastSerdeEnums instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FastSerdeEnums>
    implements org.apache.avro.data.RecordBuilder<FastSerdeEnums> {

    private com.linkedin.avro.fastserde.generated.avro.JustSimpleEnum enumField;
    private java.util.List<com.linkedin.avro.fastserde.generated.avro.JustSimpleEnum> arrayOfEnums;
    private java.util.Map<java.lang.CharSequence,com.linkedin.avro.fastserde.generated.avro.JustSimpleEnum> mapOfEnums;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.linkedin.avro.fastserde.generated.avro.FastSerdeEnums.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.enumField)) {
        this.enumField = data().deepCopy(fields()[0].schema(), other.enumField);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.arrayOfEnums)) {
        this.arrayOfEnums = data().deepCopy(fields()[1].schema(), other.arrayOfEnums);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.mapOfEnums)) {
        this.mapOfEnums = data().deepCopy(fields()[2].schema(), other.mapOfEnums);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing FastSerdeEnums instance
     * @param other The existing instance to copy.
     */
    private Builder(com.linkedin.avro.fastserde.generated.avro.FastSerdeEnums other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.enumField)) {
        this.enumField = data().deepCopy(fields()[0].schema(), other.enumField);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.arrayOfEnums)) {
        this.arrayOfEnums = data().deepCopy(fields()[1].schema(), other.arrayOfEnums);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.mapOfEnums)) {
        this.mapOfEnums = data().deepCopy(fields()[2].schema(), other.mapOfEnums);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'enumField' field.
      * @return The value.
      */
    public com.linkedin.avro.fastserde.generated.avro.JustSimpleEnum getEnumField() {
      return enumField;
    }

    /**
      * Sets the value of the 'enumField' field.
      * @param value The value of 'enumField'.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeEnums.Builder setEnumField(com.linkedin.avro.fastserde.generated.avro.JustSimpleEnum value) {
      validate(fields()[0], value);
      this.enumField = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'enumField' field has been set.
      * @return True if the 'enumField' field has been set, false otherwise.
      */
    public boolean hasEnumField() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'enumField' field.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeEnums.Builder clearEnumField() {
      enumField = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'arrayOfEnums' field.
      * @return The value.
      */
    public java.util.List<com.linkedin.avro.fastserde.generated.avro.JustSimpleEnum> getArrayOfEnums() {
      return arrayOfEnums;
    }

    /**
      * Sets the value of the 'arrayOfEnums' field.
      * @param value The value of 'arrayOfEnums'.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeEnums.Builder setArrayOfEnums(java.util.List<com.linkedin.avro.fastserde.generated.avro.JustSimpleEnum> value) {
      validate(fields()[1], value);
      this.arrayOfEnums = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'arrayOfEnums' field has been set.
      * @return True if the 'arrayOfEnums' field has been set, false otherwise.
      */
    public boolean hasArrayOfEnums() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'arrayOfEnums' field.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeEnums.Builder clearArrayOfEnums() {
      arrayOfEnums = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'mapOfEnums' field.
      * @return The value.
      */
    public java.util.Map<java.lang.CharSequence,com.linkedin.avro.fastserde.generated.avro.JustSimpleEnum> getMapOfEnums() {
      return mapOfEnums;
    }

    /**
      * Sets the value of the 'mapOfEnums' field.
      * @param value The value of 'mapOfEnums'.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeEnums.Builder setMapOfEnums(java.util.Map<java.lang.CharSequence,com.linkedin.avro.fastserde.generated.avro.JustSimpleEnum> value) {
      validate(fields()[2], value);
      this.mapOfEnums = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'mapOfEnums' field has been set.
      * @return True if the 'mapOfEnums' field has been set, false otherwise.
      */
    public boolean hasMapOfEnums() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'mapOfEnums' field.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeEnums.Builder clearMapOfEnums() {
      mapOfEnums = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public FastSerdeEnums build() {
      try {
        FastSerdeEnums record = new FastSerdeEnums();
        record.enumField = fieldSetFlags()[0] ? this.enumField : (com.linkedin.avro.fastserde.generated.avro.JustSimpleEnum) defaultValue(fields()[0]);
        record.arrayOfEnums = fieldSetFlags()[1] ? this.arrayOfEnums : (java.util.List<com.linkedin.avro.fastserde.generated.avro.JustSimpleEnum>) defaultValue(fields()[1]);
        record.mapOfEnums = fieldSetFlags()[2] ? this.mapOfEnums : (java.util.Map<java.lang.CharSequence,com.linkedin.avro.fastserde.generated.avro.JustSimpleEnum>) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<FastSerdeEnums>
    WRITER$ = (org.apache.avro.io.DatumWriter<FastSerdeEnums>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<FastSerdeEnums>
    READER$ = (org.apache.avro.io.DatumReader<FastSerdeEnums>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}