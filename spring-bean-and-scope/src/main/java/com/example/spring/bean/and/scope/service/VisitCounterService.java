package com.example.spring.bean.and.scope.service;

public class VisitCounterService {

    private int counter = 0;

    public void increment() {
        counter++;
    }

    public int getCount() {
        return counter;
    }
}