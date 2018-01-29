package org.librairy.service.nlp.facade;

import org.apache.avro.AvroRemoteException;
import org.junit.Test;
import org.librairy.service.learner.facade.AvroClient;
import org.librairy.service.learner.facade.AvroServer;
import org.librairy.service.learner.facade.model.LearnerService;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class CommunicationTest {

    @Test
    public void exchange() throws InterruptedException, IOException {


        LearnerService customService = new LearnerService() {

            @Override
            public String train(String corpus, Map<String, String> parameters, Map<String, String> mapping) throws AvroRemoteException {
                return "done!";
            }
        };
        AvroServer server = new AvroServer(customService);

        AvroClient client = new AvroClient();


        String host     = "localhost";
        Integer port    = 65111;

        server.open(host,port);
        client.open(host,port);

        List<String> texts = Arrays.asList(new String[]{"example 1", "example 2", "example 3"});


        texts.forEach(text -> {
            try {
                String corpus                   = "localPath";
                Map<String,String> parameters   = new HashMap<String, String>();
                Map<String,String> mapping      = new HashMap<String, String>();
                client.train(text, parameters, mapping);
            } catch (AvroRemoteException e) {
                e.printStackTrace();
            }
        });

        client.close();
        server.close();
    }

}
