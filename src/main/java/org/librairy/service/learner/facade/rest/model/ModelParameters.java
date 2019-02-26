package org.librairy.service.learner.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModelParameters {

    @ApiModelProperty(notes="algorithm settings")
    private Map<String,String> parameters = new HashMap<>();

    public ModelParameters(Map<String,String> parameters) {
        this.parameters     = parameters;
    }

    public ModelParameters(){};

    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }
}
