package com.linkedbear.spring.event.b_registerevent;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmailSenderListener {

    @EventListener
    public void onRegisterSuccess(RegisterSuccessEvent registerSuccessEvent) {
        System.out.println("监听到用户注册成功！发送邮件中。。");
    }
}
