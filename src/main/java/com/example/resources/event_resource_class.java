package com.example.resources;


import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/events")
@Produces(MediaType.APPLICATION_JSON)
public class event_resource_class {

    @GET
    @Timed
    public String say_hi(){
        return "Hello Drop This is our first URL";
    }

    @GET
    @Path("/{id}")
    public Response getContact(@PathParam("id") int id ){
        return Response.ok("{ contact id : " + id + " } ").build();
    }

}
