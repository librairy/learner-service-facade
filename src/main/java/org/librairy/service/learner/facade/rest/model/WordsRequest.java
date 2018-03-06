package org.librairy.service.learner.facade.rest.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */

public class WordsRequest {

    @ApiModelProperty(notes="max number of words")
    private Integer maxWords;

    @ApiModelProperty(notes="topic identifier")
    private Integer topicId;

    public WordsRequest(Integer topicId, Integer maxWords) {

        this.topicId= topicId;
        this.maxWords = maxWords;
    }

    public WordsRequest(){};

    public Integer getMaxWords() {
        return maxWords;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setMaxWords(Integer maxWords) {
        this.maxWords = maxWords;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }
}
