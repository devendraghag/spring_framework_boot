package com.example.spring.bean.and.scope.controller;

import com.example.spring.bean.and.scope.service.VisitCounterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/visit")
public class ApplicationScopeController {

    private final VisitCounterService visitCounter;

    public ApplicationScopeController(VisitCounterService visitCounter) {
        this.visitCounter = visitCounter;
    }

    @GetMapping("/increment")
    public String incrementVisit() {
        visitCounter.increment();
        return "Total Visits: " + visitCounter.getCount();
    }
}