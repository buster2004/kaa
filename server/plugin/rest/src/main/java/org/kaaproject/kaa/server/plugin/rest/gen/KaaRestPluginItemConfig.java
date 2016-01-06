/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.server.plugin.rest.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class KaaRestPluginItemConfig extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"KaaRestPluginItemConfig\",\"namespace\":\"org.kaaproject.kaa.server.plugin.rest.gen\",\"fields\":[{\"name\":\"requestMapping\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"httpRequestMethod\",\"type\":{\"type\":\"enum\",\"name\":\"HttpRequestMethod\",\"symbols\":[\"GET\",\"POST\",\"PUT\",\"DELETE\"]},\"by_default\":\"GET\"},{\"name\":\"httpRequestParams\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"HttpRequestParam\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"avroSchemaField\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}},\"null\"]},{\"name\":\"responseMappings\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ResponseMapping\",\"fields\":[{\"name\":\"responseField\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"avroSchemaField\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}},\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String requestMapping;
   private org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestMethod httpRequestMethod;
   private java.util.List<org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam> httpRequestParams;
   private java.util.List<org.kaaproject.kaa.server.plugin.rest.gen.ResponseMapping> responseMappings;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public KaaRestPluginItemConfig() {}

  /**
   * All-args constructor.
   */
  public KaaRestPluginItemConfig(java.lang.String requestMapping, org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestMethod httpRequestMethod, java.util.List<org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam> httpRequestParams, java.util.List<org.kaaproject.kaa.server.plugin.rest.gen.ResponseMapping> responseMappings) {
    this.requestMapping = requestMapping;
    this.httpRequestMethod = httpRequestMethod;
    this.httpRequestParams = httpRequestParams;
    this.responseMappings = responseMappings;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return requestMapping;
    case 1: return httpRequestMethod;
    case 2: return httpRequestParams;
    case 3: return responseMappings;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: requestMapping = (java.lang.String)value$; break;
    case 1: httpRequestMethod = (org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestMethod)value$; break;
    case 2: httpRequestParams = (java.util.List<org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam>)value$; break;
    case 3: responseMappings = (java.util.List<org.kaaproject.kaa.server.plugin.rest.gen.ResponseMapping>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'requestMapping' field.
   */
  public java.lang.String getRequestMapping() {
    return requestMapping;
  }

  /**
   * Sets the value of the 'requestMapping' field.
   * @param value the value to set.
   */
  public void setRequestMapping(java.lang.String value) {
    this.requestMapping = value;
  }

  /**
   * Gets the value of the 'httpRequestMethod' field.
   */
  public org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestMethod getHttpRequestMethod() {
    return httpRequestMethod;
  }

  /**
   * Sets the value of the 'httpRequestMethod' field.
   * @param value the value to set.
   */
  public void setHttpRequestMethod(org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestMethod value) {
    this.httpRequestMethod = value;
  }

  /**
   * Gets the value of the 'httpRequestParams' field.
   */
  public java.util.List<org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam> getHttpRequestParams() {
    return httpRequestParams;
  }

  /**
   * Sets the value of the 'httpRequestParams' field.
   * @param value the value to set.
   */
  public void setHttpRequestParams(java.util.List<org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam> value) {
    this.httpRequestParams = value;
  }

  /**
   * Gets the value of the 'responseMappings' field.
   */
  public java.util.List<org.kaaproject.kaa.server.plugin.rest.gen.ResponseMapping> getResponseMappings() {
    return responseMappings;
  }

  /**
   * Sets the value of the 'responseMappings' field.
   * @param value the value to set.
   */
  public void setResponseMappings(java.util.List<org.kaaproject.kaa.server.plugin.rest.gen.ResponseMapping> value) {
    this.responseMappings = value;
  }

  /** Creates a new KaaRestPluginItemConfig RecordBuilder */
  public static org.kaaproject.kaa.server.plugin.rest.gen.KaaRestPluginItemConfig.Builder newBuilder() {
    return new org.kaaproject.kaa.server.plugin.rest.gen.KaaRestPluginItemConfig.Builder();
  }
  
  /** Creates a new KaaRestPluginItemConfig RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.server.plugin.rest.gen.KaaRestPluginItemConfig.Builder newBuilder(org.kaaproject.kaa.server.plugin.rest.gen.KaaRestPluginItemConfig.Builder other) {
    return new org.kaaproject.kaa.server.plugin.rest.gen.KaaRestPluginItemConfig.Builder(other);
  }
  
  /** Creates a new KaaRestPluginItemConfig RecordBuilder by copying an existing KaaRestPluginItemConfig instance */
  public static org.kaaproject.kaa.server.plugin.rest.gen.KaaRestPluginItemConfig.Builder newBuilder(org.kaaproject.kaa.server.plugin.rest.gen.KaaRestPluginItemConfig other) {
    return new org.kaaproject.kaa.server.plugin.rest.gen.KaaRestPluginItemConfig.Builder(other);
  }
  
  /**
   * RecordBuilder for KaaRestPluginItemConfig instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<KaaRestPluginItemConfig>
    implements org.apache.avro.data.RecordBuilder<KaaRestPluginItemConfig> {

    private java.lang.String requestMapping;
    private org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestMethod httpRequestMethod;
    private java.util.List<org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam> httpRequestParams;
    private java.util.List<org.kaaproject.kaa.server.plugin.rest.gen.ResponseMapping> responseMappings;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.server.plugin.rest.gen.KaaRestPluginItemConfig.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.server.plugin.rest.gen.KaaRestPluginItemConfig.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.requestMapping)) {
        this.requestMapping = data().deepCopy(fields()[0].schema(), other.requestMapping);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.httpRequestMethod)) {
        this.httpRequestMethod = data().deepCopy(fields()[1].schema(), other.httpRequestMethod);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.httpRequestParams)) {
        this.httpRequestParams = data().deepCopy(fields()[2].schema(), other.httpRequestParams);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.responseMappings)) {
        this.responseMappings = data().deepCopy(fields()[3].schema(), other.responseMappings);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing KaaRestPluginItemConfig instance */
    private Builder(org.kaaproject.kaa.server.plugin.rest.gen.KaaRestPluginItemConfig other) {
            super(org.kaaproject.kaa.server.plugin.rest.gen.KaaRestPluginItemConfig.SCHEMA$);
      if (isValidValue(fields()[0], other.requestMapping)) {
        this.requestMapping = data().deepCopy(fields()[0].schema(), other.requestMapping);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.httpRequestMethod)) {
        this.httpRequestMethod = data().deepCopy(fields()[1].schema(), other.httpRequestMethod);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.httpRequestParams)) {
        this.httpRequestParams = data().deepCopy(fields()[2].schema(), other.httpRequestParams);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.responseMappings)) {
        this.responseMappings = data().deepCopy(fields()[3].schema(), other.responseMappings);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'requestMapping' field */
    public java.lang.String getRequestMapping() {
      return requestMapping;
    }
    
    /** Sets the value of the 'requestMapping' field */
    public org.kaaproject.kaa.server.plugin.rest.gen.KaaRestPluginItemConfig.Builder setRequestMapping(java.lang.String value) {
      validate(fields()[0], value);
      this.requestMapping = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'requestMapping' field has been set */
    public boolean hasRequestMapping() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'requestMapping' field */
    public org.kaaproject.kaa.server.plugin.rest.gen.KaaRestPluginItemConfig.Builder clearRequestMapping() {
      requestMapping = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'httpRequestMethod' field */
    public org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestMethod getHttpRequestMethod() {
      return httpRequestMethod;
    }
    
    /** Sets the value of the 'httpRequestMethod' field */
    public org.kaaproject.kaa.server.plugin.rest.gen.KaaRestPluginItemConfig.Builder setHttpRequestMethod(org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestMethod value) {
      validate(fields()[1], value);
      this.httpRequestMethod = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'httpRequestMethod' field has been set */
    public boolean hasHttpRequestMethod() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'httpRequestMethod' field */
    public org.kaaproject.kaa.server.plugin.rest.gen.KaaRestPluginItemConfig.Builder clearHttpRequestMethod() {
      httpRequestMethod = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'httpRequestParams' field */
    public java.util.List<org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam> getHttpRequestParams() {
      return httpRequestParams;
    }
    
    /** Sets the value of the 'httpRequestParams' field */
    public org.kaaproject.kaa.server.plugin.rest.gen.KaaRestPluginItemConfig.Builder setHttpRequestParams(java.util.List<org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam> value) {
      validate(fields()[2], value);
      this.httpRequestParams = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'httpRequestParams' field has been set */
    public boolean hasHttpRequestParams() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'httpRequestParams' field */
    public org.kaaproject.kaa.server.plugin.rest.gen.KaaRestPluginItemConfig.Builder clearHttpRequestParams() {
      httpRequestParams = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'responseMappings' field */
    public java.util.List<org.kaaproject.kaa.server.plugin.rest.gen.ResponseMapping> getResponseMappings() {
      return responseMappings;
    }
    
    /** Sets the value of the 'responseMappings' field */
    public org.kaaproject.kaa.server.plugin.rest.gen.KaaRestPluginItemConfig.Builder setResponseMappings(java.util.List<org.kaaproject.kaa.server.plugin.rest.gen.ResponseMapping> value) {
      validate(fields()[3], value);
      this.responseMappings = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'responseMappings' field has been set */
    public boolean hasResponseMappings() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'responseMappings' field */
    public org.kaaproject.kaa.server.plugin.rest.gen.KaaRestPluginItemConfig.Builder clearResponseMappings() {
      responseMappings = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public KaaRestPluginItemConfig build() {
      try {
        KaaRestPluginItemConfig record = new KaaRestPluginItemConfig();
        record.requestMapping = fieldSetFlags()[0] ? this.requestMapping : (java.lang.String) defaultValue(fields()[0]);
        record.httpRequestMethod = fieldSetFlags()[1] ? this.httpRequestMethod : (org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestMethod) defaultValue(fields()[1]);
        record.httpRequestParams = fieldSetFlags()[2] ? this.httpRequestParams : (java.util.List<org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam>) defaultValue(fields()[2]);
        record.responseMappings = fieldSetFlags()[3] ? this.responseMappings : (java.util.List<org.kaaproject.kaa.server.plugin.rest.gen.ResponseMapping>) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
