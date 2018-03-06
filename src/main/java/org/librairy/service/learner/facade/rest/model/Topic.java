package org.librairy.service.learner.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class Topic extends org.librairy.service.learner.facade.model.Topic{

    public Topic(org.librairy.service.learner.facade.model.Topic topic){
        try {
            BeanUtils.copyProperties(this,topic);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public Topic(){}

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }


    @Override
    @ApiModelProperty(value = "identifier")
    public Integer getId() {
        return super.getId();
    }

    @Override
    @ApiModelProperty(value = "human-readable identifier")
    public String getName() {
        return super.getName();
    }

    @Override
    @ApiModelProperty(value = "brief summary")
    public String getDescription() {
        return super.getDescription();
    }

}
