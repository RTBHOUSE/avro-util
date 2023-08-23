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

@org.apache.avro.specific.AvroGenerated
public class OldSubRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2041353304036632780L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OldSubRecord\",\"namespace\":\"com.linkedin.avro.fastserde.generated.avro\",\"fields\":[{\"name\":\"oldSubField\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<OldSubRecord> ENCODER =
      new BinaryMessageEncoder<OldSubRecord>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<OldSubRecord> DECODER =
      new BinaryMessageDecoder<OldSubRecord>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<OldSubRecord> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<OldSubRecord> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<OldSubRecord> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<OldSubRecord>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this OldSubRecord to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a OldSubRecord from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a OldSubRecord instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static OldSubRecord fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence oldSubField;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public OldSubRecord() {}

  /**
   * All-args constructor.
   * @param oldSubField The new value for oldSubField
   */
  public OldSubRecord(java.lang.CharSequence oldSubField) {
    this.oldSubField = oldSubField;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return oldSubField;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: oldSubField = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'oldSubField' field.
   * @return The value of the 'oldSubField' field.
   */
  public java.lang.CharSequence getOldSubField() {
    return oldSubField;
  }


  /**
   * Sets the value of the 'oldSubField' field.
   * @param value the value to set.
   */
  public void setOldSubField(java.lang.CharSequence value) {
    this.oldSubField = value;
  }

  /**
   * Creates a new OldSubRecord RecordBuilder.
   * @return A new OldSubRecord RecordBuilder
   */
  public static com.linkedin.avro.fastserde.generated.avro.OldSubRecord.Builder newBuilder() {
    return new com.linkedin.avro.fastserde.generated.avro.OldSubRecord.Builder();
  }

  /**
   * Creates a new OldSubRecord RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new OldSubRecord RecordBuilder
   */
  public static com.linkedin.avro.fastserde.generated.avro.OldSubRecord.Builder newBuilder(com.linkedin.avro.fastserde.generated.avro.OldSubRecord.Builder other) {
    if (other == null) {
      return new com.linkedin.avro.fastserde.generated.avro.OldSubRecord.Builder();
    } else {
      return new com.linkedin.avro.fastserde.generated.avro.OldSubRecord.Builder(other);
    }
  }

  /**
   * Creates a new OldSubRecord RecordBuilder by copying an existing OldSubRecord instance.
   * @param other The existing instance to copy.
   * @return A new OldSubRecord RecordBuilder
   */
  public static com.linkedin.avro.fastserde.generated.avro.OldSubRecord.Builder newBuilder(com.linkedin.avro.fastserde.generated.avro.OldSubRecord other) {
    if (other == null) {
      return new com.linkedin.avro.fastserde.generated.avro.OldSubRecord.Builder();
    } else {
      return new com.linkedin.avro.fastserde.generated.avro.OldSubRecord.Builder(other);
    }
  }

  /**
   * RecordBuilder for OldSubRecord instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<OldSubRecord>
    implements org.apache.avro.data.RecordBuilder<OldSubRecord> {

    private java.lang.CharSequence oldSubField;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.linkedin.avro.fastserde.generated.avro.OldSubRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.oldSubField)) {
        this.oldSubField = data().deepCopy(fields()[0].schema(), other.oldSubField);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing OldSubRecord instance
     * @param other The existing instance to copy.
     */
    private Builder(com.linkedin.avro.fastserde.generated.avro.OldSubRecord other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.oldSubField)) {
        this.oldSubField = data().deepCopy(fields()[0].schema(), other.oldSubField);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'oldSubField' field.
      * @return The value.
      */
    public java.lang.CharSequence getOldSubField() {
      return oldSubField;
    }


    /**
      * Sets the value of the 'oldSubField' field.
      * @param value The value of 'oldSubField'.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.OldSubRecord.Builder setOldSubField(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.oldSubField = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'oldSubField' field has been set.
      * @return True if the 'oldSubField' field has been set, false otherwise.
      */
    public boolean hasOldSubField() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'oldSubField' field.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.OldSubRecord.Builder clearOldSubField() {
      oldSubField = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public OldSubRecord build() {
      try {
        OldSubRecord record = new OldSubRecord();
        record.oldSubField = fieldSetFlags()[0] ? this.oldSubField : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<OldSubRecord>
    WRITER$ = (org.apache.avro.io.DatumWriter<OldSubRecord>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<OldSubRecord>
    READER$ = (org.apache.avro.io.DatumReader<OldSubRecord>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.oldSubField);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.oldSubField = in.readString(this.oldSubField instanceof Utf8 ? (Utf8)this.oldSubField : null);

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.oldSubField = in.readString(this.oldSubField instanceof Utf8 ? (Utf8)this.oldSubField : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










