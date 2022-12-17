package com.linkedbear.spring.aop.b_aspectj;

import com.linkedbear.spring.aop.b_aspectj.config.AspectJAOPConfiguration;
import com.linkedbear.spring.aop.b_aspectj.service.FinanceService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationAspectJApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                AspectJAOPConfiguration.class
        );
        FinanceService financeService = applicationContext.getBean(FinanceService.class);
        financeService.addMoney(123.45);
        financeService.subtractMoney(543.21);
        financeService.getMoneyById("abc");
    }
}
