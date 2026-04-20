package com.hakanozdemir.controller;

public class BaseController {
    public <T> RootEntity<T> success(T payload){
        return RootEntity.success(payload);
    }
    public <T> RootEntity<T> error(String message){
        return RootEntity.error(message);
    }
}
