package com.linkedbear.spring.annotation.h_propertyxml.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.linkedbear.spring.annotation.h_propertyxml.bean")
@PropertySource("classpath:propertyxml/jdbc.xml")
public class JdbcXmlConfiguration {
}
