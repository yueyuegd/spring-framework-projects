package com.linkedbear.spring.aop.proxy.c_cglib;

/**
 * 普通玩家类
 */
public class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
