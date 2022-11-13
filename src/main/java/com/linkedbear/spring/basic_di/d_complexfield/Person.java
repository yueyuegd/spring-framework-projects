package com.linkedbear.spring.basic_di.d_complexfield;

import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name = "administrator";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
