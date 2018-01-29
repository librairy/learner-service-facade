package org.librairy.service.learner.facade.rest.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.Map;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */

public class TrainRequest {

    @ApiModelProperty(notes="Unstructured text")
    private String text;

    @ApiModelProperty(notes="Model Hyperparameters")
    private Map<String,String> parameters;

    @ApiModelProperty(notes="Corpus Information per Column")
    private Map<String,String> mapping;

    public TrainRequest(String text, Map<String,String> parameters, Map<String,String> mapping) {
        this.text       = text;
        this.parameters = parameters;
        this.mapping    = mapping;
    }

    public TrainRequest(){};

    public String getText() {
        return text;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    public Map<String, String> getMapping() {
        return mapping;
    }
}
