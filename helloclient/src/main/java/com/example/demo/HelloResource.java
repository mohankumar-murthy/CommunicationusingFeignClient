package com.example.demo;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value="/rest/hello/client")
public class HelloResource {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    HelloServiceProxy helloServiceProxy;

    @GetMapping
    public String hello(){
        return helloServiceProxy.gethello();
    }
}
