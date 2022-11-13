package com.linkedbear.spring.basic_di.c_value_spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InjectValueAnnoApplication {
    public static void main(String[] args) {
        /*ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.linkedbear.spring.basic_di.c_value_spel");
        Black black = applicationContext.getBean(Black.class);
        System.out.println("simple value:" + black);*/

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(InjectValueConfiguration.class);
        Red red = applicationContext.getBean(Red.class);
        System.out.println("properties value: " + red);
        Blue blue = applicationContext.getBean(Blue.class);
        System.out.println(blue);
        Green green = applicationContext.getBean(Green.class);
        System.out.println(green);
        White white = applicationContext.getBean(White.class);
        System.out.println(white);
    }
}
