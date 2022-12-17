package com.linkedbear.spring.aop.d_order;

import com.linkedbear.spring.aop.d_order.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AspectOrderApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                AspectOrderConfiguration.class
        );
        UserService userService = applicationContext.getBean(UserService.class);
        userService.saveUser("abc");
    }
}
