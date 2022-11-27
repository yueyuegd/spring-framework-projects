package com.linkedbear.spring.configuration.c_conditional.config;

import com.linkedbear.spring.configuration.c_conditional.anno.ConditionalOnBean;
import com.linkedbear.spring.configuration.c_conditional.component.Bar;
import com.linkedbear.spring.configuration.c_conditional.ExistBossCondition;
import com.linkedbear.spring.configuration.c_conditional.component.Boss;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfiguration {

    @Bean
    //@Conditional(ExistBossCondition.class)
    @ConditionalOnBean(Boss.class)
    public Bar bbbar() {
        return new Bar();
    }
}
