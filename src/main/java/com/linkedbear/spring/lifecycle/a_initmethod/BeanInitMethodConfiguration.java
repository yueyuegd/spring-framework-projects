package com.linkedbear.spring.lifecycle.a_initmethod;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.linkedbear.spring.lifecycle.a_initmethod")
public class BeanInitMethodConfiguration {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Dog dog() {
        Dog dog = new Dog();
        dog.setName("wangwang");
        return dog;
    }
}
