package com.linkedbear.spring.lifecycle.e_source.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cat {
    @Autowired
    private Person master;

    private String name;

    public Person getMaster() {
        return master;
    }

    public void setMaster(Person master) {
        this.master = master;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "master=" + master +
                ", name='" + name + '\'' +
                '}';
    }
}
