package com.example.spring.bean.and.scope.service;

import java.util.Random;

public class RandomNumberService {

    private final int randomNumber;

    public RandomNumberService() {
        this.randomNumber = new Random().nextInt(100);
    }

    public int getRandomNumber() {
        return randomNumber;
    }
}