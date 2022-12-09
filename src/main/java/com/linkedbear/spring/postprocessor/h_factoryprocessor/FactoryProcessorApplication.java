package com.linkedbear.spring.postprocessor.h_factoryprocessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryProcessorApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                "com.linkedbear.spring.postprocessor.h_factoryprocessor"
        );
        Red red = applicationContext.getBean(Red.class);
        System.out.println(red);
    }
}
