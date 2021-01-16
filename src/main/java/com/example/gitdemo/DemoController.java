package com.example.gitdemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final DemoService demoService;

    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping("hello")
    public ResponseEntity<DemoResponse> hello(){
        return ResponseEntity.ok().body(demoService.hello());
    }
}
