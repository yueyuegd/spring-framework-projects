package com.linkedbear.spring.annotation.g_propertysource;

import com.linkedbear.spring.annotation.g_propertysource.bean.JdbcProperties;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertySourcePropertiesApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                JdbcPropertiesConfiguration.class
        );
        System.out.println(applicationContext.getBean(JdbcProperties.class).toString());
    }
}
