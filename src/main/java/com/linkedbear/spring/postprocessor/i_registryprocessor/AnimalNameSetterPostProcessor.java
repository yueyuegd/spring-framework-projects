package com.linkedbear.spring.postprocessor.i_registryprocessor;

import com.linkedbear.spring.postprocessor.i_registryprocessor.bean.Animal;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

//@Component
public class AnimalNameSetterPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("AnimalNameSetterPostProcessor postProcessBeanFactory run ......");
        String[] animalNames = beanFactory.getBeanNamesForType(Animal.class);
        Stream.of(animalNames).forEach(item -> {
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(item);
            beanDefinition.getPropertyValues().add("name", item);
        });
    }
}
