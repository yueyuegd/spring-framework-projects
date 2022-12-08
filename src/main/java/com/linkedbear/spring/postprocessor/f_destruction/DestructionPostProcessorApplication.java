package com.linkedbear.spring.postprocessor.f_destruction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DestructionPostProcessorApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                "com.linkedbear.spring.postprocessor.f_destruction"
        );
        applicationContext.close();
    }
}
