package com.example.resources;


import com.codahale.metrics.annotation.Timed;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


// every resource class must contain Path
@Path("/update")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class contactUpdateClass {

    @GET
    @Timed
    public String say_hi(){
        return "Hello Drop, This is our Post Request URL";
    }

    @POST
    @Path("/{id}")
    public String updateRecord( @PathParam("id") int id ) {
        return "Successfully Updated";
    }

}
