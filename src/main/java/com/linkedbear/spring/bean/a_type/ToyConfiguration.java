package com.linkedbear.spring.bean.a_type;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToyConfiguration {

    @Bean
    public Child child() {
        return new Child();
    }

    @Bean
    public ToyFactoryBean toyFactoryBean() {
        ToyFactoryBean toyFactoryBean = new ToyFactoryBean();
        toyFactoryBean.setChild(child());
        return toyFactoryBean;
    }

    @Bean
    public Toy ball() {
        return new Ball("ball");
    }
}
