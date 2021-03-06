package com.example;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Provides;
import javax.inject.Named;

public class ServerModule implements Module {


    @Override
    public void configure(Binder binder) {
    }


    @Provides
    @Named("message")
    public String provideMessage(helloDropConfiguration serverConfiguration) {
        return serverConfiguration.getMessage();
    }
}
