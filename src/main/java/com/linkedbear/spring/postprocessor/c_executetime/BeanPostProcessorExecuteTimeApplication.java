package com.linkedbear.spring.postprocessor.c_executetime;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPostProcessorExecuteTimeApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "postprocessor/processor-executetime.xml"
        );
        applicationContext.close();
    }
}
