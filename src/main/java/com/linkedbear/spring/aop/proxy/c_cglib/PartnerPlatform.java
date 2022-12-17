package com.linkedbear.spring.aop.proxy.c_cglib;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class PartnerPlatform {

    private static List<Partner> partnerList = new ArrayList<>();
    static {
        partnerList.add(new Partner("肖洁洁"));
        partnerList.add(new Partner("田苟"));
        partnerList.add(new Partner("高总裁"));
    }

    public static Partner getPartner(int money) {
        Partner partner = partnerList.remove(0);
        // 使用Cglib的Enhancer创建代理对象
        return (Partner) Enhancer.create(partner.getClass(), new MethodInterceptor() {
            private int budget = money;
            private boolean status = false;
            @Override
            public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                // 如果在付钱时没给够，则标记budget为异常值
                if (method.getName().equals("receiveMoney")) {
                    int money = (int) args[0];
                    this.status = money >= budget;
                }
                if (status) {
                    return method.invoke(partner, args);
                }
                return null;
            }
        });
    }
}
