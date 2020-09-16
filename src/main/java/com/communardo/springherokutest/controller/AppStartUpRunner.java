package com.communardo.springherokutest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppStartUpRunner implements CommandLineRunner {

    @Autowired
    private GreetingRepository greetingRepository;

    @Override
    public void run(String... args) throws Exception {

        greetingRepository.save(new Greeting(1,"hello"));
        greetingRepository.save(new Greeting(2,"hi"));
    }
}
