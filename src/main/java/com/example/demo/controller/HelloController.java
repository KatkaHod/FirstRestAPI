package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {

    /* Controller mediates communication with the API.
    #The @GetMapping annotation says that this method will be selectable via a GET request.
    -> It also carries information about the URL where the API will be accessible.
     */

    @GetMapping("/sayHello")
    public String sayHello() {
        return "Hello from the controller";
    }

    // -> http://localhost:8080/sayHello



}
