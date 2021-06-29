package com.example.resources;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Singleton
public class DependencyExampleResource {

    private final String message;

    @Inject
    public DependencyExampleResource(@Named("message") String message) {
        this.message = message;
    }

    @GET
    @Path ("/hey/dependency")
    public String hello() {
        return message;
    }
}
