package org.librairy.service.learner.facade;

import org.apache.avro.AvroRemoteException;
import org.apache.avro.ipc.NettyTransceiver;
import org.apache.avro.ipc.specific.SpecificRequestor;
import org.librairy.service.learner.facade.model.Corpus;
import org.librairy.service.learner.facade.model.Document;
import org.librairy.service.learner.facade.model.LearnerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.List;
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

    public String reset() throws AvroRemoteException {

        LOG.debug("Calling proxy.reset");
        String result= proxy.reset();
        LOG.debug("Result: " + result);
        return result;
    }


    public String addDocument(Document document, Boolean multigrams) throws AvroRemoteException {

        LOG.debug("Calling proxy.addDocument with: " + document);
        String result= proxy.addDocument(document, multigrams);
        LOG.debug("Result: " + result);
        return result;
    }

    public String train(Map<String,String> parameters) throws AvroRemoteException {

        LOG.debug("Calling proxy.train with  parameters: " + parameters);
        String result = proxy.train(parameters);
        LOG.debug("Result: " + result);
        return result;
    }

    public Corpus getCorpus() throws AvroRemoteException {

        LOG.debug("Calling proxy.getCorpus");
        Corpus result= proxy.getCorpus();
        LOG.debug("Result: " + result);
        return result;
    }

}
