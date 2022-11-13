package com.linkedbear.spring.basic_dl.d_withanno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.stream.Stream;

public class BeannamesApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("basic_dl/quickstart-withanno.xml");
        String[] beansNames = applicationContext.getBeanDefinitionNames();
        Stream.of(beansNames).forEach(System.out::println);
    }
}
