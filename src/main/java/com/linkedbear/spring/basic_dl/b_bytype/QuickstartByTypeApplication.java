package com.linkedbear.spring.basic_dl.b_bytype;

import com.linkedbear.spring.basic_dl.b_bytype.bean.Person;
import com.linkedbear.spring.basic_dl.b_bytype.dao.DemoDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuickstartByTypeApplication {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("basic_dl/quickstart-bytype.xml");
        Person person = beanFactory.getBean(Person.class);
        System.out.println(person);

        DemoDao demoDao = beanFactory.getBean(DemoDao.class);
        System.out.println(demoDao.finaAll());
    }
}
