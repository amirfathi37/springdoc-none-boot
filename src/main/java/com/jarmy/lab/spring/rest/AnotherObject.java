package com.jarmy.lab.spring.rest;

import java.util.UUID;

public class AnotherObject {
    private String id;

    public AnotherObject() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
