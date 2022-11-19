package com.linkedbear.spring.bean.b_scope;

import com.linkedbear.spring.bean.b_scope.bean.Child;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanScopeAnnoApplication {

    public static void main(String[] args) {
        /*ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanScopeConfiguration.class);
        applicationContext.getBeansOfType(Child.class).forEach((name, child) -> {
            System.out.println("name: " + name + ":" + child);
        });*/
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.linkedbear.spring.bean.b_scope.bean");
    }
}
