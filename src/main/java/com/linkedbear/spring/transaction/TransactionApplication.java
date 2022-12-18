package com.linkedbear.spring.transaction;

import com.linkedbear.spring.transaction.config.TransactionAspectConfiguration;
import com.linkedbear.spring.transaction.service.FinanceService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TransactionApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                TransactionAspectConfiguration.class
        );
        FinanceService financeService = applicationContext.getBean(FinanceService.class);
        financeService.transfer(1L, 2L, 100);
    }
}
