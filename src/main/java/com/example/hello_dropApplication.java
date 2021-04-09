package com.example;

import com.example.resources.contact_resource_class;
import com.example.resources.contact_update_class;
import io.dropwizard.Application;
import io.dropwizard.jdbi3.JdbiFactory;
import io.dropwizard.setup.*;
import org.jdbi.v3.core.Jdbi;


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


        // we need to explicitly register a resource here
        contact_resource_class e = new contact_resource_class();
        environment.jersey().register(e);

        //
        contact_update_class ex = new contact_update_class();
        environment.jersey().register(ex);

        // JDBI Factory
        final JdbiFactory factory = new JdbiFactory();
        final Jdbi jdbi = factory.build(environment, configuration.getDataSourceFactory(), "mysql");
        //environment.jersey().register((jdbi));

    }

}
