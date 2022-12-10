package com.linkedbear.spring.programmatic;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProgrammaticInjectApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        BeanDefinition personDefinition = BeanDefinitionBuilder.genericBeanDefinition(Person.class).
                addPropertyValue("name", "老王").getBeanDefinition();
        context.registerBeanDefinition("laowang", personDefinition);
        BeanDefinition catDefinition = BeanDefinitionBuilder.genericBeanDefinition(Cat.class)
                .addPropertyValue("name", "咪咪").addPropertyReference("person", "laowang")
                //.setScope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
                .setLazyInit(true)
                        .getBeanDefinition();
        context.registerBeanDefinition("mimi", catDefinition);
        BeanDefinition dogDefinition = BeanDefinitionBuilder.genericBeanDefinition(Dog.class)
                        .addPropertyValue("name", "汪汪").addPropertyReference("person", "laowang")
                        .getBeanDefinition();
        context.registerBeanDefinition("wangwang", dogDefinition);
        context.refresh();
        System.out.println("ApplicationContext refreshed ......");
        Cat cat = context.getBean(Cat.class);
        System.out.println(cat);
        Dog dog = context.getBean(Dog.class);
        System.out.println(dog);
    }
}
