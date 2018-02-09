package org.librairy.service.learner.facade;

import org.apache.avro.AvroRemoteException;
import org.apache.avro.ipc.NettyTransceiver;
import org.apache.avro.ipc.specific.SpecificRequestor;
import org.librairy.service.learner.facade.model.Corpus;
import org.librairy.service.learner.facade.model.Hyperparameters;
import org.librairy.service.learner.facade.model.LearnerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Map;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class AvroClient {

    private static final Logger LOG = LoggerFactory.getLogger(AvroClient.class);

    NettyTransceiver client;
    LearnerService proxy;

    public void open(String host, Integer port) throws IOException {
        this.client = new NettyTransceiver(new InetSocketAddress(InetAddress.getByName(host),port));
        // client code - attach to the server and send a message
        this.proxy = (LearnerService) SpecificRequestor.getClient(LearnerService.class, client);
        LOG.info("Client built to " + host+":"+port+", got proxy");
    }

    public void close(){
        if (client != null) client.close();
    }

    public String train(Corpus corpus, Hyperparameters parameters, Map<String,String> extra) throws AvroRemoteException {

        LOG.debug("Calling proxy.train with corpus:  \"" + corpus +"\" , parameters: " + parameters + " and extra settings: " + extra);
        String result = proxy.train(corpus, parameters, extra);
        LOG.debug("Result: " + result);
        return result;
    }

    public String inference(Corpus corpus, String model) throws AvroRemoteException {

        LOG.debug("Calling proxy.inference with corpus:  \"" + corpus +"\" and model: " + model);
        String result = proxy.inference(corpus, model);
        LOG.debug("Result: " + result);
        return result;
    }

}
