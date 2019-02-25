package org.librairy.service.learner.facade;

import org.apache.avro.AvroRemoteException;
import org.apache.avro.ipc.NettyTransceiver;
import org.apache.avro.ipc.specific.SpecificRequestor;
import org.librairy.service.learner.facade.model.LearnerService;
import org.librairy.service.learner.facade.model.Result;
import org.librairy.service.learner.facade.model.TopicsRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;

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

    public Result createTopics(TopicsRequest request) throws AvroRemoteException {

        LOG.debug("Calling proxy.createTopics");
        Result result= proxy.createTopics(request);
        LOG.debug("Result: " + result);
        return result;
    }


    public Result cleanCache() throws AvroRemoteException {

        LOG.debug("Calling proxy.cleanCache ");
        Result result= proxy.cleanCache();
        LOG.debug("Result: " + result);
        return result;
    }

}
