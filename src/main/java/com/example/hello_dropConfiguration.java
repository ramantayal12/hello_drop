package com.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class hello_dropConfiguration extends Configuration {
    // TODO: implement service configuration

    /**
     * A factory used to connect to a relational database management system.
     * factories are used by DropWizard to group together related configuration.
     * parameters such as database connection driver, URI, password etc.
     */

    @NotNull
    @Valid
    private DataSourceFactory datasourcefactory = new DataSourceFactory();

    /**
     * A getter for database factory
     *
     * @return An instance of database factory deserialized from the
     * configuration file passed as a command-line argument to the application.
     */


    @JsonProperty("database")
    public DataSourceFactory getDataSourceFactory(){
        return datasourcefactory;
    }

    public void setDatabase(DataSourceFactory datasourcefactory) {
        this.datasourcefactory = datasourcefactory;
    }

}
