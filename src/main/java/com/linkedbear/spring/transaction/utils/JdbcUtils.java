package com.linkedbear.spring.transaction.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils {

    public static final String JDBC_URL = "jdbc:mysql://localhost:3306/mysqltest?characterEncoding=utf8";
    private static ThreadLocal<Connection> connectionThreadLocal = new ThreadLocal<>();

    public static Connection getConnection() {
        // ThreadLocal中有，直接取出返回
        if (connectionThreadLocal.get() != null) {
            return connectionThreadLocal.get();
        }
        return openConnection();
    }

    private static Connection openConnection() {
        // 没有，则创建新的，并放入ThreadLocal中
        Connection connection;
        try {
            connection = DriverManager.getConnection(JDBC_URL, "root", "950425zy");
            connectionThreadLocal.set(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public static void remove() {
        connectionThreadLocal.remove();
    }

}
