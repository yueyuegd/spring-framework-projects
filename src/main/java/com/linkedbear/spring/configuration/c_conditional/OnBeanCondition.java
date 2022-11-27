package com.linkedbear.spring.configuration.c_conditional;

import com.linkedbear.spring.configuration.c_conditional.anno.ConditionalOnBean;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class OnBeanCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> map =  metadata.getAnnotationAttributes(ConditionalOnBean.class.getName());
        // 匹配类型
        Class<?>[] value = (Class<?>[]) map.get("value");
        for(Class<?> c : value) {
            if (!context.getBeanFactory().containsBeanDefinition(c.getName())) {
                return false;
            }
        }
        // 匹配beanName
        // 先获取目标自定义注解ConditionalOnBean上的beanNames属性
        String[] beanNames = (String[]) metadata.getAnnotationAttributes(ConditionalOnBean.class.getName()).get("beanNames");
        // 逐个校验IOC容器中是否包含传入的bean名称
        for (String beanName : beanNames) {
            if (!context.getBeanFactory().containsBeanDefinition(beanName)) {
                return false;
            }
        }
        return true;
    }
}
