package com.linkedbear.spring.aop.b_aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logger {

    @Pointcut("execution(public * com.linkedbear.spring.aop.b_aspectj.service.*.*(String))")
    public void defaultPointcut() {

    }
    @Before("execution(public * com.linkedbear.spring.aop.b_aspectj.service.FinanceService.*(..))")
    public void beforePrint() {
        System.out.println("Logger beforePrint run ......");
    }

    @After("@annotation(com.linkedbear.spring.aop.b_aspectj.Log)")
    public void afterPrint() {
        System.out.println("Logger afterPrint run ......");
    }

    @AfterReturning("defaultPointcut()")
    public void afterReturningPrint() {
        System.out.println("Logger afterReturningPrint run ......");
    }

    @AfterThrowing("execution(* com.linkedbear.spring.aop.b_aspectj.service.*.*(String))")
    public void afterThrowingPrint() {
        System.out.println("Logger afterThrowingPrint run ......");
    }

    @Around("execution(public * com.linkedbear.spring.aop.b_aspectj.service.FinanceService.addMoney(..))")
    public Object aroundPrint(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Logger aroundPrint before run ......");
        try {
            Object result = pjp.proceed();   // 此处会抛出Throwable异常
            System.out.println("Logger aroundPrint afterReturning run ......");
            return result;
        } catch (Throwable throwable) {
            System.out.println("Logger aroundPrint afterThrowing run ......");
            throw throwable;
        } finally {
            System.out.println("Logger aroundPrint after run ......");
        }
    }
}
