package com.linkedbear.spring.event.b_registerevent;

import com.linkedbear.spring.event.b_registerevent.RegisterSuccessEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

@Service
public class RegisterService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    public void register(String username) {
        System.out.println(username + "注册成功。。。");
        applicationEventPublisher.publishEvent(new RegisterSuccessEvent(username));
    }
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
