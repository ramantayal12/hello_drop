package com.example.resources;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path ("/hey/dependency")
public class DependencyExampleResource {

    private final String message;

    @Inject
    public DependencyExampleResource(@Named("message") String message) {
        this.message = message;
    }

    @GET
    public String hello() {
        return message;
    }
}
