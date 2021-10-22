package com.example.springcloudconfigclient.service.impl;

import com.example.springcloudconfigclient.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Value("${test.hello}")
    private String hello;

    public String hello(){
        return hello;
    }
}
