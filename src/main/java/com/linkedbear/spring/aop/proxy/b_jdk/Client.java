package com.linkedbear.spring.aop.proxy.b_jdk;



public class Client {
    public static void main(String[] args) {
        Player player = new Player("郝武辽");
        Partner partner = PartnerPlatform.getPartner(50);
        partner.receiveMoney(100);
        partner.playWith(player);
    }
}
