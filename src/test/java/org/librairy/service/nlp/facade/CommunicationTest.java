package org.librairy.service.nlp.facade;

import org.apache.avro.AvroRemoteException;
import org.junit.Test;
import org.librairy.service.learner.facade.AvroClient;
import org.librairy.service.learner.facade.AvroServer;
import org.librairy.service.learner.facade.model.Corpus;
import org.librairy.service.learner.facade.model.Hyperparameters;
import org.librairy.service.learner.facade.model.Language;
import org.librairy.service.learner.facade.model.LearnerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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
            public String train(Corpus corpus, Hyperparameters parameters, Map<String, String> extra) throws AvroRemoteException {
                return "learning done!";
            }

            @Override
            public String inference(Corpus corpus, String model) throws AvroRemoteException {
                return "inference done!";
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
                Corpus corpus                   = Corpus.newBuilder().setPath("src/main/resources/sample.csv").setLanguage(Language.ES).build();
                Hyperparameters parameters      = Hyperparameters.newBuilder().build();
                Map<String,String> mapping      = new HashMap<String, String>();
                String result = client.train(corpus, parameters, mapping);
                LOG.info("Result: " + result);
            } catch (AvroRemoteException e) {
                e.printStackTrace();
            }
        });

        client.close();
        server.close();
    }

}
