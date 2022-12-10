package com.linkedbear.spring.event.c_hierarchical;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HierarchicalEventApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext parentApplicationContext = new AnnotationConfigApplicationContext();
        parentApplicationContext.addApplicationListener(new HierarchicalEventListener());
        AnnotationConfigApplicationContext childApplicationContext = new AnnotationConfigApplicationContext();
        childApplicationContext.setParent(parentApplicationContext);
        childApplicationContext.addApplicationListener(new HierarchicalEventListener());
        parentApplicationContext.refresh();
        childApplicationContext.refresh();
        parentApplicationContext.publishEvent(new HierarchicalEvent("父容器发布的HierarchicalEvent"));
        childApplicationContext.publishEvent(new HierarchicalEvent("子容器发布的HierarchicalEvent"));
    }
}
