package com.linkedbear.spring.lifecycle.d_prototype;

import com.linkedbear.spring.lifecycle.d_prototype.bean.Pen;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

@Configuration
public class PrototypeLifecycleConfiguration {

    @Bean(initMethod = "open", destroyMethod = "close")
    @Scope(SCOPE_PROTOTYPE)
    public Pen pen() {
        return new Pen();
    }
}
