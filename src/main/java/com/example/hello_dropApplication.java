package com.example;

import com.example.resources.contact_resource_class;
import io.dropwizard.Application;
import io.dropwizard.setup.*;

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

        // we need to explicitly register a resource here
        contact_resource_class e = new contact_resource_class();
        environment.jersey().register(e);

    }

}
