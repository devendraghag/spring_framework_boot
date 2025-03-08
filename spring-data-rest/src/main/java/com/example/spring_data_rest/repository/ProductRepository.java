package com.example.spring_data_rest.repository;

import com.example.spring_data_rest.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "products") // Exposes REST endpoints
public interface ProductRepository extends JpaRepository<Product, Long> {
}