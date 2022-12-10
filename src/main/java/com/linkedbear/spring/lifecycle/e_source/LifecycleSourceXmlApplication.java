package com.linkedbear.spring.lifecycle.e_source;

import com.linkedbear.spring.lifecycle.e_source.bean.Cat;
import com.linkedbear.spring.lifecycle.e_source.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleSourceXmlApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "lifecycle/bean-source.xml"
        );
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
