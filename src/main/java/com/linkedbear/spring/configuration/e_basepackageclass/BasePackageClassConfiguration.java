package com.linkedbear.spring.configuration.e_basepackageclass;

import com.linkedbear.spring.configuration.e_basepackageclass.bean.DemoService;
import com.linkedbear.spring.configuration.e_basepackageclass.compnent.DemoComponent;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {DemoService.class, DemoComponent.class})
public class BasePackageClassConfiguration {
}
