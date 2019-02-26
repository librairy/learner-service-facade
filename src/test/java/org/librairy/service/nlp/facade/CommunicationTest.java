package org.librairy.service.nlp.facade;

import org.apache.avro.AvroRemoteException;
import org.junit.Test;
import org.librairy.service.learner.facade.AvroClient;
import org.librairy.service.learner.facade.AvroServer;
import org.librairy.service.learner.facade.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class CommunicationTest {

    private static final Logger LOG = LoggerFactory.getLogger(CommunicationTest.class);

    @Test
    public void exchange() throws InterruptedException, IOException {


        LearnerService customService = new LearnerService() {


            @Override
            public Result createTopics(TopicsRequest request) throws AvroRemoteException {
                return Result.newBuilder().setDate(new Date().toString()).setStatus("QUEUED").setMessage("new topic model queued").build();
            }

            @Override
            public Result cleanCache() throws AvroRemoteException {
                return Result.newBuilder().setDate(new Date().toString()).setStatus("ACCEPTED").setMessage("cache removed").build();
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
                                .setUrl("/src/test/resources/sample.csv")
                                .setSize(-1)
                                .setFormat(Format.CSV)
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
