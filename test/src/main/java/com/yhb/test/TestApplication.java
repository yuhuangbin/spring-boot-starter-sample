package com.yhb.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class TestApplication {

    @Autowired
    private String user;

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

    @PostConstruct
    public void init () {
        System.out.println("自动装配: " + user);
    }

}
