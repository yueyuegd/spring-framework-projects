package com.linkedbear.spring.postprocessor.g_mergedefinition;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal{

    @Value("咪咪") private String name;

    public Cat() {
        System.out.println("Cat constructor run ......");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
