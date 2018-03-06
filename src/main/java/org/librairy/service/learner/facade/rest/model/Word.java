package org.librairy.service.learner.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class Word extends org.librairy.service.learner.facade.model.Word{

    public Word(org.librairy.service.learner.facade.model.Word word){
        try {
            BeanUtils.copyProperties(this,word);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public Word(){}

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }


    @Override
    @ApiModelProperty(value = "word representation")
    public String getValue() {
        return super.getValue();
    }

    @Override
    @ApiModelProperty(value = "relevance")
    public Double getScore() {
        return super.getScore();
    }

}
