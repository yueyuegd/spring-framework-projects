package com.linkedbear.spring.environment.b_api;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EnvironmentApiApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                "com.linkedbear.spring.environment.b_api"
        );
        EnvironmentHolder environmentHolder = applicationContext.getBean(EnvironmentHolder.class);
        environmentHolder.printEnvironment();
    }
}
