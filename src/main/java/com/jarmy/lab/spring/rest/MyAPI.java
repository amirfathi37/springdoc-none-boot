package com.jarmy.lab.spring.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyAPI {

    @RequestMapping(value = "/test", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public MyUser hello() {
        MyUser user = new MyUser();
        user.setName("Abbas");
        user.setId(12);
        return user;
    }
}
