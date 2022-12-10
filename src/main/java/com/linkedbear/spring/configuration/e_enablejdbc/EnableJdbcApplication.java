package com.linkedbear.spring.configuration.e_enablejdbc;

import com.alibaba.druid.pool.DruidDataSource;
import com.linkedbear.spring.configuration.e_enablejdbc.config.EnableJdbc;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableJdbc
@PropertySource("classpath:enablejdbc/jdbc.properties")
public class EnableJdbcApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                EnableJdbcApplication.class
        );
        DruidDataSource druidDataSource = applicationContext.getBean(DruidDataSource.class);
        System.out.println(druidDataSource.getUrl());
    }
}
