package com.example.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CxfWebServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CxfWebServiceApplication.class, args);
        System.out.println("Spring Boot 启动了...");
    }

}
