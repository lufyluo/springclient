package com.example.eureka.userprovider.controller;

import com.example.eureka.userprovider.model.UserInfo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping(value = "get",method = RequestMethod.GET)
    public UserInfo get(){
        UserInfo userInfo = new UserInfo();
        userInfo.setName("lufy");
        userInfo.setAge(5);
    return userInfo;
}
}
