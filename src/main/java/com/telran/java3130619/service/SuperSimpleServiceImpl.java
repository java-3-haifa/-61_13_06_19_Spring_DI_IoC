package com.telran.java3130619.service;

public class SuperSimpleServiceImpl implements SimpleService {
    @Override
    public String getName() {
        return "SuperName " + Math.random();
    }
}
