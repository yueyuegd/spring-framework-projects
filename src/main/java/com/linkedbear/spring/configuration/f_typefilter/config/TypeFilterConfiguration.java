package com.linkedbear.spring.configuration.f_typefilter.config;

import com.linkedbear.spring.configuration.f_typefilter.anno.Animal;
import com.linkedbear.spring.configuration.f_typefilter.color.Color;
import com.linkedbear.spring.configuration.f_typefilter.GreenTypeFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "com.linkedbear.spring.configuration.f_typefilter",
excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Animal.class),
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = Color.class),
@ComponentScan.Filter(type = FilterType.CUSTOM, value = GreenTypeFilter.class)},
includeFilters = {@ComponentScan.Filter(type = FilterType.REGEX,
        pattern = "com.linkedbear.spring.configuration.f_typefilter.+Demo.+")})
public class TypeFilterConfiguration {
}
