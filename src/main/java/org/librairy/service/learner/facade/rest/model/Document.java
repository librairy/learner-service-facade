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
public class Document extends org.librairy.service.learner.facade.model.Document{

    public Document(org.librairy.service.learner.facade.model.Document document){
        try {
            BeanUtils.copyProperties(this,document);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public Document(){}

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }

    @Override
    @ApiModelProperty(value = "identifier")
    public String getId() {
        return super.getId();
    }

    @Override
    @ApiModelProperty(value = "categories")
    public List<String> getLabels() {
        return super.getLabels();
    }

    @Override
    @ApiModelProperty(value = "human-readable identifier")
    public String getName() {
        return super.getName();
    }

    @Override
    @ApiModelProperty(value = "textual content")
    public String getText() {return super.getText();}

}
