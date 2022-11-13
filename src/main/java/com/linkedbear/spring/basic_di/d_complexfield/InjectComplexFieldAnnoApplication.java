package com.linkedbear.spring.basic_di.d_complexfield;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InjectComplexFieldAnnoApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.linkedbear.spring.basic_di.d_complexfield");
        Dog dog = applicationContext.getBean(Dog.class);
        System.out.println(dog);
    }
}
