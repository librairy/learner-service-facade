package org.librairy.service.nlp.facade;

import org.apache.avro.AvroRemoteException;
import org.junit.Test;
import org.librairy.service.learner.facade.AvroClient;
import org.librairy.service.learner.facade.AvroServer;
import org.librairy.service.learner.facade.model.DataFields;
import org.librairy.service.learner.facade.model.DataSource;
import org.librairy.service.learner.facade.model.LearnerService;
import org.librairy.service.learner.facade.model.TopicsRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Arrays;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class CommunicationTest {

    private static final Logger LOG = LoggerFactory.getLogger(CommunicationTest.class);

    @Test
    public void exchange() throws InterruptedException, IOException {


        LearnerService customService = new LearnerService() {


            @Override
            public String createTopics(TopicsRequest request) throws AvroRemoteException {
                return "new topic model queued";
            }

            @Override
            public String cleanCache() throws AvroRemoteException {
                return "cache removed";
            }
        };
        AvroServer server = new AvroServer(customService);

        AvroClient client = new AvroClient();


        String host     = "localhost";
        Integer port    = 65111;

        server.open(host,port);
        client.open(host,port);


        client.createTopics(TopicsRequest.newBuilder()
                .setName("tm1")
                .setDescription("test model")
                .setContactEmail("sample@mail.com")
                .setVersion("1.0")
                .setFrom(
                        DataSource.newBuilder()
                                .setUrl("/src/test/resources/sample.txt")
                                .setSize(-1)
                                .setFormat("txt")
                                .setFields(
                                        DataFields.newBuilder()
                                                .setId("id")
                                                .setText(Arrays.asList("title","content"))
                                                .build()
                                )
                                .build()

                )
                .build());
        client.cleanCache();

        client.close();
        server.close();
    }

}
