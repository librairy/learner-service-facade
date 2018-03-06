package org.librairy.service.learner.facade.rest.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */

public class InferenceRequest {

    @ApiModelProperty(notes="textual content")
    private String text;

    public InferenceRequest(String text) {
        this.text = text;
    }

    public InferenceRequest(){};

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
