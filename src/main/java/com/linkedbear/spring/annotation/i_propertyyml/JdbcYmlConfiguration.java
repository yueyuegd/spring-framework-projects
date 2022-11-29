package com.linkedbear.spring.annotation.i_propertyyml;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.linkedbear.spring.annotation.i_propertyyml")
@PropertySource(value = "classpath:propertyyml/jdbc.yml", factory = YmlPropertySourceFactory.class)
public class JdbcYmlConfiguration {
}
