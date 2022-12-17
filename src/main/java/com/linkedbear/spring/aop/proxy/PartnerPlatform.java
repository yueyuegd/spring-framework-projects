package com.linkedbear.spring.aop.proxy;

import java.util.ArrayList;
import java.util.List;

public class PartnerPlatform {

    private static List<Partner> partnerList = new ArrayList<>();
    static {
        partnerList.add(new Partner("肖洁洁"));
        partnerList.add(new Partner("田苟"));
        partnerList.add(new Partner("高总裁"));
    }

    public Partner getPartner(int money) {
        Partner partner = partnerList.remove(0);
        return partner;
    }
}
