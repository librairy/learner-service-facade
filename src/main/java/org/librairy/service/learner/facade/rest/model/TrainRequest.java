package org.librairy.service.learner.facade.rest.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.Map;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */

public class TrainRequest {

    @ApiModelProperty(notes="algorithm settings")
    private Map<String,String> parameters;

    public TrainRequest(Map<String,String> parameters) {
        this.parameters     = parameters;
    }

    public TrainRequest(){};

    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }
}
