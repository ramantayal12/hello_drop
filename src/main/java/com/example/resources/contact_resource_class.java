package com.example.resources;


import com.codahale.metrics.annotation.Timed;
import com.example.representations.contact;

import javax.swing.text.html.parser.Entity;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/events")
@Produces(MediaType.APPLICATION_JSON)
public class contact_resource_class {

    int id;
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

    @POST
    @Path("update/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public int updateRecord(@PathParam("id") int id, List<Entity> entities) {
        // Do something with entities...
        this.id = id;
        return 0;
    }

}
