package com.linkedbear.spring.definition.d_merge;

import com.linkedbear.spring.definition.d_merge.bean.Cat;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MergeBeanDefinitionApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "definition/definition-merge.xml"
        );
        Cat cat = (Cat) applicationContext.getBean("cat");
        System.out.println(cat);
        BeanDefinition beanDefinition = applicationContext.getBeanFactory().getMergedBeanDefinition("cat");
        System.out.println(beanDefinition);
    }
}
