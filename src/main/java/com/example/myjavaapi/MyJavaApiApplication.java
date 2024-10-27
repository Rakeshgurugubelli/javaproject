package com.example.myjavaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyJavaApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyJavaApiApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "Hello, World!";
    }
}

