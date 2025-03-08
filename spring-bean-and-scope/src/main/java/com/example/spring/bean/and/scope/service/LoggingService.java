package com.example.spring.bean.and.scope.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoggingService {

    public LoggingService() {
        log.info("LoggingService instance created");
    }

    public void logMessage(String message) {
        log.info("Log: {}", message);
    }
}