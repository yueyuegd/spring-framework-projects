package com.linkedbear.spring.basic_di.d_complexfield;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.linkedbear.spring.basic_di.d_complexfield")
public class InjectComplexFieldConfiguration {

    @Bean
    @Autowired // 高版本可不标注
    public Dog dog(Person person) {
        Dog dog = new Dog();
        dog.setName("dog");
        dog.setPerson(person);
        return dog;
    }
}
