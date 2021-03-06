/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.librairy.service.learner.facade.model;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class TopicsRequest extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TopicsRequest\",\"namespace\":\"org.librairy.service.learner.facade.model\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"description\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"created by librAIry\"},{\"name\":\"version\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"1.0\"},{\"name\":\"contactEmail\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"parameters\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"},\"default\":{}},{\"name\":\"annotate\",\"type\":\"boolean\",\"default\":false},{\"name\":\"from\",\"type\":{\"type\":\"record\",\"name\":\"DataSource\",\"fields\":[{\"name\":\"url\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"format\",\"type\":{\"type\":\"enum\",\"name\":\"Format\",\"symbols\":[\"SOLR_CORE\",\"CSV\",\"CSV_TAR_GZ\",\"JSONL\",\"JSONL_TAR_GZ\"]}},{\"name\":\"filter\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"},{\"name\":\"size\",\"type\":\"long\",\"default\":-1},{\"name\":\"offset\",\"type\":\"long\",\"default\":0},{\"name\":\"cache\",\"type\":\"boolean\",\"default\":false},{\"name\":\"credentials\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Credentials\",\"fields\":[{\"name\":\"user\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"password\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"apikey\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null},{\"name\":\"fields\",\"type\":{\"type\":\"record\",\"name\":\"DataFields\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"labels\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[]},{\"name\":\"text\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[]}]}}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String name;
   private java.lang.String description;
   private java.lang.String version;
   private java.lang.String contactEmail;
   private java.util.Map<java.lang.String,java.lang.String> parameters;
   private boolean annotate;
   private org.librairy.service.learner.facade.model.DataSource from;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public TopicsRequest() {}

  /**
   * All-args constructor.
   */
  public TopicsRequest(java.lang.String name, java.lang.String description, java.lang.String version, java.lang.String contactEmail, java.util.Map<java.lang.String,java.lang.String> parameters, java.lang.Boolean annotate, org.librairy.service.learner.facade.model.DataSource from) {
    this.name = name;
    this.description = description;
    this.version = version;
    this.contactEmail = contactEmail;
    this.parameters = parameters;
    this.annotate = annotate;
    this.from = from;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return description;
    case 2: return version;
    case 3: return contactEmail;
    case 4: return parameters;
    case 5: return annotate;
    case 6: return from;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.String)value$; break;
    case 1: description = (java.lang.String)value$; break;
    case 2: version = (java.lang.String)value$; break;
    case 3: contactEmail = (java.lang.String)value$; break;
    case 4: parameters = (java.util.Map<java.lang.String,java.lang.String>)value$; break;
    case 5: annotate = (java.lang.Boolean)value$; break;
    case 6: from = (org.librairy.service.learner.facade.model.DataSource)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'description' field.
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Sets the value of the 'description' field.
   * @param value the value to set.
   */
  public void setDescription(java.lang.String value) {
    this.description = value;
  }

  /**
   * Gets the value of the 'version' field.
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * Sets the value of the 'version' field.
   * @param value the value to set.
   */
  public void setVersion(java.lang.String value) {
    this.version = value;
  }

  /**
   * Gets the value of the 'contactEmail' field.
   */
  public java.lang.String getContactEmail() {
    return contactEmail;
  }

  /**
   * Sets the value of the 'contactEmail' field.
   * @param value the value to set.
   */
  public void setContactEmail(java.lang.String value) {
    this.contactEmail = value;
  }

  /**
   * Gets the value of the 'parameters' field.
   */
  public java.util.Map<java.lang.String,java.lang.String> getParameters() {
    return parameters;
  }

  /**
   * Sets the value of the 'parameters' field.
   * @param value the value to set.
   */
  public void setParameters(java.util.Map<java.lang.String,java.lang.String> value) {
    this.parameters = value;
  }

  /**
   * Gets the value of the 'annotate' field.
   */
  public java.lang.Boolean getAnnotate() {
    return annotate;
  }

  /**
   * Sets the value of the 'annotate' field.
   * @param value the value to set.
   */
  public void setAnnotate(java.lang.Boolean value) {
    this.annotate = value;
  }

  /**
   * Gets the value of the 'from' field.
   */
  public org.librairy.service.learner.facade.model.DataSource getFrom() {
    return from;
  }

  /**
   * Sets the value of the 'from' field.
   * @param value the value to set.
   */
  public void setFrom(org.librairy.service.learner.facade.model.DataSource value) {
    this.from = value;
  }

  /** Creates a new TopicsRequest RecordBuilder */
  public static org.librairy.service.learner.facade.model.TopicsRequest.Builder newBuilder() {
    return new org.librairy.service.learner.facade.model.TopicsRequest.Builder();
  }
  
  /** Creates a new TopicsRequest RecordBuilder by copying an existing Builder */
  public static org.librairy.service.learner.facade.model.TopicsRequest.Builder newBuilder(org.librairy.service.learner.facade.model.TopicsRequest.Builder other) {
    return new org.librairy.service.learner.facade.model.TopicsRequest.Builder(other);
  }
  
  /** Creates a new TopicsRequest RecordBuilder by copying an existing TopicsRequest instance */
  public static org.librairy.service.learner.facade.model.TopicsRequest.Builder newBuilder(org.librairy.service.learner.facade.model.TopicsRequest other) {
    return new org.librairy.service.learner.facade.model.TopicsRequest.Builder(other);
  }
  
  /**
   * RecordBuilder for TopicsRequest instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TopicsRequest>
    implements org.apache.avro.data.RecordBuilder<TopicsRequest> {

    private java.lang.String name;
    private java.lang.String description;
    private java.lang.String version;
    private java.lang.String contactEmail;
    private java.util.Map<java.lang.String,java.lang.String> parameters;
    private boolean annotate;
    private org.librairy.service.learner.facade.model.DataSource from;

    /** Creates a new Builder */
    private Builder() {
      super(org.librairy.service.learner.facade.model.TopicsRequest.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.librairy.service.learner.facade.model.TopicsRequest.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.description)) {
        this.description = data().deepCopy(fields()[1].schema(), other.description);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.version)) {
        this.version = data().deepCopy(fields()[2].schema(), other.version);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.contactEmail)) {
        this.contactEmail = data().deepCopy(fields()[3].schema(), other.contactEmail);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.parameters)) {
        this.parameters = data().deepCopy(fields()[4].schema(), other.parameters);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.annotate)) {
        this.annotate = data().deepCopy(fields()[5].schema(), other.annotate);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.from)) {
        this.from = data().deepCopy(fields()[6].schema(), other.from);
        fieldSetFlags()[6] = true;
      }
    }
    
    /** Creates a Builder by copying an existing TopicsRequest instance */
    private Builder(org.librairy.service.learner.facade.model.TopicsRequest other) {
            super(org.librairy.service.learner.facade.model.TopicsRequest.SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.description)) {
        this.description = data().deepCopy(fields()[1].schema(), other.description);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.version)) {
        this.version = data().deepCopy(fields()[2].schema(), other.version);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.contactEmail)) {
        this.contactEmail = data().deepCopy(fields()[3].schema(), other.contactEmail);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.parameters)) {
        this.parameters = data().deepCopy(fields()[4].schema(), other.parameters);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.annotate)) {
        this.annotate = data().deepCopy(fields()[5].schema(), other.annotate);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.from)) {
        this.from = data().deepCopy(fields()[6].schema(), other.from);
        fieldSetFlags()[6] = true;
      }
    }

    /** Gets the value of the 'name' field */
    public java.lang.String getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public org.librairy.service.learner.facade.model.TopicsRequest.Builder setName(java.lang.String value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'name' field */
    public org.librairy.service.learner.facade.model.TopicsRequest.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'description' field */
    public java.lang.String getDescription() {
      return description;
    }
    
    /** Sets the value of the 'description' field */
    public org.librairy.service.learner.facade.model.TopicsRequest.Builder setDescription(java.lang.String value) {
      validate(fields()[1], value);
      this.description = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'description' field has been set */
    public boolean hasDescription() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'description' field */
    public org.librairy.service.learner.facade.model.TopicsRequest.Builder clearDescription() {
      description = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'version' field */
    public java.lang.String getVersion() {
      return version;
    }
    
    /** Sets the value of the 'version' field */
    public org.librairy.service.learner.facade.model.TopicsRequest.Builder setVersion(java.lang.String value) {
      validate(fields()[2], value);
      this.version = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'version' field has been set */
    public boolean hasVersion() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'version' field */
    public org.librairy.service.learner.facade.model.TopicsRequest.Builder clearVersion() {
      version = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'contactEmail' field */
    public java.lang.String getContactEmail() {
      return contactEmail;
    }
    
    /** Sets the value of the 'contactEmail' field */
    public org.librairy.service.learner.facade.model.TopicsRequest.Builder setContactEmail(java.lang.String value) {
      validate(fields()[3], value);
      this.contactEmail = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'contactEmail' field has been set */
    public boolean hasContactEmail() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'contactEmail' field */
    public org.librairy.service.learner.facade.model.TopicsRequest.Builder clearContactEmail() {
      contactEmail = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'parameters' field */
    public java.util.Map<java.lang.String,java.lang.String> getParameters() {
      return parameters;
    }
    
    /** Sets the value of the 'parameters' field */
    public org.librairy.service.learner.facade.model.TopicsRequest.Builder setParameters(java.util.Map<java.lang.String,java.lang.String> value) {
      validate(fields()[4], value);
      this.parameters = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'parameters' field has been set */
    public boolean hasParameters() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'parameters' field */
    public org.librairy.service.learner.facade.model.TopicsRequest.Builder clearParameters() {
      parameters = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'annotate' field */
    public java.lang.Boolean getAnnotate() {
      return annotate;
    }
    
    /** Sets the value of the 'annotate' field */
    public org.librairy.service.learner.facade.model.TopicsRequest.Builder setAnnotate(boolean value) {
      validate(fields()[5], value);
      this.annotate = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'annotate' field has been set */
    public boolean hasAnnotate() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'annotate' field */
    public org.librairy.service.learner.facade.model.TopicsRequest.Builder clearAnnotate() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'from' field */
    public org.librairy.service.learner.facade.model.DataSource getFrom() {
      return from;
    }
    
    /** Sets the value of the 'from' field */
    public org.librairy.service.learner.facade.model.TopicsRequest.Builder setFrom(org.librairy.service.learner.facade.model.DataSource value) {
      validate(fields()[6], value);
      this.from = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'from' field has been set */
    public boolean hasFrom() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'from' field */
    public org.librairy.service.learner.facade.model.TopicsRequest.Builder clearFrom() {
      from = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public TopicsRequest build() {
      try {
        TopicsRequest record = new TopicsRequest();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.String) defaultValue(fields()[0]);
        record.description = fieldSetFlags()[1] ? this.description : (java.lang.String) defaultValue(fields()[1]);
        record.version = fieldSetFlags()[2] ? this.version : (java.lang.String) defaultValue(fields()[2]);
        record.contactEmail = fieldSetFlags()[3] ? this.contactEmail : (java.lang.String) defaultValue(fields()[3]);
        record.parameters = fieldSetFlags()[4] ? this.parameters : (java.util.Map<java.lang.String,java.lang.String>) defaultValue(fields()[4]);
        record.annotate = fieldSetFlags()[5] ? this.annotate : (java.lang.Boolean) defaultValue(fields()[5]);
        record.from = fieldSetFlags()[6] ? this.from : (org.librairy.service.learner.facade.model.DataSource) defaultValue(fields()[6]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
