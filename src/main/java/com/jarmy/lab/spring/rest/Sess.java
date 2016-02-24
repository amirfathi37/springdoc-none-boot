package com.jarmy.lab.spring.rest;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
<<<<<<< HEAD
//@formatter:off
/*
 * ConfigurableBeanFactory.SCOPE_SINGLETON
 * ConfigurableBeanFactory.SCOPE_PROTOTYPE
 * WebApplicationContext.SCOPE_REQUEST
 * WebApplicationContext.SCOPE_SESSION
 */
//@formatter:on
=======
>>>>>>> 0490103e0bcfc32a92231b5f1d0e802e223b9de5
public class Sess {
    private final int id;

    public Sess() {
        id = new Random().nextInt();
    }

    public int getId() {
        return this.id;
    }

}
