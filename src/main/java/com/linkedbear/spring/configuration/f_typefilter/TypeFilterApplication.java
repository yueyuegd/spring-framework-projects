package com.linkedbear.spring.configuration.f_typefilter;

import com.linkedbear.spring.configuration.f_typefilter.config.TypeFilterConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

public class TypeFilterApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TypeFilterConfiguration.class);
        Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
