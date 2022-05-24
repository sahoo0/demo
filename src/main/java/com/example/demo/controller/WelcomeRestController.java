package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

    @GetMapping("/welcome")
    public ResponseEntity<String> getWelcomeMsg(){
        String msg = "Welcome to Java World";
        return new ResponseEntity<>(msg , HttpStatus.OK);

    }

}