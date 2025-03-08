package com.example.spring.bean.and.scope.controller;

import com.example.spring.bean.and.scope.service.LoggingService;
import com.example.spring.bean.and.scope.service.RandomNumberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SingletonPrototypeController {

    private final LoggingService loggingService;
    private final RandomNumberService randomNumberService1;
    private final RandomNumberService randomNumberService2;

    public SingletonPrototypeController(LoggingService loggingService,
                                        RandomNumberService randomNumberService1,
                                        RandomNumberService randomNumberService2) {
        this.loggingService = loggingService;
        this.randomNumberService1 = randomNumberService1;
        this.randomNumberService2 = randomNumberService2;
    }

    @GetMapping("/log")
    public String logTest() {
        loggingService.logMessage("Test log message");
        loggingService.
        return "Log tested";
    }

    @GetMapping("/random")
    public String randomTest() {
        return "Random1: " + randomNumberService1.getRandomNumber() +
                ", Random2: " + randomNumberService2.getRandomNumber();
    }
}