package com.example.barbershop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class ClientManagerApplication extends SpringBootServletInitializer{

    public static void main(String[] args){
        SpringApplication.run(ClientManagerApplication.class, args);
    }
}
