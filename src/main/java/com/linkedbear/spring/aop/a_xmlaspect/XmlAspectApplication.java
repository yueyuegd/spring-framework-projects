package com.linkedbear.spring.aop.a_xmlaspect;

import com.linkedbear.spring.aop.a_xmlaspect.service.FinanceService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlAspectApplication {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "a_xmlaspect/xmlaspect.xml"
        );
        FinanceService financeService = applicationContext.getBean(FinanceService.class);
        financeService.addMoney(123.45);
        financeService.subtractMoney(543.21);
        financeService.getMoneyById("abc");
        financeService.subtractMoney(543.21, "abc");
    }
}
