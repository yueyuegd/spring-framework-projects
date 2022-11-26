package com.linkedbear.spring.event.b_registerevent;

import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(0)
public class MessageSenderListener implements ApplicationListener<RegisterSuccessEvent> {
    @Override
    public void onApplicationEvent(RegisterSuccessEvent event) {
        System.out.println("监听到用户注册成功，发送站内信。。。");
    }
}
