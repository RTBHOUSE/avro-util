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

/** Used in tests to confirm generic-FastSerializer supports fixed types */
@org.apache.avro.specific.AvroGenerated
public class FastSerdeFixed extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5199885779948800152L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FastSerdeFixed\",\"namespace\":\"com.linkedin.avro.fastserde.generated.avro\",\"doc\":\"Used in tests to confirm generic-FastSerializer supports fixed types\",\"fields\":[{\"name\":\"fixedField\",\"type\":{\"type\":\"fixed\",\"name\":\"FixedOfSize10\",\"size\":10}},{\"name\":\"arrayOfFixed\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"FixedOfSize10\"}],\"default\":null},{\"name\":\"mapOfFixed\",\"type\":{\"type\":\"map\",\"values\":\"FixedOfSize10\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<FastSerdeFixed> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<FastSerdeFixed> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<FastSerdeFixed> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<FastSerdeFixed> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<FastSerdeFixed> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this FastSerdeFixed to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a FastSerdeFixed from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a FastSerdeFixed instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static FastSerdeFixed fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private com.linkedin.avro.fastserde.generated.avro.FixedOfSize10 fixedField;
  private java.util.List<com.linkedin.avro.fastserde.generated.avro.FixedOfSize10> arrayOfFixed;
  private java.util.Map<java.lang.CharSequence,com.linkedin.avro.fastserde.generated.avro.FixedOfSize10> mapOfFixed;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public FastSerdeFixed() {}

  /**
   * All-args constructor.
   * @param fixedField The new value for fixedField
   * @param arrayOfFixed The new value for arrayOfFixed
   * @param mapOfFixed The new value for mapOfFixed
   */
  public FastSerdeFixed(com.linkedin.avro.fastserde.generated.avro.FixedOfSize10 fixedField, java.util.List<com.linkedin.avro.fastserde.generated.avro.FixedOfSize10> arrayOfFixed, java.util.Map<java.lang.CharSequence,com.linkedin.avro.fastserde.generated.avro.FixedOfSize10> mapOfFixed) {
    this.fixedField = fixedField;
    this.arrayOfFixed = arrayOfFixed;
    this.mapOfFixed = mapOfFixed;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return fixedField;
    case 1: return arrayOfFixed;
    case 2: return mapOfFixed;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: fixedField = (com.linkedin.avro.fastserde.generated.avro.FixedOfSize10)value$; break;
    case 1: arrayOfFixed = (java.util.List<com.linkedin.avro.fastserde.generated.avro.FixedOfSize10>)value$; break;
    case 2: mapOfFixed = (java.util.Map<java.lang.CharSequence,com.linkedin.avro.fastserde.generated.avro.FixedOfSize10>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'fixedField' field.
   * @return The value of the 'fixedField' field.
   */
  public com.linkedin.avro.fastserde.generated.avro.FixedOfSize10 getFixedField() {
    return fixedField;
  }


  /**
   * Sets the value of the 'fixedField' field.
   * @param value the value to set.
   */
  public void setFixedField(com.linkedin.avro.fastserde.generated.avro.FixedOfSize10 value) {
    this.fixedField = value;
  }

  /**
   * Gets the value of the 'arrayOfFixed' field.
   * @return The value of the 'arrayOfFixed' field.
   */
  public java.util.List<com.linkedin.avro.fastserde.generated.avro.FixedOfSize10> getArrayOfFixed() {
    return arrayOfFixed;
  }


  /**
   * Sets the value of the 'arrayOfFixed' field.
   * @param value the value to set.
   */
  public void setArrayOfFixed(java.util.List<com.linkedin.avro.fastserde.generated.avro.FixedOfSize10> value) {
    this.arrayOfFixed = value;
  }

  /**
   * Gets the value of the 'mapOfFixed' field.
   * @return The value of the 'mapOfFixed' field.
   */
  public java.util.Map<java.lang.CharSequence,com.linkedin.avro.fastserde.generated.avro.FixedOfSize10> getMapOfFixed() {
    return mapOfFixed;
  }


  /**
   * Sets the value of the 'mapOfFixed' field.
   * @param value the value to set.
   */
  public void setMapOfFixed(java.util.Map<java.lang.CharSequence,com.linkedin.avro.fastserde.generated.avro.FixedOfSize10> value) {
    this.mapOfFixed = value;
  }

  /**
   * Creates a new FastSerdeFixed RecordBuilder.
   * @return A new FastSerdeFixed RecordBuilder
   */
  public static com.linkedin.avro.fastserde.generated.avro.FastSerdeFixed.Builder newBuilder() {
    return new com.linkedin.avro.fastserde.generated.avro.FastSerdeFixed.Builder();
  }

  /**
   * Creates a new FastSerdeFixed RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new FastSerdeFixed RecordBuilder
   */
  public static com.linkedin.avro.fastserde.generated.avro.FastSerdeFixed.Builder newBuilder(com.linkedin.avro.fastserde.generated.avro.FastSerdeFixed.Builder other) {
    if (other == null) {
      return new com.linkedin.avro.fastserde.generated.avro.FastSerdeFixed.Builder();
    } else {
      return new com.linkedin.avro.fastserde.generated.avro.FastSerdeFixed.Builder(other);
    }
  }

  /**
   * Creates a new FastSerdeFixed RecordBuilder by copying an existing FastSerdeFixed instance.
   * @param other The existing instance to copy.
   * @return A new FastSerdeFixed RecordBuilder
   */
  public static com.linkedin.avro.fastserde.generated.avro.FastSerdeFixed.Builder newBuilder(com.linkedin.avro.fastserde.generated.avro.FastSerdeFixed other) {
    if (other == null) {
      return new com.linkedin.avro.fastserde.generated.avro.FastSerdeFixed.Builder();
    } else {
      return new com.linkedin.avro.fastserde.generated.avro.FastSerdeFixed.Builder(other);
    }
  }

  /**
   * RecordBuilder for FastSerdeFixed instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FastSerdeFixed>
    implements org.apache.avro.data.RecordBuilder<FastSerdeFixed> {

    private com.linkedin.avro.fastserde.generated.avro.FixedOfSize10 fixedField;
    private java.util.List<com.linkedin.avro.fastserde.generated.avro.FixedOfSize10> arrayOfFixed;
    private java.util.Map<java.lang.CharSequence,com.linkedin.avro.fastserde.generated.avro.FixedOfSize10> mapOfFixed;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.linkedin.avro.fastserde.generated.avro.FastSerdeFixed.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.fixedField)) {
        this.fixedField = data().deepCopy(fields()[0].schema(), other.fixedField);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.arrayOfFixed)) {
        this.arrayOfFixed = data().deepCopy(fields()[1].schema(), other.arrayOfFixed);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.mapOfFixed)) {
        this.mapOfFixed = data().deepCopy(fields()[2].schema(), other.mapOfFixed);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing FastSerdeFixed instance
     * @param other The existing instance to copy.
     */
    private Builder(com.linkedin.avro.fastserde.generated.avro.FastSerdeFixed other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.fixedField)) {
        this.fixedField = data().deepCopy(fields()[0].schema(), other.fixedField);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.arrayOfFixed)) {
        this.arrayOfFixed = data().deepCopy(fields()[1].schema(), other.arrayOfFixed);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.mapOfFixed)) {
        this.mapOfFixed = data().deepCopy(fields()[2].schema(), other.mapOfFixed);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'fixedField' field.
      * @return The value.
      */
    public com.linkedin.avro.fastserde.generated.avro.FixedOfSize10 getFixedField() {
      return fixedField;
    }


    /**
      * Sets the value of the 'fixedField' field.
      * @param value The value of 'fixedField'.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeFixed.Builder setFixedField(com.linkedin.avro.fastserde.generated.avro.FixedOfSize10 value) {
      validate(fields()[0], value);
      this.fixedField = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'fixedField' field has been set.
      * @return True if the 'fixedField' field has been set, false otherwise.
      */
    public boolean hasFixedField() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'fixedField' field.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeFixed.Builder clearFixedField() {
      fixedField = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'arrayOfFixed' field.
      * @return The value.
      */
    public java.util.List<com.linkedin.avro.fastserde.generated.avro.FixedOfSize10> getArrayOfFixed() {
      return arrayOfFixed;
    }


    /**
      * Sets the value of the 'arrayOfFixed' field.
      * @param value The value of 'arrayOfFixed'.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeFixed.Builder setArrayOfFixed(java.util.List<com.linkedin.avro.fastserde.generated.avro.FixedOfSize10> value) {
      validate(fields()[1], value);
      this.arrayOfFixed = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'arrayOfFixed' field has been set.
      * @return True if the 'arrayOfFixed' field has been set, false otherwise.
      */
    public boolean hasArrayOfFixed() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'arrayOfFixed' field.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeFixed.Builder clearArrayOfFixed() {
      arrayOfFixed = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'mapOfFixed' field.
      * @return The value.
      */
    public java.util.Map<java.lang.CharSequence,com.linkedin.avro.fastserde.generated.avro.FixedOfSize10> getMapOfFixed() {
      return mapOfFixed;
    }


    /**
      * Sets the value of the 'mapOfFixed' field.
      * @param value The value of 'mapOfFixed'.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeFixed.Builder setMapOfFixed(java.util.Map<java.lang.CharSequence,com.linkedin.avro.fastserde.generated.avro.FixedOfSize10> value) {
      validate(fields()[2], value);
      this.mapOfFixed = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'mapOfFixed' field has been set.
      * @return True if the 'mapOfFixed' field has been set, false otherwise.
      */
    public boolean hasMapOfFixed() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'mapOfFixed' field.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.FastSerdeFixed.Builder clearMapOfFixed() {
      mapOfFixed = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public FastSerdeFixed build() {
      try {
        FastSerdeFixed record = new FastSerdeFixed();
        record.fixedField = fieldSetFlags()[0] ? this.fixedField : (com.linkedin.avro.fastserde.generated.avro.FixedOfSize10) defaultValue(fields()[0]);
        record.arrayOfFixed = fieldSetFlags()[1] ? this.arrayOfFixed : (java.util.List<com.linkedin.avro.fastserde.generated.avro.FixedOfSize10>) defaultValue(fields()[1]);
        record.mapOfFixed = fieldSetFlags()[2] ? this.mapOfFixed : (java.util.Map<java.lang.CharSequence,com.linkedin.avro.fastserde.generated.avro.FixedOfSize10>) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<FastSerdeFixed>
    WRITER$ = (org.apache.avro.io.DatumWriter<FastSerdeFixed>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<FastSerdeFixed>
    READER$ = (org.apache.avro.io.DatumReader<FastSerdeFixed>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeFixed(this.fixedField.bytes(), 0, 10);

    if (this.arrayOfFixed == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      long size0 = this.arrayOfFixed.size();
      out.writeArrayStart();
      out.setItemCount(size0);
      long actualSize0 = 0;
      for (com.linkedin.avro.fastserde.generated.avro.FixedOfSize10 e0: this.arrayOfFixed) {
        actualSize0++;
        out.startItem();
        out.writeFixed(e0.bytes(), 0, 10);
      }
      out.writeArrayEnd();
      if (actualSize0 != size0)
        throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");
    }

    long size1 = this.mapOfFixed.size();
    out.writeMapStart();
    out.setItemCount(size1);
    long actualSize1 = 0;
    for (java.util.Map.Entry<java.lang.CharSequence, com.linkedin.avro.fastserde.generated.avro.FixedOfSize10> e1: this.mapOfFixed.entrySet()) {
      actualSize1++;
      out.startItem();
      out.writeString(e1.getKey());
      com.linkedin.avro.fastserde.generated.avro.FixedOfSize10 v1 = e1.getValue();
      out.writeFixed(v1.bytes(), 0, 10);
    }
    out.writeMapEnd();
    if (actualSize1 != size1)
      throw new java.util.ConcurrentModificationException("Map-size written was " + size1 + ", but element count was " + actualSize1 + ".");

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (this.fixedField == null) {
        this.fixedField = new com.linkedin.avro.fastserde.generated.avro.FixedOfSize10();
      }
      in.readFixed(this.fixedField.bytes(), 0, 10);

      if (in.readIndex() != 1) {
        in.readNull();
        this.arrayOfFixed = null;
      } else {
        long size0 = in.readArrayStart();
        java.util.List<com.linkedin.avro.fastserde.generated.avro.FixedOfSize10> a0 = this.arrayOfFixed;
        if (a0 == null) {
          a0 = new SpecificData.Array<com.linkedin.avro.fastserde.generated.avro.FixedOfSize10>((int)size0, SCHEMA$.getField("arrayOfFixed").schema().getTypes().get(1));
          this.arrayOfFixed = a0;
        } else a0.clear();
        SpecificData.Array<com.linkedin.avro.fastserde.generated.avro.FixedOfSize10> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<com.linkedin.avro.fastserde.generated.avro.FixedOfSize10>)a0 : null);
        for ( ; 0 < size0; size0 = in.arrayNext()) {
          for ( ; size0 != 0; size0--) {
            com.linkedin.avro.fastserde.generated.avro.FixedOfSize10 e0 = (ga0 != null ? ga0.peek() : null);
            if (e0 == null) {
              e0 = new com.linkedin.avro.fastserde.generated.avro.FixedOfSize10();
            }
            in.readFixed(e0.bytes(), 0, 10);
            a0.add(e0);
          }
        }
      }

      long size1 = in.readMapStart();
      java.util.Map<java.lang.CharSequence,com.linkedin.avro.fastserde.generated.avro.FixedOfSize10> m1 = this.mapOfFixed; // Need fresh name due to limitation of macro system
      if (m1 == null) {
        m1 = new java.util.HashMap<java.lang.CharSequence,com.linkedin.avro.fastserde.generated.avro.FixedOfSize10>((int)size1);
        this.mapOfFixed = m1;
      } else m1.clear();
      for ( ; 0 < size1; size1 = in.mapNext()) {
        for ( ; size1 != 0; size1--) {
          java.lang.CharSequence k1 = null;
          k1 = in.readString(k1 instanceof Utf8 ? (Utf8)k1 : null);
          com.linkedin.avro.fastserde.generated.avro.FixedOfSize10 v1 = null;
          if (v1 == null) {
            v1 = new com.linkedin.avro.fastserde.generated.avro.FixedOfSize10();
          }
          in.readFixed(v1.bytes(), 0, 10);
          m1.put(k1, v1);
        }
      }

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (this.fixedField == null) {
            this.fixedField = new com.linkedin.avro.fastserde.generated.avro.FixedOfSize10();
          }
          in.readFixed(this.fixedField.bytes(), 0, 10);
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.arrayOfFixed = null;
          } else {
            long size0 = in.readArrayStart();
            java.util.List<com.linkedin.avro.fastserde.generated.avro.FixedOfSize10> a0 = this.arrayOfFixed;
            if (a0 == null) {
              a0 = new SpecificData.Array<com.linkedin.avro.fastserde.generated.avro.FixedOfSize10>((int)size0, SCHEMA$.getField("arrayOfFixed").schema().getTypes().get(1));
              this.arrayOfFixed = a0;
            } else a0.clear();
            SpecificData.Array<com.linkedin.avro.fastserde.generated.avro.FixedOfSize10> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<com.linkedin.avro.fastserde.generated.avro.FixedOfSize10>)a0 : null);
            for ( ; 0 < size0; size0 = in.arrayNext()) {
              for ( ; size0 != 0; size0--) {
                com.linkedin.avro.fastserde.generated.avro.FixedOfSize10 e0 = (ga0 != null ? ga0.peek() : null);
                if (e0 == null) {
                  e0 = new com.linkedin.avro.fastserde.generated.avro.FixedOfSize10();
                }
                in.readFixed(e0.bytes(), 0, 10);
                a0.add(e0);
              }
            }
          }
          break;

        case 2:
          long size1 = in.readMapStart();
          java.util.Map<java.lang.CharSequence,com.linkedin.avro.fastserde.generated.avro.FixedOfSize10> m1 = this.mapOfFixed; // Need fresh name due to limitation of macro system
          if (m1 == null) {
            m1 = new java.util.HashMap<java.lang.CharSequence,com.linkedin.avro.fastserde.generated.avro.FixedOfSize10>((int)size1);
            this.mapOfFixed = m1;
          } else m1.clear();
          for ( ; 0 < size1; size1 = in.mapNext()) {
            for ( ; size1 != 0; size1--) {
              java.lang.CharSequence k1 = null;
              k1 = in.readString(k1 instanceof Utf8 ? (Utf8)k1 : null);
              com.linkedin.avro.fastserde.generated.avro.FixedOfSize10 v1 = null;
              if (v1 == null) {
                v1 = new com.linkedin.avro.fastserde.generated.avro.FixedOfSize10();
              }
              in.readFixed(v1.bytes(), 0, 10);
              m1.put(k1, v1);
            }
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










