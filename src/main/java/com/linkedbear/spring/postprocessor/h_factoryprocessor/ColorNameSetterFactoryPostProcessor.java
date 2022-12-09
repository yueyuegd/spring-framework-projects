package com.linkedbear.spring.postprocessor.h_factoryprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;
import org.springframework.util.StringUtils;

import java.util.stream.Stream;

@Component
public class ColorNameSetterFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        Stream.of(beanFactory.getBeanDefinitionNames()).forEach(item -> {
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(item);
            if (StringUtils.hasText(beanDefinition.getBeanClassName())) {
                if (ClassUtils.resolveClassName(beanDefinition.getBeanClassName(),
                        this.getClass().getClassLoader()).getSuperclass().equals(Color.class)) {
                    beanDefinition.getPropertyValues().addPropertyValue("name", item);
                }
            }
        });
    }
}
