package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryController {

    //1. example @GetMapping with one parameter. Can be also -> , default value = " -,,- "
    @GetMapping("/v1/name")
    public String sayWelcomeClient(@RequestParam(value = "FullName", required = false) String NameOfClient) {
      //return "Hello new Client, " + NameOfClient;
        if(NameOfClient == null) {
          return "Welcome new client!";
      } else {
          return "Welcome new client, " + NameOfClient;
      }
    }

    //2. example @GetMapping with two parameters
    @GetMapping("/v1/client/age")
    public String ageClient(
            @RequestParam(name = "surname") String nameOfClient,
            @RequestParam(name = "age") int ageOfClient)
    {
        return "The Client " + nameOfClient + " is " + ageOfClient + " years old.";
    }





}
