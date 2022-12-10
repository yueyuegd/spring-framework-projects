package com.linkedbear.spring.programmatic;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProgrammaticQuickstartApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        BeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition(Person.class)
                .addPropertyValue("name", "zhangsan").getBeanDefinition();
        applicationContext.registerBeanDefinition("person", beanDefinition);
        applicationContext.refresh();
        Person person = applicationContext.getBean(Person.class);
        System.out.println(person);
    }
}
