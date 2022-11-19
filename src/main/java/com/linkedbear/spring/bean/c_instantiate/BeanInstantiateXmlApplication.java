package com.linkedbear.spring.bean.c_instantiate;

import com.linkedbear.spring.bean.c_instantiate.bean.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanInstantiateXmlApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean/bean-instantiate.xml");
        applicationContext.getBeansOfType(Car.class).forEach((k,v) -> {
            System.out.println("name: " + k + ":" + v);
        });
        System.out.println(applicationContext.getBean(CarStaticFactory.class));
    }
}
