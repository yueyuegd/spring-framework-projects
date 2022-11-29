package com.linkedbear.spring.annotation.i_propertyyml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertySourceYmlApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                JdbcYmlConfiguration.class
        );
        System.out.println(applicationContext.getBean(JdbcYmlProperty.class).toString());
    }
}
