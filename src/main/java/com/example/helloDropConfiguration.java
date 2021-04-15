package com.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.dropwizard.client.HttpClientConfiguration;
import io.dropwizard.client.JerseyClientConfiguration;
import io.dropwizard.db.DataSourceFactory;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class helloDropConfiguration extends Configuration {


    /**
     * A factory used to connect to a relational database management system.
     * factories are used by DropWizard to group together related configuration.
     * parameters such as database connection driver, URI, password etc.
     */

    @NotNull
    @Valid
    private DataSourceFactory datasourcefactory = new DataSourceFactory();

    @JsonProperty("database")
    public DataSourceFactory getDataSourceFactory(){
        return datasourcefactory;
    }

    public void setDatabase(DataSourceFactory datasourcefactory) {
        this.datasourcefactory = datasourcefactory;
    }


    /**
     * Client Configuration
     */

    @Valid
    @NotNull
    private JerseyClientConfiguration jerseyClient = new JerseyClientConfiguration();

    @JsonProperty("jerseyClient")
    public JerseyClientConfiguration getJerseyClientConfiguration() {
        return jerseyClient;
    }

    @JsonProperty("jerseyClient")
    public void setJerseyClientConfiguration(JerseyClientConfiguration jerseyClient) {
        this.jerseyClient = jerseyClient;
    }




}
