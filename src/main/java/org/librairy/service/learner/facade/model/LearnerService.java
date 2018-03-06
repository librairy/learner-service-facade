/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.librairy.service.learner.facade.model;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public interface LearnerService {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"LearnerService\",\"namespace\":\"org.librairy.service.learner.facade.model\",\"types\":[{\"type\":\"record\",\"name\":\"Document\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"unknown\"},{\"name\":\"labels\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[]},{\"name\":\"text\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]},{\"type\":\"record\",\"name\":\"Word\",\"fields\":[{\"name\":\"value\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"},{\"name\":\"score\",\"type\":\"double\",\"default\":0.0}]},{\"type\":\"record\",\"name\":\"Topic\",\"fields\":[{\"name\":\"id\",\"type\":\"int\",\"default\":-1},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"},{\"name\":\"description\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"}]},{\"type\":\"record\",\"name\":\"TopicDistribution\",\"fields\":[{\"name\":\"topic\",\"type\":\"Topic\"},{\"name\":\"score\",\"type\":\"double\",\"default\":0.0}]}],\"messages\":{\"addDocument\":{\"request\":[{\"name\":\"document\",\"type\":\"Document\"}],\"response\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"reset\":{\"request\":[],\"response\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"getTopics\":{\"request\":[],\"response\":{\"type\":\"array\",\"items\":\"Topic\"}},\"getWords\":{\"request\":[{\"name\":\"topicId\",\"type\":\"int\"},{\"name\":\"maxWords\",\"type\":\"int\"}],\"response\":{\"type\":\"array\",\"items\":\"Word\"}},\"train\":{\"request\":[{\"name\":\"parameters\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"},\"default\":{}}],\"response\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"inference\":{\"request\":[{\"name\":\"text\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"response\":{\"type\":\"array\",\"items\":\"TopicDistribution\"}}}}");
  java.lang.String addDocument(org.librairy.service.learner.facade.model.Document document) throws org.apache.avro.AvroRemoteException;
  java.lang.String reset() throws org.apache.avro.AvroRemoteException;
  java.util.List<org.librairy.service.learner.facade.model.Topic> getTopics() throws org.apache.avro.AvroRemoteException;
  java.util.List<org.librairy.service.learner.facade.model.Word> getWords(int topicId, int maxWords) throws org.apache.avro.AvroRemoteException;
  java.lang.String train(java.util.Map<java.lang.String,java.lang.String> parameters) throws org.apache.avro.AvroRemoteException;
  java.util.List<org.librairy.service.learner.facade.model.TopicDistribution> inference(java.lang.String text) throws org.apache.avro.AvroRemoteException;

  @SuppressWarnings("all")
  public interface Callback extends LearnerService {
    public static final org.apache.avro.Protocol PROTOCOL = org.librairy.service.learner.facade.model.LearnerService.PROTOCOL;
    void addDocument(org.librairy.service.learner.facade.model.Document document, org.apache.avro.ipc.Callback<java.lang.String> callback) throws java.io.IOException;
    void reset(org.apache.avro.ipc.Callback<java.lang.String> callback) throws java.io.IOException;
    void getTopics(org.apache.avro.ipc.Callback<java.util.List<org.librairy.service.learner.facade.model.Topic>> callback) throws java.io.IOException;
    void getWords(int topicId, int maxWords, org.apache.avro.ipc.Callback<java.util.List<org.librairy.service.learner.facade.model.Word>> callback) throws java.io.IOException;
    void train(java.util.Map<java.lang.String,java.lang.String> parameters, org.apache.avro.ipc.Callback<java.lang.String> callback) throws java.io.IOException;
    void inference(java.lang.String text, org.apache.avro.ipc.Callback<java.util.List<org.librairy.service.learner.facade.model.TopicDistribution>> callback) throws java.io.IOException;
  }
}