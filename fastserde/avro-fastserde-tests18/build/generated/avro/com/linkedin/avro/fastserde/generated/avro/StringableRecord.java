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
@org.apache.avro.specific.AvroGenerated
public class StringableRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8693716701433511931L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"StringableRecord\",\"namespace\":\"com.linkedin.avro.fastserde.generated.avro\",\"fields\":[{\"name\":\"biginteger\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigInteger\"}},{\"name\":\"bigdecimal\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"}},{\"name\":\"uri\",\"type\":{\"type\":\"string\",\"java-class\":\"java.net.URI\"}},{\"name\":\"url\",\"type\":{\"type\":\"string\",\"java-class\":\"java.net.URL\"}},{\"name\":\"file\",\"type\":{\"type\":\"string\",\"java-class\":\"java.io.File\"}},{\"name\":\"urlArray\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"java-class\":\"java.net.URL\"}}},{\"name\":\"urlMap\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"string\",\"java-class\":\"java.math.BigInteger\"},\"java-key-class\":\"java.net.URL\"}},{\"name\":\"subRecord\",\"type\":{\"type\":\"record\",\"name\":\"StringableSubRecord\",\"fields\":[{\"name\":\"uriField\",\"type\":{\"type\":\"string\",\"java-class\":\"java.net.URI\"}},{\"name\":\"nullStringIntUnion\",\"type\":[\"null\",\"string\",\"int\"]}]}},{\"name\":\"subRecordWithSubRecord\",\"type\":{\"type\":\"record\",\"name\":\"AnotherSubRecord\",\"fields\":[{\"name\":\"subRecord\",\"type\":\"StringableSubRecord\"}]}},{\"name\":\"stringUnion\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<StringableRecord> ENCODER =
      new BinaryMessageEncoder<StringableRecord>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<StringableRecord> DECODER =
      new BinaryMessageDecoder<StringableRecord>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<StringableRecord> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<StringableRecord> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<StringableRecord>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this StringableRecord to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a StringableRecord from a ByteBuffer. */
  public static StringableRecord fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.math.BigInteger biginteger;
  @Deprecated public java.math.BigDecimal bigdecimal;
  @Deprecated public java.net.URI uri;
  @Deprecated public java.net.URL url;
  @Deprecated public java.io.File file;
  @Deprecated public java.util.List<java.net.URL> urlArray;
  @Deprecated public java.util.Map<java.net.URL,java.math.BigInteger> urlMap;
  @Deprecated public com.linkedin.avro.fastserde.generated.avro.StringableSubRecord subRecord;
  @Deprecated public com.linkedin.avro.fastserde.generated.avro.AnotherSubRecord subRecordWithSubRecord;
  @Deprecated public java.lang.CharSequence stringUnion;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public StringableRecord() {}

  /**
   * All-args constructor.
   * @param biginteger The new value for biginteger
   * @param bigdecimal The new value for bigdecimal
   * @param uri The new value for uri
   * @param url The new value for url
   * @param file The new value for file
   * @param urlArray The new value for urlArray
   * @param urlMap The new value for urlMap
   * @param subRecord The new value for subRecord
   * @param subRecordWithSubRecord The new value for subRecordWithSubRecord
   * @param stringUnion The new value for stringUnion
   */
  public StringableRecord(java.math.BigInteger biginteger, java.math.BigDecimal bigdecimal, java.net.URI uri, java.net.URL url, java.io.File file, java.util.List<java.net.URL> urlArray, java.util.Map<java.net.URL,java.math.BigInteger> urlMap, com.linkedin.avro.fastserde.generated.avro.StringableSubRecord subRecord, com.linkedin.avro.fastserde.generated.avro.AnotherSubRecord subRecordWithSubRecord, java.lang.CharSequence stringUnion) {
    this.biginteger = biginteger;
    this.bigdecimal = bigdecimal;
    this.uri = uri;
    this.url = url;
    this.file = file;
    this.urlArray = urlArray;
    this.urlMap = urlMap;
    this.subRecord = subRecord;
    this.subRecordWithSubRecord = subRecordWithSubRecord;
    this.stringUnion = stringUnion;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return biginteger;
    case 1: return bigdecimal;
    case 2: return uri;
    case 3: return url;
    case 4: return file;
    case 5: return urlArray;
    case 6: return urlMap;
    case 7: return subRecord;
    case 8: return subRecordWithSubRecord;
    case 9: return stringUnion;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: biginteger = (java.math.BigInteger)value$; break;
    case 1: bigdecimal = (java.math.BigDecimal)value$; break;
    case 2: uri = (java.net.URI)value$; break;
    case 3: url = (java.net.URL)value$; break;
    case 4: file = (java.io.File)value$; break;
    case 5: urlArray = (java.util.List<java.net.URL>)value$; break;
    case 6: urlMap = (java.util.Map<java.net.URL,java.math.BigInteger>)value$; break;
    case 7: subRecord = (com.linkedin.avro.fastserde.generated.avro.StringableSubRecord)value$; break;
    case 8: subRecordWithSubRecord = (com.linkedin.avro.fastserde.generated.avro.AnotherSubRecord)value$; break;
    case 9: stringUnion = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'biginteger' field.
   * @return The value of the 'biginteger' field.
   */
  public java.math.BigInteger getBiginteger() {
    return biginteger;
  }

  /**
   * Sets the value of the 'biginteger' field.
   * @param value the value to set.
   */
  public void setBiginteger(java.math.BigInteger value) {
    this.biginteger = value;
  }

  /**
   * Gets the value of the 'bigdecimal' field.
   * @return The value of the 'bigdecimal' field.
   */
  public java.math.BigDecimal getBigdecimal() {
    return bigdecimal;
  }

  /**
   * Sets the value of the 'bigdecimal' field.
   * @param value the value to set.
   */
  public void setBigdecimal(java.math.BigDecimal value) {
    this.bigdecimal = value;
  }

  /**
   * Gets the value of the 'uri' field.
   * @return The value of the 'uri' field.
   */
  public java.net.URI getUri() {
    return uri;
  }

  /**
   * Sets the value of the 'uri' field.
   * @param value the value to set.
   */
  public void setUri(java.net.URI value) {
    this.uri = value;
  }

  /**
   * Gets the value of the 'url' field.
   * @return The value of the 'url' field.
   */
  public java.net.URL getUrl() {
    return url;
  }

  /**
   * Sets the value of the 'url' field.
   * @param value the value to set.
   */
  public void setUrl(java.net.URL value) {
    this.url = value;
  }

  /**
   * Gets the value of the 'file' field.
   * @return The value of the 'file' field.
   */
  public java.io.File getFile() {
    return file;
  }

  /**
   * Sets the value of the 'file' field.
   * @param value the value to set.
   */
  public void setFile(java.io.File value) {
    this.file = value;
  }

  /**
   * Gets the value of the 'urlArray' field.
   * @return The value of the 'urlArray' field.
   */
  public java.util.List<java.net.URL> getUrlArray() {
    return urlArray;
  }

  /**
   * Sets the value of the 'urlArray' field.
   * @param value the value to set.
   */
  public void setUrlArray(java.util.List<java.net.URL> value) {
    this.urlArray = value;
  }

  /**
   * Gets the value of the 'urlMap' field.
   * @return The value of the 'urlMap' field.
   */
  public java.util.Map<java.net.URL,java.math.BigInteger> getUrlMap() {
    return urlMap;
  }

  /**
   * Sets the value of the 'urlMap' field.
   * @param value the value to set.
   */
  public void setUrlMap(java.util.Map<java.net.URL,java.math.BigInteger> value) {
    this.urlMap = value;
  }

  /**
   * Gets the value of the 'subRecord' field.
   * @return The value of the 'subRecord' field.
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

  /**
   * Gets the value of the 'subRecordWithSubRecord' field.
   * @return The value of the 'subRecordWithSubRecord' field.
   */
  public com.linkedin.avro.fastserde.generated.avro.AnotherSubRecord getSubRecordWithSubRecord() {
    return subRecordWithSubRecord;
  }

  /**
   * Sets the value of the 'subRecordWithSubRecord' field.
   * @param value the value to set.
   */
  public void setSubRecordWithSubRecord(com.linkedin.avro.fastserde.generated.avro.AnotherSubRecord value) {
    this.subRecordWithSubRecord = value;
  }

  /**
   * Gets the value of the 'stringUnion' field.
   * @return The value of the 'stringUnion' field.
   */
  public java.lang.CharSequence getStringUnion() {
    return stringUnion;
  }

  /**
   * Sets the value of the 'stringUnion' field.
   * @param value the value to set.
   */
  public void setStringUnion(java.lang.CharSequence value) {
    this.stringUnion = value;
  }

  /**
   * Creates a new StringableRecord RecordBuilder.
   * @return A new StringableRecord RecordBuilder
   */
  public static com.linkedin.avro.fastserde.generated.avro.StringableRecord.Builder newBuilder() {
    return new com.linkedin.avro.fastserde.generated.avro.StringableRecord.Builder();
  }

  /**
   * Creates a new StringableRecord RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new StringableRecord RecordBuilder
   */
  public static com.linkedin.avro.fastserde.generated.avro.StringableRecord.Builder newBuilder(com.linkedin.avro.fastserde.generated.avro.StringableRecord.Builder other) {
    return new com.linkedin.avro.fastserde.generated.avro.StringableRecord.Builder(other);
  }

  /**
   * Creates a new StringableRecord RecordBuilder by copying an existing StringableRecord instance.
   * @param other The existing instance to copy.
   * @return A new StringableRecord RecordBuilder
   */
  public static com.linkedin.avro.fastserde.generated.avro.StringableRecord.Builder newBuilder(com.linkedin.avro.fastserde.generated.avro.StringableRecord other) {
    return new com.linkedin.avro.fastserde.generated.avro.StringableRecord.Builder(other);
  }

  /**
   * RecordBuilder for StringableRecord instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<StringableRecord>
    implements org.apache.avro.data.RecordBuilder<StringableRecord> {

    private java.math.BigInteger biginteger;
    private java.math.BigDecimal bigdecimal;
    private java.net.URI uri;
    private java.net.URL url;
    private java.io.File file;
    private java.util.List<java.net.URL> urlArray;
    private java.util.Map<java.net.URL,java.math.BigInteger> urlMap;
    private com.linkedin.avro.fastserde.generated.avro.StringableSubRecord subRecord;
    private com.linkedin.avro.fastserde.generated.avro.StringableSubRecord.Builder subRecordBuilder;
    private com.linkedin.avro.fastserde.generated.avro.AnotherSubRecord subRecordWithSubRecord;
    private com.linkedin.avro.fastserde.generated.avro.AnotherSubRecord.Builder subRecordWithSubRecordBuilder;
    private java.lang.CharSequence stringUnion;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.linkedin.avro.fastserde.generated.avro.StringableRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.biginteger)) {
        this.biginteger = data().deepCopy(fields()[0].schema(), other.biginteger);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.bigdecimal)) {
        this.bigdecimal = data().deepCopy(fields()[1].schema(), other.bigdecimal);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.uri)) {
        this.uri = data().deepCopy(fields()[2].schema(), other.uri);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.url)) {
        this.url = data().deepCopy(fields()[3].schema(), other.url);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.file)) {
        this.file = data().deepCopy(fields()[4].schema(), other.file);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.urlArray)) {
        this.urlArray = data().deepCopy(fields()[5].schema(), other.urlArray);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.urlMap)) {
        this.urlMap = data().deepCopy(fields()[6].schema(), other.urlMap);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.subRecord)) {
        this.subRecord = data().deepCopy(fields()[7].schema(), other.subRecord);
        fieldSetFlags()[7] = true;
      }
      if (other.hasSubRecordBuilder()) {
        this.subRecordBuilder = com.linkedin.avro.fastserde.generated.avro.StringableSubRecord.newBuilder(other.getSubRecordBuilder());
      }
      if (isValidValue(fields()[8], other.subRecordWithSubRecord)) {
        this.subRecordWithSubRecord = data().deepCopy(fields()[8].schema(), other.subRecordWithSubRecord);
        fieldSetFlags()[8] = true;
      }
      if (other.hasSubRecordWithSubRecordBuilder()) {
        this.subRecordWithSubRecordBuilder = com.linkedin.avro.fastserde.generated.avro.AnotherSubRecord.newBuilder(other.getSubRecordWithSubRecordBuilder());
      }
      if (isValidValue(fields()[9], other.stringUnion)) {
        this.stringUnion = data().deepCopy(fields()[9].schema(), other.stringUnion);
        fieldSetFlags()[9] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing StringableRecord instance
     * @param other The existing instance to copy.
     */
    private Builder(com.linkedin.avro.fastserde.generated.avro.StringableRecord other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.biginteger)) {
        this.biginteger = data().deepCopy(fields()[0].schema(), other.biginteger);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.bigdecimal)) {
        this.bigdecimal = data().deepCopy(fields()[1].schema(), other.bigdecimal);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.uri)) {
        this.uri = data().deepCopy(fields()[2].schema(), other.uri);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.url)) {
        this.url = data().deepCopy(fields()[3].schema(), other.url);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.file)) {
        this.file = data().deepCopy(fields()[4].schema(), other.file);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.urlArray)) {
        this.urlArray = data().deepCopy(fields()[5].schema(), other.urlArray);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.urlMap)) {
        this.urlMap = data().deepCopy(fields()[6].schema(), other.urlMap);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.subRecord)) {
        this.subRecord = data().deepCopy(fields()[7].schema(), other.subRecord);
        fieldSetFlags()[7] = true;
      }
      this.subRecordBuilder = null;
      if (isValidValue(fields()[8], other.subRecordWithSubRecord)) {
        this.subRecordWithSubRecord = data().deepCopy(fields()[8].schema(), other.subRecordWithSubRecord);
        fieldSetFlags()[8] = true;
      }
      this.subRecordWithSubRecordBuilder = null;
      if (isValidValue(fields()[9], other.stringUnion)) {
        this.stringUnion = data().deepCopy(fields()[9].schema(), other.stringUnion);
        fieldSetFlags()[9] = true;
      }
    }

    /**
      * Gets the value of the 'biginteger' field.
      * @return The value.
      */
    public java.math.BigInteger getBiginteger() {
      return biginteger;
    }

    /**
      * Sets the value of the 'biginteger' field.
      * @param value The value of 'biginteger'.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.StringableRecord.Builder setBiginteger(java.math.BigInteger value) {
      validate(fields()[0], value);
      this.biginteger = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'biginteger' field has been set.
      * @return True if the 'biginteger' field has been set, false otherwise.
      */
    public boolean hasBiginteger() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'biginteger' field.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.StringableRecord.Builder clearBiginteger() {
      biginteger = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'bigdecimal' field.
      * @return The value.
      */
    public java.math.BigDecimal getBigdecimal() {
      return bigdecimal;
    }

    /**
      * Sets the value of the 'bigdecimal' field.
      * @param value The value of 'bigdecimal'.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.StringableRecord.Builder setBigdecimal(java.math.BigDecimal value) {
      validate(fields()[1], value);
      this.bigdecimal = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'bigdecimal' field has been set.
      * @return True if the 'bigdecimal' field has been set, false otherwise.
      */
    public boolean hasBigdecimal() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'bigdecimal' field.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.StringableRecord.Builder clearBigdecimal() {
      bigdecimal = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'uri' field.
      * @return The value.
      */
    public java.net.URI getUri() {
      return uri;
    }

    /**
      * Sets the value of the 'uri' field.
      * @param value The value of 'uri'.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.StringableRecord.Builder setUri(java.net.URI value) {
      validate(fields()[2], value);
      this.uri = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'uri' field has been set.
      * @return True if the 'uri' field has been set, false otherwise.
      */
    public boolean hasUri() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'uri' field.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.StringableRecord.Builder clearUri() {
      uri = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'url' field.
      * @return The value.
      */
    public java.net.URL getUrl() {
      return url;
    }

    /**
      * Sets the value of the 'url' field.
      * @param value The value of 'url'.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.StringableRecord.Builder setUrl(java.net.URL value) {
      validate(fields()[3], value);
      this.url = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'url' field has been set.
      * @return True if the 'url' field has been set, false otherwise.
      */
    public boolean hasUrl() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'url' field.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.StringableRecord.Builder clearUrl() {
      url = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'file' field.
      * @return The value.
      */
    public java.io.File getFile() {
      return file;
    }

    /**
      * Sets the value of the 'file' field.
      * @param value The value of 'file'.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.StringableRecord.Builder setFile(java.io.File value) {
      validate(fields()[4], value);
      this.file = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'file' field has been set.
      * @return True if the 'file' field has been set, false otherwise.
      */
    public boolean hasFile() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'file' field.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.StringableRecord.Builder clearFile() {
      file = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'urlArray' field.
      * @return The value.
      */
    public java.util.List<java.net.URL> getUrlArray() {
      return urlArray;
    }

    /**
      * Sets the value of the 'urlArray' field.
      * @param value The value of 'urlArray'.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.StringableRecord.Builder setUrlArray(java.util.List<java.net.URL> value) {
      validate(fields()[5], value);
      this.urlArray = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'urlArray' field has been set.
      * @return True if the 'urlArray' field has been set, false otherwise.
      */
    public boolean hasUrlArray() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'urlArray' field.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.StringableRecord.Builder clearUrlArray() {
      urlArray = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'urlMap' field.
      * @return The value.
      */
    public java.util.Map<java.net.URL,java.math.BigInteger> getUrlMap() {
      return urlMap;
    }

    /**
      * Sets the value of the 'urlMap' field.
      * @param value The value of 'urlMap'.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.StringableRecord.Builder setUrlMap(java.util.Map<java.net.URL,java.math.BigInteger> value) {
      validate(fields()[6], value);
      this.urlMap = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'urlMap' field has been set.
      * @return True if the 'urlMap' field has been set, false otherwise.
      */
    public boolean hasUrlMap() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'urlMap' field.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.StringableRecord.Builder clearUrlMap() {
      urlMap = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'subRecord' field.
      * @return The value.
      */
    public com.linkedin.avro.fastserde.generated.avro.StringableSubRecord getSubRecord() {
      return subRecord;
    }

    /**
      * Sets the value of the 'subRecord' field.
      * @param value The value of 'subRecord'.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.StringableRecord.Builder setSubRecord(com.linkedin.avro.fastserde.generated.avro.StringableSubRecord value) {
      validate(fields()[7], value);
      this.subRecordBuilder = null;
      this.subRecord = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'subRecord' field has been set.
      * @return True if the 'subRecord' field has been set, false otherwise.
      */
    public boolean hasSubRecord() {
      return fieldSetFlags()[7];
    }

    /**
     * Gets the Builder instance for the 'subRecord' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.linkedin.avro.fastserde.generated.avro.StringableSubRecord.Builder getSubRecordBuilder() {
      if (subRecordBuilder == null) {
        if (hasSubRecord()) {
          setSubRecordBuilder(com.linkedin.avro.fastserde.generated.avro.StringableSubRecord.newBuilder(subRecord));
        } else {
          setSubRecordBuilder(com.linkedin.avro.fastserde.generated.avro.StringableSubRecord.newBuilder());
        }
      }
      return subRecordBuilder;
    }

    /**
     * Sets the Builder instance for the 'subRecord' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.linkedin.avro.fastserde.generated.avro.StringableRecord.Builder setSubRecordBuilder(com.linkedin.avro.fastserde.generated.avro.StringableSubRecord.Builder value) {
      clearSubRecord();
      subRecordBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'subRecord' field has an active Builder instance
     * @return True if the 'subRecord' field has an active Builder instance
     */
    public boolean hasSubRecordBuilder() {
      return subRecordBuilder != null;
    }

    /**
      * Clears the value of the 'subRecord' field.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.StringableRecord.Builder clearSubRecord() {
      subRecord = null;
      subRecordBuilder = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'subRecordWithSubRecord' field.
      * @return The value.
      */
    public com.linkedin.avro.fastserde.generated.avro.AnotherSubRecord getSubRecordWithSubRecord() {
      return subRecordWithSubRecord;
    }

    /**
      * Sets the value of the 'subRecordWithSubRecord' field.
      * @param value The value of 'subRecordWithSubRecord'.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.StringableRecord.Builder setSubRecordWithSubRecord(com.linkedin.avro.fastserde.generated.avro.AnotherSubRecord value) {
      validate(fields()[8], value);
      this.subRecordWithSubRecordBuilder = null;
      this.subRecordWithSubRecord = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'subRecordWithSubRecord' field has been set.
      * @return True if the 'subRecordWithSubRecord' field has been set, false otherwise.
      */
    public boolean hasSubRecordWithSubRecord() {
      return fieldSetFlags()[8];
    }

    /**
     * Gets the Builder instance for the 'subRecordWithSubRecord' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.linkedin.avro.fastserde.generated.avro.AnotherSubRecord.Builder getSubRecordWithSubRecordBuilder() {
      if (subRecordWithSubRecordBuilder == null) {
        if (hasSubRecordWithSubRecord()) {
          setSubRecordWithSubRecordBuilder(com.linkedin.avro.fastserde.generated.avro.AnotherSubRecord.newBuilder(subRecordWithSubRecord));
        } else {
          setSubRecordWithSubRecordBuilder(com.linkedin.avro.fastserde.generated.avro.AnotherSubRecord.newBuilder());
        }
      }
      return subRecordWithSubRecordBuilder;
    }

    /**
     * Sets the Builder instance for the 'subRecordWithSubRecord' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.linkedin.avro.fastserde.generated.avro.StringableRecord.Builder setSubRecordWithSubRecordBuilder(com.linkedin.avro.fastserde.generated.avro.AnotherSubRecord.Builder value) {
      clearSubRecordWithSubRecord();
      subRecordWithSubRecordBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'subRecordWithSubRecord' field has an active Builder instance
     * @return True if the 'subRecordWithSubRecord' field has an active Builder instance
     */
    public boolean hasSubRecordWithSubRecordBuilder() {
      return subRecordWithSubRecordBuilder != null;
    }

    /**
      * Clears the value of the 'subRecordWithSubRecord' field.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.StringableRecord.Builder clearSubRecordWithSubRecord() {
      subRecordWithSubRecord = null;
      subRecordWithSubRecordBuilder = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'stringUnion' field.
      * @return The value.
      */
    public java.lang.CharSequence getStringUnion() {
      return stringUnion;
    }

    /**
      * Sets the value of the 'stringUnion' field.
      * @param value The value of 'stringUnion'.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.StringableRecord.Builder setStringUnion(java.lang.CharSequence value) {
      validate(fields()[9], value);
      this.stringUnion = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'stringUnion' field has been set.
      * @return True if the 'stringUnion' field has been set, false otherwise.
      */
    public boolean hasStringUnion() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'stringUnion' field.
      * @return This builder.
      */
    public com.linkedin.avro.fastserde.generated.avro.StringableRecord.Builder clearStringUnion() {
      stringUnion = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public StringableRecord build() {
      try {
        StringableRecord record = new StringableRecord();
        record.biginteger = fieldSetFlags()[0] ? this.biginteger : (java.math.BigInteger) defaultValue(fields()[0]);
        record.bigdecimal = fieldSetFlags()[1] ? this.bigdecimal : (java.math.BigDecimal) defaultValue(fields()[1]);
        record.uri = fieldSetFlags()[2] ? this.uri : (java.net.URI) defaultValue(fields()[2]);
        record.url = fieldSetFlags()[3] ? this.url : (java.net.URL) defaultValue(fields()[3]);
        record.file = fieldSetFlags()[4] ? this.file : (java.io.File) defaultValue(fields()[4]);
        record.urlArray = fieldSetFlags()[5] ? this.urlArray : (java.util.List<java.net.URL>) defaultValue(fields()[5]);
        record.urlMap = fieldSetFlags()[6] ? this.urlMap : (java.util.Map<java.net.URL,java.math.BigInteger>) defaultValue(fields()[6]);
        if (subRecordBuilder != null) {
          record.subRecord = this.subRecordBuilder.build();
        } else {
          record.subRecord = fieldSetFlags()[7] ? this.subRecord : (com.linkedin.avro.fastserde.generated.avro.StringableSubRecord) defaultValue(fields()[7]);
        }
        if (subRecordWithSubRecordBuilder != null) {
          record.subRecordWithSubRecord = this.subRecordWithSubRecordBuilder.build();
        } else {
          record.subRecordWithSubRecord = fieldSetFlags()[8] ? this.subRecordWithSubRecord : (com.linkedin.avro.fastserde.generated.avro.AnotherSubRecord) defaultValue(fields()[8]);
        }
        record.stringUnion = fieldSetFlags()[9] ? this.stringUnion : (java.lang.CharSequence) defaultValue(fields()[9]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<StringableRecord>
    WRITER$ = (org.apache.avro.io.DatumWriter<StringableRecord>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<StringableRecord>
    READER$ = (org.apache.avro.io.DatumReader<StringableRecord>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
