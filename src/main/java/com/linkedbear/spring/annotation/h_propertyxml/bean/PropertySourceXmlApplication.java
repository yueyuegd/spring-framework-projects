package com.linkedbear.spring.annotation.h_propertyxml.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertySourceXmlApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                JdbcXmlConfiguration.class
        );
        System.out.println(applicationContext.getBean(JdbcXmlProperty.class).toString());
    }
}
