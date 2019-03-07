package com.example.eureka.userprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping(value = "get",method = RequestMethod.GET)
    public String get(){
    return "What the hell!";
}
}
