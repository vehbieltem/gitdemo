package com.example.gitdemo;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public DemoResponse hello(){
        return new DemoResponse("hello");
    }

    public DemoResponse helloExtension(){
        return new DemoResponse("hello world");
    }

    public DemoResponse helloAnotherExtension(){
        return new DemoResponse("hello world another");
    }
}
