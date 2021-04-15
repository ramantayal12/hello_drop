package com.example;

import com.example.resources.clientResourceClass;
import com.example.resources.contactResourceClass;
import com.example.resources.contactUpdateClass;
import io.dropwizard.Application;
import io.dropwizard.setup.*;
import okhttp3.OkHttpClient;
import org.glassfish.jersey.client.JerseyClientBuilder;


public class helloDropApplication extends Application<helloDropConfiguration> {

    public static void main(final String[] args) throws Exception {
        new helloDropApplication().run(args);
    }

    @Override
    public void initialize(final Bootstrap<helloDropConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final helloDropConfiguration configuration,
                    final Environment environment) {


        // we need to explicitly register a resource here
        contactResourceClass e = new contactResourceClass();
        environment.jersey().register(e);

        // we need to explicitly register a resource here
        contactUpdateClass ex = new contactUpdateClass();
        environment.jersey().register(ex);

        // working with client
        OkHttpClient client = new OkHttpClient();
        clientResourceClass cex = new clientResourceClass(client);
        environment.jersey().register(cex);

    }

}
