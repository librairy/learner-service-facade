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
public class DataFields extends org.librairy.service.learner.facade.model.DataFields{

    public DataFields(org.librairy.service.learner.facade.model.DataFields dataFields){
        try {
            BeanUtils.copyProperties(this,dataFields);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public DataFields(){}

    public DataFields(String id, List<String> labels, List<String> text) {
        super(id, labels, text);
    }

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }

    @Override
    @ApiModelProperty(value = "document id")
    public String getId() {
        return super.getId();
    }

    @Override
    @ApiModelProperty(value = "document labels")
    public List<String> getLabels() {
        return super.getLabels();
    }

    @Override
    @ApiModelProperty(value = "document text")
    public List<String> getText() {
        return super.getText();
    }


}
