package com.communardo.springherokutest.controller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository  extends JpaRepository<Greeting,Integer> {
}
