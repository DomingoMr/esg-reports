package com.backend.etree.controller;

import com.backend.etree.service.HelloWorldService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/helloWorld")
public class HelloWorldController {

    private final HelloWorldService helloWorldService;


    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping(value = "/hello")
    public String helloWorld() {
        return helloWorldService.helloWorld();
    }
}
