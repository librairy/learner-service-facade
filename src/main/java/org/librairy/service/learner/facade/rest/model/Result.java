package org.librairy.service.learner.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result extends org.librairy.service.learner.facade.model.Result{

    public Result(org.librairy.service.learner.facade.model.Result result){
        try {
            BeanUtils.copyProperties(this,result);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public Result(){}

    public Result(String date, String status, String message) {
        super(date, status, message);
    }

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }

    @Override
    @ApiModelProperty(value = "request date")
    public String getDate() {
        return super.getDate();
    }

    @Override
    @ApiModelProperty(value = "request status")
    public String getStatus() {
        return super.getStatus();
    }

    @Override
    @ApiModelProperty(value = "request description")
    public String getMessage() {
        return super.getMessage();
    }


}
