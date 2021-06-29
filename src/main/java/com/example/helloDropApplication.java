package com.example;

import com.example.health.myHealthCheck;
import com.example.resources.clientClass;
import com.example.resources.contactClass;
import com.example.resources.contactUpdateClass;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import okhttp3.OkHttpClient;
import com.hubspot.dropwizard.guice.GuiceBundle;


public class helloDropApplication extends Application<helloDropConfiguration> {

    public static void main(final String[] args) throws Exception {
        new helloDropApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<helloDropConfiguration> bootstrap) {
    }

    @Override
    public void run(final helloDropConfiguration configuration,
                    final Environment environment) {


        // we need to explicitly register a resource here
        contactClass e = new contactClass();
        environment.jersey().register(e);

        // we need to explicitly register a resource here
        contactUpdateClass ex = new contactUpdateClass();
        environment.jersey().register(ex);

        // working with client
        OkHttpClient client = new OkHttpClient();
        clientClass cex = new clientClass(client);
        environment.jersey().register(cex);

        // registering health check
        environment.healthChecks().register("application",new myHealthCheck());

        // registering bundle
        ServerBundle serverBundle = new ServerBundle ();
        environment.jersey ().register (serverBundle);
    }

}
