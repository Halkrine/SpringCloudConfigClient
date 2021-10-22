package com.example.springcloudconfigclient.controller;

import com.example.springcloudconfigclient.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestService service;

    @RequestMapping(value="/hello")
    public String hello(){
        return service.hello();
    }
}
