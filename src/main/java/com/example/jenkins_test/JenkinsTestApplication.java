package com.example.jenkins_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsTestApplication {

    public static void main(String[] args) {
        System.out.println("Hi from java! change here!");
        SpringApplication.run(JenkinsTestApplication.class, args);
    }

}
