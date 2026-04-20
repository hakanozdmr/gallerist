package com.hakanozdemir.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RootEntity<T> {

    private Integer status;
    private T payload;
    private String errorMessage;
    public static  <T> RootEntity<T> success(T payload) {
        RootEntity<T> entity = new RootEntity<T>();
        entity.setStatus(200);
        entity.setPayload(payload);
        entity.setErrorMessage(null);
        return entity;
    }
    public static  <T> RootEntity<T> error(String errorMessage) {
        RootEntity<T> entity = new RootEntity<T>();
        entity.setStatus(500);
        entity.setPayload(null);
        entity.setErrorMessage(errorMessage);
        return entity;
    }
}
