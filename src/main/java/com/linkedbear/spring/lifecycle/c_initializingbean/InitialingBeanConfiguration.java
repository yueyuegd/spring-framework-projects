package com.linkedbear.spring.lifecycle.c_initializingbean;

import com.linkedbear.spring.lifecycle.c_initializingbean.bean.Pen3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.linkedbear.spring.lifecycle.c_initializingbean.bean")
public class InitialingBeanConfiguration {

    @Bean(initMethod = "open", destroyMethod = "close")
    public Pen3 pen() {
        return new Pen3();
    }
}
