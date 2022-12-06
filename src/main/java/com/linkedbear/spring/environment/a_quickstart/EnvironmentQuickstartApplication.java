package com.linkedbear.spring.environment.a_quickstart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EnvironmentQuickstartApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                "com.linkedbear.spring.environment.a_quickstart"
        );
        EnvironmentHolder environmentHolder = applicationContext.getBean(EnvironmentHolder.class);
        environmentHolder.printEnvironment();;
    }
}
