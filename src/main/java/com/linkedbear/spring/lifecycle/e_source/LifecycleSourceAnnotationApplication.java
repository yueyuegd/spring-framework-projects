package com.linkedbear.spring.lifecycle.e_source;

import com.linkedbear.spring.lifecycle.e_source.bean.Cat;
import com.linkedbear.spring.lifecycle.e_source.bean.Person;
import com.linkedbear.spring.lifecycle.e_source.config.LifecycleDestructionPostProcessor;
import com.linkedbear.spring.lifecycle.e_source.config.LifecycleNameReadPostProcessor;
import com.linkedbear.spring.lifecycle.e_source.config.LifecycleSourceConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifecycleSourceAnnotationApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(LifecycleSourceConfiguration.class);
        applicationContext.register(LifecycleNameReadPostProcessor.class);
        applicationContext.register(LifecycleDestructionPostProcessor.class);
        System.out.println("================准备刷新IOC容器==================");
        applicationContext.refresh();
        System.out.println("================IOC容器刷新完毕==================");
        applicationContext.start();
        System.out.println("================IOC容器启动完成==================");
        Person person = applicationContext.getBean(Person.class);
        System.out.println(person);
        Cat cat = applicationContext.getBean(Cat.class);
        System.out.println(cat);
        System.out.println("================准备停止IOC容器==================");
        applicationContext.stop();
        System.out.println("================IOC容器停止成功==================");
        applicationContext.close();
    }
}
