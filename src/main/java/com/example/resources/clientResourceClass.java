package com.example.resources;

import com.codahale.metrics.annotation.Timed;
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
public class clientResourceClass {

    private OkHttpClient client;
    public clientResourceClass( OkHttpClient client) {
        this.client = client;
    }

    @GET
    @Timed
    public String showContact() throws IOException {
        Request request = new Request.Builder()
                .url("https://localhost:8080/event").get().build();
        Request request2 = new Request.Builder().url(
                "https://publicobject.com/helloworld.txt").get().build();

        /**
         * Post Request
        Request request3 = new Request.Builder()
                .url("BASE_URL").post(reqBody1)
                .build();
         */

        String str;
        try (Response response = client.newCall (request2).execute()) {
            str = Objects.requireNonNull(response.body()).string();
        }

        return str;

    }
}
