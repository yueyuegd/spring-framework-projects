package com.linkedbear.spring.definition.c_removedefinition;

import com.linkedbear.spring.definition.c_removedefinition.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RemoveBeanDefinitionApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "definition/remove-definitions.xml"
        );
        Person person = (Person) applicationContext.getBean("aqiang");
        System.out.println(person);
    }
}
