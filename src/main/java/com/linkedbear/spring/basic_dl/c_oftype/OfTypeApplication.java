package com.linkedbear.spring.basic_dl.c_oftype;

import com.linkedbear.spring.basic_dl.c_oftype.dao.DemoDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class OfTypeApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("basic_dl/quickstart-oftype.xml");
        Map<String, DemoDao> map = applicationContext.getBeansOfType(DemoDao.class);
        map.forEach((key, value) -> {
            System.out.println(key + ":" + value);
        });
    }
}
