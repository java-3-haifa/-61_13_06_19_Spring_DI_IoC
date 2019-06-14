package com.telran.java3130619.service;

public class SimpleServiceImpl implements SimpleService {
    @Override
    public String getName() {
        return "Name " + Math.random();
    }
}
