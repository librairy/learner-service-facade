package org.librairy.service.learner.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class Credentials extends org.librairy.service.learner.facade.model.Credentials{

    public Credentials(org.librairy.service.learner.facade.model.Credentials credentials){
        try {
            BeanUtils.copyProperties(this,credentials);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public Credentials(){}

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }

    @Override
    @ApiModelProperty(value = "user name")
    public String getUser() {
        return super.getUser();
    }

    @Override
    @ApiModelProperty(value = "user password")
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    @ApiModelProperty(value = "api key")
    public String getApikey() {
        return super.getApikey();
    }


}
