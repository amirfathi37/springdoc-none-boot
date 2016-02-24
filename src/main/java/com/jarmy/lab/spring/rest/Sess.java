package com.jarmy.lab.spring.rest;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Sess {
    private final int id;

    public Sess() {
        id = new Random().nextInt();
    }

    public int getId() {
        return this.id;
    }

}
