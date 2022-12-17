package com.linkedbear.spring.aop.c_joinpoint;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

@Component
@Aspect
public class Logger {

    @Pointcut("execution(public * com.linkedbear.spring.aop.c_joinpoint.service.*.*(String))")
    public void defaultPointcut() {

    }
    /*@Before("execution(public * com.linkedbear.spring.aop.c_joinpoint.service.FinanceService.*(..))")
    public void beforePrint() {
        System.out.println("Logger beforePrint run ......");
    }*/

    @Before("execution(public * com..FinanceService.addMoney(..))")
    public void beforePrint(JoinPoint joinPoint) {
        /*System.out.println(joinPoint.getTarget());
        System.out.println(joinPoint.getThis());
        System.out.println(Arrays.toString(joinPoint.getArgs()));
        System.out.println(joinPoint.getSignature());
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println(method.getName());*/
        System.out.println("Logger beforePrint run ......");
        System.out.println("被拦截的类:" + joinPoint.getTarget().getClass().getName());
        System.out.println("被拦截的方法:" + ((MethodSignature) joinPoint.getSignature()).getMethod().getName());
        System.out.println("被拦截的方法参数:" + Arrays.toString(joinPoint.getArgs()));
    }

    @After("@annotation(com.linkedbear.spring.aop.c_joinpoint.Log)")
    public void afterPrint() {
        System.out.println("Logger afterPrint run ......");
    }

    @AfterReturning(value = "execution(* com..FinanceService.subtractMoney(double))", returning = "ret")
    public void afterReturningPrint(Object ret) {
        System.out.println("Logger afterReturningPrint run ......");
        System.out.println("返回的数据：" + ret);
    }

    @AfterThrowing(value = "defaultPointcut()", throwing = "e")
    public void afterThrowingPrint(Exception e) {
        System.out.println("Logger afterThrowingPrint run ......");
    }

    @Around("execution(public * com.linkedbear.spring.aop.c_joinpoint.service.FinanceService.addMoney(..))")
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
