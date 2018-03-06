package org.librairy.service.learner.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class TopicDistribution extends org.librairy.service.learner.facade.model.TopicDistribution{

    public TopicDistribution(org.librairy.service.learner.facade.model.TopicDistribution topicDistribution){
        try {
            BeanUtils.copyProperties(this,topicDistribution);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public TopicDistribution(){}

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }


    @Override
    @ApiModelProperty(value = "word representation")
    public Topic getTopic() {return new Topic(super.getTopic());}

    @Override
    @ApiModelProperty(value = "relevance")
    public Double getScore() {
        return super.getScore();
    }

}
