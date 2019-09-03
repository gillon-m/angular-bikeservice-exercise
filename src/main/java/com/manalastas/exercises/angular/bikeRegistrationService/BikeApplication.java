package com.manalastas.exercises.angular.bikeRegistrationService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BikeApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(BikeApplication.class, args);
    }
}