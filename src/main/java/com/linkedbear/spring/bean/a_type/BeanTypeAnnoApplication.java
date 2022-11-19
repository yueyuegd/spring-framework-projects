package com.linkedbear.spring.bean.a_type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class BeanTypeAnnoApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ToyConfiguration.class);
        /*Toy toy = applicationContext.getBean(Toy.class);
        System.out.println(toy);*/

        /*Map<String, Toy> map = applicationContext.getBeansOfType(Toy.class);
        map.forEach((k, v) -> System.out.println("toy name:" + k + "," + v.toString()));*/
    }


}
