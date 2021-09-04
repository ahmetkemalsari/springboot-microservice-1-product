package com.example.microserviceproduct1.controllers;

import com.example.microserviceproduct1.models.Product;
import com.example.microserviceproduct1.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/1.0/products")
public class ProductController {
    @Autowired
    private IProductService service;

    @GetMapping
    List<Product> getProducts(){
        return service.getProducts();
    }
    @PostMapping
    public ResponseEntity<?> saveProduct(@RequestBody Product product){
        return ResponseEntity.ok(service.saveProduct(product));
    }

    @DeleteMapping("{productId}")
    public ResponseEntity<?> deleteProduct(@PathVariable Long productId){
        service.deleteProduct(productId);
        return ResponseEntity.status(HttpStatus.OK).body("deleted");
    }

}
