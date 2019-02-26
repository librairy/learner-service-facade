package org.librairy.service.learner.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.common.base.Strings;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;
import org.librairy.service.ApiModelPropertyExtended;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TopicsRequest extends org.librairy.service.learner.facade.model.TopicsRequest{

    public TopicsRequest(org.librairy.service.learner.facade.model.TopicsRequest topicsRequest){
        try {
            BeanUtils.copyProperties(this,topicsRequest);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public TopicsRequest(){}

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }

    @Override
    @ApiModelProperty(value = "topic model name")
    @ApiModelPropertyExtended(defaultValue = "my-model")
    public String getName() {
        return super.getName();
    }

    @Override
    @ApiModelProperty(value = "topic model description")
    @ApiModelPropertyExtended(defaultValue = "my-data")
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    @ApiModelProperty(value = "topic model version")
    @ApiModelPropertyExtended(defaultValue = "1.0")
    public String getVersion() {
        return super.getVersion();
    }

    @Override
    @ApiModelProperty(value = "notification email")
    @ApiModelPropertyExtended(defaultValue = "sample@mail.com")
    public String getContactEmail() {
        return super.getContactEmail();
    }

    @Override
    @ApiModelProperty(value = "model parameters")
    public Map<String,String> getParameters() {
        return super.getParameters();
    }

    @Override
    @ApiModelProperty(value = "annotate documents with topic distribution")
    public Boolean getAnnotate() {return super.getAnnotate();}

    @Override
    @ApiModelProperty(value = "data source")
    public DataSource getFrom() {
        return new DataSource(super.getFrom());
    }

    public boolean isValid(){

        if (Strings.isNullOrEmpty(getName())) return false;
        if (Strings.isNullOrEmpty(getContactEmail())) return false;
        if (Strings.isNullOrEmpty(getVersion())) return false;

        if (get("from") == null) return false;

        return getFrom().isValid();


    }

}
