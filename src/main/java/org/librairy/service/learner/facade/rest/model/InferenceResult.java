package org.librairy.service.learner.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class InferenceResult {

    private List<TopicDistribution> topics;

    public InferenceResult(List<TopicDistribution> topics) {
        this.topics = topics;
    }

    public InferenceResult() {
    }

    @JsonProperty(required = true)
    @ApiModelProperty(notes = "confirmation of accepted infering process", required = true)
    public List<TopicDistribution> getTopics() {
        return topics;
    }

    public void setTopics(List<TopicDistribution> topics) {
        this.topics = topics;
    }
}
