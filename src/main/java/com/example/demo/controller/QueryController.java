package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryController {

    @GetMapping("/v1/name")
    public String sayWelcomeClient(@RequestParam(value = "FullName", required = false) String NameOfClient) {
      //return "Hello new Client, " + NameOfClient;
        if(NameOfClient == null) {
          return "Welcome new client!";
      } else {
          return "Welcome new client, " + NameOfClient;
      }
    }





}
