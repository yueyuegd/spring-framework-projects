package com.linkedbear.spring.basic_dl.quickstart_lazylookup;

import com.linkedbear.spring.basic_dl.quickstart_lazylookup.bean.Cat;
import com.linkedbear.spring.basic_dl.quickstart_lazylookup.bean.Dog;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazyLookupApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("basic_dl/quickstart-lazylookup.xml");
        Cat cat = applicationContext.getBean(Cat.class);
        System.out.println(cat);
        // 这一行不会报错，如果容器中没有注入Dog这个bean
        ObjectProvider<Dog> dogObjectProvider = applicationContext.getBeanProvider(Dog.class);
        System.out.println(dogObjectProvider);
    }
}
