package com.linkedbear.spring.definition.b_registry;

import com.linkedbear.spring.definition.b_registry.bean.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanDefinitionRegistryApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                BeanDefinitionRegistryConfiguration.class
        );
        Person person = applicationContext.getBean(Person.class);
        System.out.println(person);
    }
}
