package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController

public class HelloController {

    /* Controller mediates communication with the API.
    #The @GetMapping annotation says that this method will be selectable via a GET request.
    -> It also carries information about the URL where the API will be accessible.
     */

    /* http://localhost:8080/sayHello
    #IMPORTANT -> Always re-run after a change
    GET is used to retrieve data, POST to create new resources and PUT to update existing resources.
    */

    /* Verify if working via cmd:
       -> curl localhost:8080/hello (result: Hello from the controller - above)
       -> curl -X POST localhost:8080/hello (result: Hello was created - below)
       OR - better use POSTMAN to check API
     */

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from the controller";
    }

    @PostMapping("/hello")
    public String createNewHello() {
        return "Hello was created";
    }

    @PutMapping(value = "/hello/update")
    public String updateHello() {
        return "Hello is updated";
    }

}
