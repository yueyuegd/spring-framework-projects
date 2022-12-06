package com.linkedbear.spring.definition.a_quickstart;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanDefinitionQuickstartXmlApplication {

    public static void main(String[] args) {
        /*ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "definition/definition-beans.xml"
        );
        BeanDefinition beanDefinition = applicationContext.getBeanFactory().getBeanDefinition("person");
        System.out.println(beanDefinition);*/
        /*AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("" +
                "com.linkedbear.spring.definition.a_quickstart.bean");
        BeanDefinition beanDefinition = applicationContext.getBeanDefinition("person");
        System.out.println(beanDefinition);
        System.out.println(beanDefinition.getClass().getName());*/
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanDefinitionQuickstartConfiguration.class);
        BeanDefinition beanDefinition = applicationContext.getBeanDefinition("person");
        System.out.println(beanDefinition);
        System.out.println(beanDefinition.getClass().getName());
    }
}
