package com.example.spring_data_jpa.repository;

import com.example.spring_data_jpa.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}