package com.example.resources;


import com.codahale.metrics.annotation.Timed;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/event")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class contact_resource_class {

    @GET
    @Timed
    public String say_hi(){
        return "Hello Drop, This is our first URL";
    }

    @GET
    @Path("/{id}")
    public int getContact(@PathParam("id") int id ){

        return id;
    }

}
