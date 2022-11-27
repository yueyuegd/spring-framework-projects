package com.linkedbear.spring.configuration.b_profile;

import com.linkedbear.spring.configuration.b_profile.config.TavernConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

public class TavernProfileApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(TavernConfiguration.class);
        /*Boss boss = applicationContext.getBean(Boss.class);
        System.out.println(boss);*/
        //applicationContext.getEnvironment().setActiveProfiles("city");
        Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
        /*System.out.println("========================");
        Map<String, Bartender> map = applicationContext.getBeansOfType(Bartender.class);
        map.forEach((k,v) -> System.out.println(v));*/
        /*AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.getEnvironment().setActiveProfiles("city");
        applicationContext.register(TavernConfiguration.class);
        applicationContext.refresh();
        Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);*/
    }
}
