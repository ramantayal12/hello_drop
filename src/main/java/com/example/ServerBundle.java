package com.example;

import com.example.resources.DependencyExampleResource;
import com.google.inject.Singleton;
import io.dropwizard.ConfiguredBundle;
import io.dropwizard.setup.Environment;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

public class ServerBundle implements ConfiguredBundle<helloDropConfiguration> {

    @Override
    public void run(helloDropConfiguration configuration, Environment environment) throws Exception {
        environment
                .jersey()
                .register(
                        new AbstractBinder () {
                            @Override
                            protected void configure() {
                                bindAsContract(DependencyExampleResource.class).in(Singleton.class);
                            }
                        }
                );
    }
}
