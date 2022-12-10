package com.linkedbear.spring.configuration.e_enablejdbc;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
@Conditional(OnClassNameConditional.class)
public @interface ConditionalOnClassName {

    String value();
}
