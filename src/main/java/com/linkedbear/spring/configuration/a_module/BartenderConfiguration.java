package com.linkedbear.spring.configuration.a_module;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BartenderConfiguration {

    @Bean
    public Bartender zhangxiaosan() {
        return new Bartender("张小三");
    }

    @Bean
    public Bartender zhangdasan() {
        return new Bartender("张大三");
    }
}
