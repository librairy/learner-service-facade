package org.librairy.service.learner.facade;

import org.apache.avro.AvroRemoteException;
import org.apache.avro.ipc.NettyTransceiver;
import org.apache.avro.ipc.specific.SpecificRequestor;
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

    public String train(String corpus, Map<String,String> parameters, Map<String,String> mapping) throws AvroRemoteException {

        // fill in the Message record and send it
        LOG.debug("Calling proxy.train with corpus:  \"" + corpus +"\" , parameters: " + parameters +" and mapping:" + mapping);
        String result = proxy.train(corpus, parameters, mapping);
        LOG.debug("Result: " + result);
        return result;
    }

}
