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

    @GetMapping("hello2")
    public ResponseEntity<DemoResponse> helloExtension(){
        return ResponseEntity.ok().body(demoService.helloExtension());
    }

    @GetMapping("hello3")
    public ResponseEntity<DemoResponse> helloAnotherExtension(){
        return ResponseEntity.ok().body(demoService.helloAnotherExtension());
    }

    @GetMapping("hello4")
    public ResponseEntity<DemoResponse> helloAgain(){
        return ResponseEntity.ok().body(demoService.helloAnotherExtension());
    }

    @GetMapping("hello5")
    public ResponseEntity<DemoResponse> helloAgain2(){
        return ResponseEntity.ok().body(demoService.helloAnotherExtension());
    }

    @GetMapping("hello6")
    public ResponseEntity<DemoResponse> helloAgainConflict(){
        return ResponseEntity.ok().body(demoService.helloAnotherExtension());
    }
}
