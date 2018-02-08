package org.librairy.service.learner.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class Hyperparameters extends org.librairy.service.learner.facade.model.Hyperparameters {

    public Hyperparameters(org.librairy.service.learner.facade.model.Hyperparameters hyperparameters){
        try {
            BeanUtils.copyProperties(this,hyperparameters);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public Hyperparameters(){}

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }

    @Override
    @ApiModelProperty(value = "document concentration")
    public Double getAlpha() {
        return super.getAlpha();
    }

    @Override
    @ApiModelProperty(value = "word concentration")
    public Double getBeta() {
        return super.getBeta();
    }

    @Override
    @ApiModelProperty(value = "number of topics")
    public Integer getTopics() {
        return super.getTopics();
    }

    @Override
    @ApiModelProperty(value = "number of iterations")
    public Integer getIterations() {
        return super.getIterations();
    }

    @Override
    @ApiModelProperty(value = "number of words per topic")
    public Integer getWordsPerTopic() {
        return super.getWordsPerTopic();
    }

}
