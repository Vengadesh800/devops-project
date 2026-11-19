package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping("/")
    public String home() {

        return "Welcome to AWS DevOps End-to-End Project! and my first end-to-end POC";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is healthy!";
    }
}
