package com.communardo.springherokutest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

@RestController
public class TestController {

    @Autowired
    private GreetingRepository greetingRepository;

    @GetMapping("/")
    public String hello() {
        return "Wlecome to Spring - Heroku";
    }

    @GetMapping("/test")
    public String test() {
        return "Test Successful";
    }

    @GetMapping("/greetings")
    public ResponseEntity<List<Greeting>> getGreetings() {
        List<Greeting> list = greetingRepository.findAll();
        return ResponseEntity.ok(list);
    }

    @PostMapping("/greetings")
    public ResponseEntity<Greeting> getGreetings(@RequestBody Greeting add) {
        Greeting list = greetingRepository.save(add);
        return ResponseEntity.ok(list);
    }


}




