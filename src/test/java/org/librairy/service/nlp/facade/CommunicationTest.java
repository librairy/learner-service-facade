package org.librairy.service.nlp.facade;

import org.apache.avro.AvroRemoteException;
import org.junit.Test;
import org.librairy.service.learner.facade.AvroClient;
import org.librairy.service.learner.facade.AvroServer;
import org.librairy.service.learner.facade.model.Document;
import org.librairy.service.learner.facade.model.LearnerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class CommunicationTest {

    private static final Logger LOG = LoggerFactory.getLogger(CommunicationTest.class);

    @Test
    public void exchange() throws InterruptedException, IOException {


        LearnerService customService = new LearnerService() {


            @Override
            public String addDocument(Document document) throws AvroRemoteException {
                return "document added";
            }

            @Override
            public String reset() throws AvroRemoteException {
                return "document removed";
            }

            @Override
            public String train(Map<String, String> parameters) throws AvroRemoteException {
                return "model built";
            }
        };
        AvroServer server = new AvroServer(customService);

        AvroClient client = new AvroClient();


        String host     = "localhost";
        Integer port    = 65111;

        server.open(host,port);
        client.open(host,port);


        client.addDocument(Document.newBuilder().setId("doc1").setText("textual content").build());
        client.reset();
        client.train(new HashMap<>());

        client.close();
        server.close();
    }

}
