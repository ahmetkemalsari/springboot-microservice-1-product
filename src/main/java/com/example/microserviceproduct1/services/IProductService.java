package com.example.microserviceproduct1.services;


import com.example.microserviceproduct1.models.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IProductService {


    List<Product> getProducts();

    Product saveProduct(Product product);

    void deleteProduct(Long id);
}
