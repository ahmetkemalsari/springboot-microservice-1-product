package com.example.microserviceproduct1.repositories;

import com.example.microserviceproduct1.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IProductRepository extends JpaRepository<Product,Long> {
}
