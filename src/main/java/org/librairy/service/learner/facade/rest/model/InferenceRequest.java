package org.librairy.service.learner.facade.rest.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.Map;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */

public class InferenceRequest {

    @ApiModelProperty(notes="model name")
    private String model;

    @ApiModelProperty(notes="set of texts")
    private Corpus corpus;

    public InferenceRequest(Corpus corpus, String model) {
        this.corpus         = corpus;
        this.model          = model;
    }

    public InferenceRequest(){};

    public Corpus getCorpus() {
        return corpus;
    }

    public String getModel() {
        return model;
    }
}
