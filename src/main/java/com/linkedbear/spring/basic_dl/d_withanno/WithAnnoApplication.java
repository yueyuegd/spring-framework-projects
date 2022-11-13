package com.linkedbear.spring.basic_dl.d_withanno;

import com.linkedbear.spring.basic_dl.d_withanno.anno.Color;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class WithAnnoApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("basic_dl/quickstart-withanno.xml");
        Map<String, Object> map = applicationContext.getBeansWithAnnotation(Color.class);
        map.forEach((key, value) -> {
            System.out.println(key + ":" + value);
        });
    }
}
