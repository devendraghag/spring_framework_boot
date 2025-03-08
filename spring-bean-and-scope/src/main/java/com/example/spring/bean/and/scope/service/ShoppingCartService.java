package com.example.spring.bean.and.scope.service;


import java.util.ArrayList;
import java.util.List;

public class ShoppingCartService {

    private final List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }

    public List<String> getItems() {
        return items;
    }
}