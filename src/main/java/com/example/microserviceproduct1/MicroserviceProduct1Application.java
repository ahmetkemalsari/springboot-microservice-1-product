package com.example.microserviceproduct1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application-${spring.profile.active:default}.properties")
public class MicroserviceProduct1Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProduct1Application.class, args);
    }

}
