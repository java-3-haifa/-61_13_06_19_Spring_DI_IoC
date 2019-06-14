package com.telran.java3130619.controller;

import com.telran.java3130619.service.OtherSimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OtherController {
    @Autowired
    OtherSimpleService service;

    @GetMapping("other")
    public String getName(){
        return service.getName();
    }
}
