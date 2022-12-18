package com.linkedbear.spring.transaction.aspect;

import com.linkedbear.spring.transaction.utils.JdbcUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.sql.Connection;

@Component
@Aspect
public class TransactionAspect {

    @Around("@annotation(com.linkedbear.spring.transaction.aspect.Transactional)")
    public Object doWithTransaction(ProceedingJoinPoint joinPoint) throws Throwable {
        Connection connection = JdbcUtils.getConnection();
        // 开启事务
        connection.setAutoCommit(false);
        try {
            Object ret = joinPoint.proceed();
            // 方法执行成功，提交事务
            connection.commit();
            return ret;
        } catch (Throwable throwable) {
            // 方法出现异常，回滚事务
            connection.rollback();
            throw throwable;
        } finally {
            // 最后关闭连接，释放资源
            JdbcUtils.remove();
        }
    }
}
