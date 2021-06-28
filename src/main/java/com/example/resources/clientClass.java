package com.example.resources;

import com.codahale.metrics.annotation.Timed;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import javax.ws.rs.*;

import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.Objects;

@Path("/client")
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.TEXT_PLAIN)
public class clientClass {

    private OkHttpClient client;
    public clientClass(OkHttpClient client) {
        this.client = client;
    }

    @GET
    @Timed
    public String sampleClientRequest(){

        try {
            Request request = new Request.Builder ().url (
                    "https://publicobject.com/helloworld.txt").get ().build ();

            Call call = client.newCall (request);
            Response response = call.execute ();
            String str = Objects.requireNonNull (response.body ()).string ();

            return str;
        }
        catch (Exception e ){
            return e.getMessage ();
        }

    }
}
