package com.telran.java3130619;

import com.telran.java3130619.service.SimpleService;
import com.telran.java3130619.service.SimpleServiceImpl;
import com.telran.java3130619.service.SuperSimpleServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanFactory {

    @Bean()
    @Qualifier("simple")
    public SimpleService getSimpleService(){
        return new SimpleServiceImpl();
    }

    @Bean("super")
    public SimpleService getSuperSimpleService(){
        return new SuperSimpleServiceImpl();
    }
}
