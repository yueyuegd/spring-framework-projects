package com.linkedbear.spring.aop.proxy;

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
