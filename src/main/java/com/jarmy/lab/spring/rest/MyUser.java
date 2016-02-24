package com.jarmy.lab.spring.rest;

import java.util.List;
import java.util.Map;

public class MyUser {
    private String name;
    private long id;
    private Map<String, String> stringStringMap;
    private Map<String, AnotherObject> stringAnotherObjectMap;
    private Map<String, Object> stringObjectMap;
    private List<String> stringList;
    private List<Object> objectList;
    private List<AnotherObject> anotherObjectList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Map<String, String> getStringStringMap() {
        return stringStringMap;
    }

    public void setStringStringMap(Map<String, String> stringStringMap) {
        this.stringStringMap = stringStringMap;
    }

    public Map<String, AnotherObject> getStringAnotherObjectMap() {
        return stringAnotherObjectMap;
    }

    public void setStringAnotherObjectMap(Map<String, AnotherObject> stringAnotherObjectMap) {
        this.stringAnotherObjectMap = stringAnotherObjectMap;
    }

    public Map<String, Object> getStringObjectMap() {
        return stringObjectMap;
    }

    public void setStringObjectMap(Map<String, Object> stringObjectMap) {
        this.stringObjectMap = stringObjectMap;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public List<Object> getObjectList() {
        return objectList;
    }

    public void setObjectList(List<Object> objectList) {
        this.objectList = objectList;
    }

    public List<AnotherObject> getAnotherObjectList() {
        return anotherObjectList;
    }

    public void setAnotherObjectList(List<AnotherObject> anotherObjectList) {
        this.anotherObjectList = anotherObjectList;
    }

}
