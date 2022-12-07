package com.linkedbear.spring.postprocessor.d_factorybean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryBeanPostProcessorApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                "com/linkedbear/spring/postprocessor/d_factorybean"
        );
        Egg egg = applicationContext.getBean(Egg.class);
        System.out.println(egg);
        applicationContext.close();
    }
}
