package com.linkedbear.spring.programmatic;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.io.ClassPathResource;

import java.beans.Introspector;
import java.util.Set;

public class ClassPathBeanDefinitionScannerApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        /*BeanDefinition personDefinition = BeanDefinitionBuilder.genericBeanDefinition(Person.class)
                .addPropertyValue("name", "老王").getBeanDefinition();
        context.registerBeanDefinition("laowang", personDefinition);*/
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(context);
        reader.loadBeanDefinitions(new ClassPathResource("programmatic/programmatic-components.xml"));
        ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(context);
        scanner.addIncludeFilter(((metadataReader, metadataReaderFactory) -> {
            return metadataReader.getClassMetadata().getSuperClassName().equals(Animal.class.getName());
        }));
        Set<BeanDefinition> definitions = scanner.findCandidateComponents("com.linkedbear.spring.programmatic");
        definitions.forEach(definition -> {
            MutablePropertyValues mutablePropertyValues = definition.getPropertyValues();
            String beanClassName = definition.getBeanClassName();
            mutablePropertyValues.addPropertyValue("name", beanClassName);
            mutablePropertyValues.addPropertyValue("person", new RuntimeBeanReference("laowang"));
            context.registerBeanDefinition(Introspector.decapitalize(beanClassName.substring(beanClassName.lastIndexOf("."))), definition);
        });
        context.refresh();
        Cat cat = context.getBean(Cat.class);
        System.out.println(cat);
    }
}
