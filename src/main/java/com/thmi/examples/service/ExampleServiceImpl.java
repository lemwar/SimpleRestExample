package com.thmi.examples.service;

import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImpl implements ExampleService {

    private static final String EXAMPLE_STRING = "Example";

    @Override
    public String getExample() {
        return EXAMPLE_STRING;
    }
}
