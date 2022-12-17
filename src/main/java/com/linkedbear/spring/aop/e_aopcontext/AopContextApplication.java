package com.linkedbear.spring.aop.e_aopcontext;

import com.linkedbear.spring.aop.e_aopcontext.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopContextApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                AopContextConfiguration.class
        );
        UserService userService = applicationContext.getBean(UserService.class);
        userService.update("abc", "def");
    }
}
