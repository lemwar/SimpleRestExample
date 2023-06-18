package com.thmi.examples.controller;

import com.thmi.examples.service.ExampleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    private final ExampleService serviceExample;

    public ExampleController(ExampleService serviceExample) {
        this.serviceExample = serviceExample;
    }

    @RequestMapping(path = "/example")
    public String getExample() {
        return serviceExample.getExample();
    }
}
