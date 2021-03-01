package com.example.resources;


import com.codahale.metrics.annotation.Timed;
import com.example.representations.contact;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/events")
@Produces(MediaType.APPLICATION_JSON)
public class contact_resource_class {

    @GET
    @Timed
    public String say_hi(){
        return "Hello Drop This is our first URL";
    }

    @GET
    @Path("/{id}")
    public Response getContact(@PathParam("id") int id ){
        return Response.ok(new contact(id,"Raman")).build();
    }

    /*
    PUT method used to insert data in web application

    @PUT
    @Path("/{id}")
    public Response.ResponseBuilder updateContact(@PathParam("id") int id){
        return Response.ok(new contact(id,"New name "));
    }


     */

}
