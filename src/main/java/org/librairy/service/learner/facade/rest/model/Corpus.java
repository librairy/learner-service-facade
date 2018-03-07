package org.librairy.service.learner.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class Corpus extends org.librairy.service.learner.facade.model.Corpus{

    public Corpus(org.librairy.service.learner.facade.model.Corpus corpus){
        try {
            BeanUtils.copyProperties(this,corpus);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public Corpus(){}

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }

    @Override
    @ApiModelProperty(value = "number of documents")
    public Integer getSize() {
        return super.getSize();
    }

    @Override
    @ApiModelProperty(value = "last document added")
    public String getUpdated() {
        return super.getUpdated();
    }


}
