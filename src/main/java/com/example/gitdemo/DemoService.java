package com.example.gitdemo;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public DemoResponse hello(){
        return new DemoResponse("hello");
    }
}
