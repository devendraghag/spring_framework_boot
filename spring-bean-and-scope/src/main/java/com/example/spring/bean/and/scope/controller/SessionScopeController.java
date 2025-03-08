package com.example.spring.bean.and.scope.controller;

import com.example.spring.bean.and.scope.service.ShoppingCartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class SessionScopeController {

    private final ShoppingCartService shoppingCart;

    public SessionScopeController(ShoppingCartService shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @GetMapping("/add/{item}")
    public String addItem(@PathVariable String item) {
        shoppingCart.addItem(item);
        return "Added: " + item;
    }

    @GetMapping("/items")
    public List<String> getCartItems() {
        return shoppingCart.getItems();
    }
}