package com.linkedbear.spring.aop.e_aopcontext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.linkedbear.spring.aop.e_aopcontext")
@EnableAspectJAutoProxy(exposeProxy = true) // 暴露代理对象
public class AopContextConfiguration {
}
