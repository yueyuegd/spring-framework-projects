package com.linkedbear.spring.bean.c_instantiate;

import com.linkedbear.spring.bean.c_instantiate.bean.Car;

public class CarStaticFactory {

    public static Car getCar() {
        return new Car();
    }
}
