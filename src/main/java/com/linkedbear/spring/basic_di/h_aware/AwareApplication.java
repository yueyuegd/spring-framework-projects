package com.linkedbear.spring.basic_di.h_aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AwareApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AwareConfiguration.class);
        AwaredTestBean bbb = applicationContext.getBean(AwaredTestBean.class);
        bbb.printBeanNames();
        System.out.println(bbb.getBeanName());
    }
}
