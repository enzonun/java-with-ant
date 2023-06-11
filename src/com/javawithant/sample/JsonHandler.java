package com.javawithant.sample;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;


import javax.json.Json;
import java.io.IOException;

public class JsonHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        var json = Json.createObjectBuilder()
                .add("name", "John")
                .add("age", 20)
                .add("active", Boolean.FALSE).build();
        String result = json.toString();

        var requestHeaders = httpExchange.getResponseHeaders();
        requestHeaders.set("Content-Type", "application/json");
        httpExchange.sendResponseHeaders(200, result.length());
        var outputStream = httpExchange.getResponseBody();
        outputStream.write(result.getBytes());
        outputStream.close();
    }
}
