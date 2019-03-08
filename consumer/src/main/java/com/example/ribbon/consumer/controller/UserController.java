package com.example.ribbon.consumer.controller;

import com.example.ribbon.consumer.model.UserInfo;
import com.example.ribbon.consumer.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "get",method = RequestMethod.GET)
    public UserInfo get(){
        return userService.getUser();
    }
}
