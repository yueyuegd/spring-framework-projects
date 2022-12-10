package com.linkedbear.spring.event.d_payload;

import com.linkedbear.spring.programmatic.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PayloadEventApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.addApplicationListener(new PayloadObjectApplicationListener());
        applicationContext.addApplicationListener(new PayloadIntegerApplicationListener());
        applicationContext.refresh();
        // 广播事件
        applicationContext.publishEvent("hahaha");
        applicationContext.publishEvent(123456789);
        applicationContext.publishEvent(new Person());
    }
}
