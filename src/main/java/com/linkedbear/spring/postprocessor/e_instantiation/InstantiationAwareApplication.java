package com.linkedbear.spring.postprocessor.e_instantiation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstantiationAwareApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "postprocessor/processor-instantiation.xml"
        );
        Ball ball = (Ball) applicationContext.getBean("ball");
        System.out.println(ball);

        Ball ball2 = (Ball) applicationContext.getBean("ball2");
        System.out.println(ball2);
    }
}
