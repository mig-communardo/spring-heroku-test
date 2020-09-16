package com.communardo.springherokutest.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
class Greeting{

    @Id
    private int id;
    private String message;

    public Greeting() {

    }

    public Greeting(int id, String message) {
        this.id = id;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
