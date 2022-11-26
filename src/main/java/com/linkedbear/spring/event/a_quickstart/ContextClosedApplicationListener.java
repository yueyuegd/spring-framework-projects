package com.linkedbear.spring.event.a_quickstart;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ContextClosedApplicationListener {
    @EventListener
    public void onContextClosedEvent(ContextClosedEvent contextClosedEvent) {
        System.out.println("ContextClosedApplicationListener监听到ContextClosedEvent事件！");
    }
}
