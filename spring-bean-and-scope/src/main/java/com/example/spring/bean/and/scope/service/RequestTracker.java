package com.example.spring.bean.and.scope.service;
import java.util.UUID;

public class RequestTracker {

    private final String requestId;

    public RequestTracker() {
        this.requestId = UUID.randomUUID().toString();
    }

    public String getRequestId() {
        return requestId;
    }
}