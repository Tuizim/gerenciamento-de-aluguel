package com.oikos.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OikosApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(OikosApiApplication.class, args);
        System.out.println("🚀 Oikos API iniciada com sucesso!");
    }

}
