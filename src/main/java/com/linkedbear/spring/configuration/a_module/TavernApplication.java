package com.linkedbear.spring.configuration.a_module;

import com.linkedbear.spring.configuration.a_module.config.TavernConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

public class TavernApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TavernConfiguration.class);
        /*Boss boss = applicationContext.getBean(Boss.class);
        System.out.println(boss);*/
        Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
        /*System.out.println("========================");
        Map<String, Bartender> map = applicationContext.getBeansOfType(Bartender.class);
        map.forEach((k,v) -> System.out.println(v));*/
    }
}
