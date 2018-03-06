package org.librairy.service.learner.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class TopicList {

    private List<Topic> topics;

    public TopicList(List<Topic> topics) {
        this.topics = topics;
    }

    public TopicList(){}

    @JsonProperty(required = true)
    @ApiModelProperty(notes = "list of topics discovered in the corpus", required = true)
    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }
}
