package com.example.resources;


import com.codahale.metrics.annotation.Timed;
import com.example.dao.contact_dao;
import com.example.representations.contact;
import org.jdbi.v3.core.Jdbi;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/event")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class contact_resource_class {

    private contact_dao con_dao = null;
    public contact_resource_class(Jdbi jdbi) {
        this.con_dao = jdbi.onDemand(contact_dao.class);
    }

    public contact_resource_class() {

    }

    @GET
    @Timed
    public String say_hi(){
        return "Hello Drop, This is our first URL";
    }


    // method to make mysql use
    @GET
    @Path("/{id}")
    public Response getContact( @PathParam("id") int id ){
        contact cont = (this.con_dao).get_contact_by_id(id);
        return Response.ok(cont).build();
    }

}
