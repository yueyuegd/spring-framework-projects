package com.linkedbear.spring.aop.b_aspectj.service;

import com.linkedbear.spring.aop.b_aspectj.Log;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class FinanceService {

    public void addMoney(double money) {
        System.out.println("FinanceService 收钱 === " + money);
    }

    @Log
    public double subtractMoney(double money) {
        System.out.println("FinanceService 付钱 === " + money);
        return money;
    }

    public double subtractMoney(double money, String id) throws Exception {
        System.out.println("FinanceService 付钱 === " + money);
        if (!StringUtils.isEmpty(id)) {
            throw new RuntimeException();
        }
        return money;
    }

    public double getMoneyById(String id) {
        System.out.println("FinanceService 查询账户，id为" + id);
        return Math.random();
    }
}
