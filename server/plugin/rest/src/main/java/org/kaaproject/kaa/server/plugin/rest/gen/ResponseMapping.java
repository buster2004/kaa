/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.server.plugin.rest.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ResponseMapping extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ResponseMapping\",\"namespace\":\"org.kaaproject.kaa.server.plugin.rest.gen\",\"fields\":[{\"name\":\"responseField\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"avroSchemaField\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String responseField;
   private java.lang.String avroSchemaField;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public ResponseMapping() {}

  /**
   * All-args constructor.
   */
  public ResponseMapping(java.lang.String responseField, java.lang.String avroSchemaField) {
    this.responseField = responseField;
    this.avroSchemaField = avroSchemaField;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return responseField;
    case 1: return avroSchemaField;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: responseField = (java.lang.String)value$; break;
    case 1: avroSchemaField = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'responseField' field.
   */
  public java.lang.String getResponseField() {
    return responseField;
  }

  /**
   * Sets the value of the 'responseField' field.
   * @param value the value to set.
   */
  public void setResponseField(java.lang.String value) {
    this.responseField = value;
  }

  /**
   * Gets the value of the 'avroSchemaField' field.
   */
  public java.lang.String getAvroSchemaField() {
    return avroSchemaField;
  }

  /**
   * Sets the value of the 'avroSchemaField' field.
   * @param value the value to set.
   */
  public void setAvroSchemaField(java.lang.String value) {
    this.avroSchemaField = value;
  }

  /** Creates a new ResponseMapping RecordBuilder */
  public static org.kaaproject.kaa.server.plugin.rest.gen.ResponseMapping.Builder newBuilder() {
    return new org.kaaproject.kaa.server.plugin.rest.gen.ResponseMapping.Builder();
  }
  
  /** Creates a new ResponseMapping RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.server.plugin.rest.gen.ResponseMapping.Builder newBuilder(org.kaaproject.kaa.server.plugin.rest.gen.ResponseMapping.Builder other) {
    return new org.kaaproject.kaa.server.plugin.rest.gen.ResponseMapping.Builder(other);
  }
  
  /** Creates a new ResponseMapping RecordBuilder by copying an existing ResponseMapping instance */
  public static org.kaaproject.kaa.server.plugin.rest.gen.ResponseMapping.Builder newBuilder(org.kaaproject.kaa.server.plugin.rest.gen.ResponseMapping other) {
    return new org.kaaproject.kaa.server.plugin.rest.gen.ResponseMapping.Builder(other);
  }
  
  /**
   * RecordBuilder for ResponseMapping instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ResponseMapping>
    implements org.apache.avro.data.RecordBuilder<ResponseMapping> {

    private java.lang.String responseField;
    private java.lang.String avroSchemaField;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.server.plugin.rest.gen.ResponseMapping.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.server.plugin.rest.gen.ResponseMapping.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.responseField)) {
        this.responseField = data().deepCopy(fields()[0].schema(), other.responseField);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.avroSchemaField)) {
        this.avroSchemaField = data().deepCopy(fields()[1].schema(), other.avroSchemaField);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing ResponseMapping instance */
    private Builder(org.kaaproject.kaa.server.plugin.rest.gen.ResponseMapping other) {
            super(org.kaaproject.kaa.server.plugin.rest.gen.ResponseMapping.SCHEMA$);
      if (isValidValue(fields()[0], other.responseField)) {
        this.responseField = data().deepCopy(fields()[0].schema(), other.responseField);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.avroSchemaField)) {
        this.avroSchemaField = data().deepCopy(fields()[1].schema(), other.avroSchemaField);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'responseField' field */
    public java.lang.String getResponseField() {
      return responseField;
    }
    
    /** Sets the value of the 'responseField' field */
    public org.kaaproject.kaa.server.plugin.rest.gen.ResponseMapping.Builder setResponseField(java.lang.String value) {
      validate(fields()[0], value);
      this.responseField = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'responseField' field has been set */
    public boolean hasResponseField() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'responseField' field */
    public org.kaaproject.kaa.server.plugin.rest.gen.ResponseMapping.Builder clearResponseField() {
      responseField = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'avroSchemaField' field */
    public java.lang.String getAvroSchemaField() {
      return avroSchemaField;
    }
    
    /** Sets the value of the 'avroSchemaField' field */
    public org.kaaproject.kaa.server.plugin.rest.gen.ResponseMapping.Builder setAvroSchemaField(java.lang.String value) {
      validate(fields()[1], value);
      this.avroSchemaField = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'avroSchemaField' field has been set */
    public boolean hasAvroSchemaField() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'avroSchemaField' field */
    public org.kaaproject.kaa.server.plugin.rest.gen.ResponseMapping.Builder clearAvroSchemaField() {
      avroSchemaField = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public ResponseMapping build() {
      try {
        ResponseMapping record = new ResponseMapping();
        record.responseField = fieldSetFlags()[0] ? this.responseField : (java.lang.String) defaultValue(fields()[0]);
        record.avroSchemaField = fieldSetFlags()[1] ? this.avroSchemaField : (java.lang.String) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
