package com.linkedbear.spring.postprocessor.g_mergedefinition;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class Animal {

    //@Autowired
    private Person person;

    public Person getPerson() {
        return person;
    }

    @Autowired public void setPerson(Person person) {
        System.out.println("Animal setPerson run ......");
        this.person = person;
    }
}
