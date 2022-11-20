package com.linkedbear.spring.lifecycle.d_prototype;

import com.linkedbear.spring.lifecycle.d_prototype.bean.Pen;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrototypeLifecycleApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                PrototypeLifecycleConfiguration.class);
        System.out.println("准备获取一个Pen。。。");
        Pen pen = applicationContext.getBean(Pen.class);
        System.out.println("已经取到了Pen。。。");
        System.out.println("IOC容器初始化完成。。。");
        System.out.println("用完Pen了，准备销毁。。。");
        //applicationContext.getBeanFactory().destroyBean(pen);
        applicationContext.close();
        System.out.println("Pen销毁完成。。。");
    }
}
