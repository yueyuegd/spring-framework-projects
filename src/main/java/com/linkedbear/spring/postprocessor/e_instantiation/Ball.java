package com.linkedbear.spring.postprocessor.e_instantiation;

public class Ball {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "id='" + id + '\'' +
                '}';
    }
}
