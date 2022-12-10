package com.linkedbear.spring.configuration.e_enablejdbc.config;

import com.linkedbear.spring.configuration.e_enablejdbc.JdbcConfigSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(JdbcConfigSelector.class)
public @interface EnableJdbc {
}
