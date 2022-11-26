package com.linkedbear.spring.event.b_registerevent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RegisterEventApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                "com.linkedbear.spring.event.b_registerevent");
        RegisterService registerService = applicationContext.getBean(RegisterService.class);
        registerService.register("张大三");
    }
}
