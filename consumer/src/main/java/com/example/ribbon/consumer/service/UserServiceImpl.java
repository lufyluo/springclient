package com.example.ribbon.consumer.service;

import com.example.ribbon.consumer.model.UserInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    RestTemplate restTemplate;
    @Override
    public UserInfo getUser() {
        return restTemplate.getForEntity("http://service-user/user/get", UserInfo.class).getBody();
    }
}
