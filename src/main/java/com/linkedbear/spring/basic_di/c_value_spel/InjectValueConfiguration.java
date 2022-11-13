package com.linkedbear.spring.basic_di.c_value_spel;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.linkedbear.spring.basic_di.c_value_spel")
@PropertySource("classpath:basic_di/value/red.properties")
public class InjectValueConfiguration {
}
