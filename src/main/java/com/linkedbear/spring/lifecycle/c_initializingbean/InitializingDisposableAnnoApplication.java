package com.linkedbear.spring.lifecycle.c_initializingbean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InitializingDisposableAnnoApplication {

    public static void main(String[] args) {
        System.out.println("准备初始化IOC容器。。。");
        /*AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                "com.linkedbear.spring.lifecycle.c_initializingbean.bean");*/
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(InitialingBeanConfiguration.class);
        System.out.println("IOC容器初始化完成。。。");
        System.out.println();
        System.out.println("准备销毁IOC容器。。。");
        applicationContext.close();
        System.out.println("IOC容器销毁完成。。。");
    }
}
