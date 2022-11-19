package com.linkedbear.spring.bean.b_scope.bean;

public class Child {

    private Toy toy;

    public void setToy(Toy toy) {
        this.toy = toy;
    }

    @Override
    public String toString() {
        return "Child{" +
                "toy=" + toy +
                '}';
    }
}
