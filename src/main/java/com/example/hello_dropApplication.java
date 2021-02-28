package com.example;

import com.example.resources.event_resource_class;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

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

        // we need to explicitly register a resource here
        event_resource_class e = new event_resource_class();
        environment.jersey().register(e);

    }

}
