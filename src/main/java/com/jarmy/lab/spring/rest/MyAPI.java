package com.jarmy.lab.spring.rest;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api")
public class MyAPI {

    @Autowired
    private Sess sess;

        @Operation(summary = "foo", description = "bar")
    //    @ApiOperation(value = "Find base info by its code", notes = "This api will return a base info data by its code")
    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public int hello2() {
        return sess.getId();
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public MyUser hello() {
        MyUser user = new MyUser();
        user.setName("Abbas");
        user.setId(12);
        //
        List<AnotherObject> anotherObjectList = new ArrayList<>();
        anotherObjectList.add(new AnotherObject());
        anotherObjectList.add(new AnotherObject());
        anotherObjectList.add(new AnotherObject());
        user.setAnotherObjectList(anotherObjectList);
        //
        List<Object> objectList = new ArrayList<Object>();
        objectList.add("Hello String");
        objectList.add(new AnotherObject());
        user.setObjectList(objectList);
        //
        Map<String, AnotherObject> stringAnotherObjectMap = new HashMap<String, AnotherObject>();
        stringAnotherObjectMap.put("key1", new AnotherObject());
        stringAnotherObjectMap.put("key2", new AnotherObject());
        user.setStringAnotherObjectMap(stringAnotherObjectMap);
        //
        user.setStringList(Arrays.asList("Str1", "Str2", "Str3"));
        //
        Map<String, Object> stringObjectMap = new HashMap<String, Object>();
        stringObjectMap.put("k1", "HelloStr");
        stringObjectMap.put("k2", new AnotherObject());
        user.setStringObjectMap(stringObjectMap);
        //
        Map<String, String> stringStringMap = new HashMap<String, String>();
        stringStringMap.put(UUID.randomUUID().toString(), "value1");
        stringStringMap.put(UUID.randomUUID().toString(), "value2");
        user.setStringStringMap(stringStringMap);
        return user;
    }

    public static void main(String[] args) {

        String json = "[{\"partNumber\":\"3214W-1-104E\"}]";

    }
}
