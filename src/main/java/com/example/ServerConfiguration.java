package com.example;

import javax.validation.constraints.NotEmpty;

public class ServerConfiguration extends helloDropConfiguration{

    @NotEmpty
    private String message;
    public String getMessage() {
        return message;
    }
}
