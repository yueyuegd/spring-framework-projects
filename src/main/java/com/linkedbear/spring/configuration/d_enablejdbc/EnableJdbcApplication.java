package com.linkedbear.spring.configuration.d_enablejdbc;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@EnableJdbc
public class EnableJdbcApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                EnableJdbcApplication.class
        );
        DruidDataSource druidDataSource = applicationContext.getBean(DruidDataSource.class);
        System.out.println(druidDataSource.getUrl());
    }
}
