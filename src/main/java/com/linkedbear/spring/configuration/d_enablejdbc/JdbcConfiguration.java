package com.linkedbear.spring.configuration.d_enablejdbc;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class JdbcConfiguration {

    @Bean
    @ConditionalOnClassName("com.mysql.jdbc.Driver")
    public DataSource dataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/mysqltest?characterEncoding=utf8");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("990921");
        return druidDataSource;
    }

    @Bean
    public QueryRunner queryRunner(DataSource dataSource) {
        return new QueryRunner(dataSource);
    }
}
