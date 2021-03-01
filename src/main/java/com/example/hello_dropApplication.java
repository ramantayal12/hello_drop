package com.example;

import com.example.api.event_class;
import com.example.resources.event_resource_class;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.jdbi.*;
import org.skife.jdbi.v2.DBI;

import javax.swing.*;

public class hello_dropApplication extends Application<hello_dropConfiguration> {

    public static void main(final String[] args) throws Exception {
        new hello_dropApplication().run(args);
    }

    @Override
    public String getName() {
        return "hello_drop";
    }

    @Override
    public void initialize(final Bootstrap<hello_dropConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final hello_dropConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application

        // to add a database file
        final DBIFactory factory = new DBIFactory();
        final DBI jdbi = factory.build(environment,configuration.getDataSourceFactory(),"mysql");
        

        // we need to explicitly register a resource here
        event_resource_class e = new event_resource_class();
        environment.jersey().register(e);

    }

}
