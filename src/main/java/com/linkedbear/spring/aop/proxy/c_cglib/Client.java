package com.linkedbear.spring.aop.proxy.c_cglib;


public class Client {
    public static void main(String[] args) {
        Player player = new Player("郝武辽");
        Partner partner = PartnerPlatform.getPartner(50);
        partner.receiveMoney(20);
        partner.playWith(player);
        partner.receiveMoney(200);
        partner.playWith(player);
    }
}
