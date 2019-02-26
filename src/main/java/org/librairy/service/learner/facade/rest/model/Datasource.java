package org.librairy.service.learner.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;
import org.librairy.service.learner.facade.model.*;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class DataSource extends org.librairy.service.learner.facade.model.DataSource{

    public DataSource(org.librairy.service.learner.facade.model.DataSource datasource){
        try {
            BeanUtils.copyProperties(this,datasource);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public DataSource(){}

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }

    @Override
    @ApiModelProperty(value = "endpoint")
    public String getUrl() {
        return super.getUrl();
    }

    @Override
    @ApiModelProperty(value = "data format")
    public String getFormat() {
        return super.getFormat();
    }

    @Override
    @ApiModelProperty(value = "document selection")
    public String getFilter() {
        return super.getFilter();
    }

    @Override
    @ApiModelProperty(value = "number of documents")
    public Long getSize() {
        return super.getSize();
    }

    @Override
    @ApiModelProperty(value = "skip documents")
    public Long getOffset() {
        return super.getOffset();
    }

    @Override
    @ApiModelProperty(value = "save datasource in cache")
    public Boolean getCache() {
        return super.getCache();
    }

    @Override
    @ApiModelProperty(value = "document fields")
    public DataFields getFields() {
        return new DataFields(super.getFields());
    }

    @Override
    @ApiModelProperty(value = "data credentials")
    public Credentials getCredentials() {
        return new Credentials(super.getCredentials());
    }

}
