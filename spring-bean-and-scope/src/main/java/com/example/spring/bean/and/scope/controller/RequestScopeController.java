package com.example.spring.bean.and.scope.controller;

import com.example.spring.bean.and.scope.service.RequestTracker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RequestScopeController {

    private final RequestTracker requestTracker;

    public RequestScopeController(RequestTracker requestTracker) {
        this.requestTracker = requestTracker;
    }

    @GetMapping("/request")
    public String requestTest() {
        return "Request ID: " + requestTracker.getRequestId();
    }
}