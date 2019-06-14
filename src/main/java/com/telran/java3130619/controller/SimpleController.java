package com.telran.java3130619.controller;

import com.telran.java3130619.service.SimpleService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    SimpleService service;

    public SimpleController(@Qualifier("simple") SimpleService service) {
        this.service = service;
    }

    @GetMapping("name")
    public String getName(){
        return service.getName();
    }
}
