package com.linkedbear.spring.postprocessor.d_factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class Hen implements FactoryBean<Egg> {
    @Override
    public Egg getObject() throws Exception {
        return new Egg();
    }

    @Override
    public Class<?> getObjectType() {
        return Egg.class;
    }
}
