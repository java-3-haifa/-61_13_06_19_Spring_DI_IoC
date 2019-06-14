package com.telran.java3130619;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Java3130619Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Java3130619Application.class, args);
//        System.out.println(context.getBeanDefinitionNames().length);
    }

}
