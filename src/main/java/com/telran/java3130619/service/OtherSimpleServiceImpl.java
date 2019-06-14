package com.telran.java3130619.service;

import org.springframework.stereotype.Service;

@Service
public class OtherSimpleServiceImpl implements OtherSimpleService {

    @Override
    public String getName() {
        return "OtherName " + Math.random();
    }
}
