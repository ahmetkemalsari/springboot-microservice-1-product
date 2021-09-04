package com.example.microserviceproduct1.models;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", length = 100, nullable = false)
    private String name;
    @Column(name = "price", nullable = false)
    private double price;
    @Column(name = "create_time",nullable = false)
    private LocalDateTime createTime;
}
