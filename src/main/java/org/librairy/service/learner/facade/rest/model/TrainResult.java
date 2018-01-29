package org.librairy.service.learner.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class TrainResult {

    private final String result;

    public TrainResult(String result) {
        this.result = result;
    }

    @JsonProperty(required = true)
    @ApiModelProperty(notes = "confirmation of accepted learning process", required = true)
    public String getResult() {
        return result;
    }
}
