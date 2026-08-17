package com.RestApi.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SenderController {

    @GetMapping(path = "/v1")
    public String sender(){
        return "Welcome to Sender controller";
    }
}
