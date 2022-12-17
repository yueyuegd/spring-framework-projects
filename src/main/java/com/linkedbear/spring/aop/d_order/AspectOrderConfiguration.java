package com.linkedbear.spring.aop.d_order;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.linkedbear.spring.aop.d_order")
public class AspectOrderConfiguration {
}
