package com.example.spring.bean.and.scope.config;

import com.example.spring.bean.and.scope.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
public class BeanConfig {

    @Bean
    @Scope("singleton") // Default scope
    public LoggingService loggingService() {
        return new LoggingService();
    }

    @Bean
    @Scope("prototype") // New instance every time
    public RandomNumberService randomNumberService() {
        return new RandomNumberService();
    }

    @Bean
    @Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS) // New instance per request (Web apps)
    public RequestTracker requestTracker() {
        return new RequestTracker();
    }

    @Bean
    @Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS) // New instance per user session (Web apps)
    public ShoppingCartService shoppingCartService() {
        return new ShoppingCartService();
    }

    @Bean
    @Scope("application") // Shared across all users
    public VisitCounterService visitCounterService() {
        return new VisitCounterService();
    }
}