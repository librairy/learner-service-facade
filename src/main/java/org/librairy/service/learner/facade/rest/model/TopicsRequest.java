package org.librairy.service.learner.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
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

    /**
     * {"name":"name","type":"string"},
     {"name":"description", "type": "string", "default": "created by librAIry"},
     {"name":"version", "type": "string", "default": "1.0"},
     {"name":"contactEmail", "type": "string"},
     {"name":"parameters","type":{"type" : "map","values":"string"}, "default": {}},
     {"name":"from","type":"DataSource"}
     ]}
     */

    public TopicsRequest(){}

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }

    @Override
    @ApiModelProperty(value = "topic model name")
    public String getName() {
        return super.getName();
    }

    @Override
    @ApiModelProperty(value = "topic model description")
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    @ApiModelProperty(value = "topic model version")
    public String getVersion() {
        return super.getVersion();
    }

    @Override
    @ApiModelProperty(value = "notification email")
    public String getContactEmail() {
        return super.getContactEmail();
    }

    @Override
    @ApiModelProperty(value = "model parameters")
    public Map<String,String> getParameters() {
        return super.getParameters();
    }

    @Override
    @ApiModelProperty(value = "data source")
    public DataSource getFrom() {
        return new DataSource(super.getFrom());
    }

}
