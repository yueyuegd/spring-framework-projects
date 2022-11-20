package com.linkedbear.spring.lifecycle.a_initmethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitMethodXmlApplication {

    public static void main(String[] args) {
        System.out.println("准备初始化IOC容器。。。");
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("lifecycle/bean-initmethod.xml");
        System.out.println("IOC容器初始化完成。。。");

        System.out.println("准备销毁IOC容器。。。");
        applicationContext.close();
        System.out.println("IOC容器销毁完成。。。");
    }
}
