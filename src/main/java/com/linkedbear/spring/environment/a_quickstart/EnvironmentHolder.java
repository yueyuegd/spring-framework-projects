package com.linkedbear.spring.environment.a_quickstart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class EnvironmentHolder {

    @Autowired
    private Environment environment;

    public void printEnvironment() {
        System.out.println(this.environment);
    }
}
