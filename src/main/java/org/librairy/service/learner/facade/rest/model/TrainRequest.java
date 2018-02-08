package org.librairy.service.learner.facade.rest.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.Map;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */

public class TrainRequest {

    @ApiModelProperty(notes="algorithm settings")
    private Hyperparameters parameters;

    @ApiModelProperty(notes="set of texts")
    private Corpus corpus;

    @ApiModelProperty(notes="extra config values")
    private Map<String,String> extra;

    public TrainRequest(Corpus corpus, Hyperparameters parameters, Map<String,String> extra) {
        this.corpus         = corpus;
        this.parameters     = parameters;
        this.extra          = extra;
    }

    public TrainRequest(){};


    public Hyperparameters getParameters() {
        return parameters;
    }

    public Corpus getCorpus() {
        return corpus;
    }

    public Map<String, String> getExtra() {
        return extra;
    }
}
