package com.codepig.utils;

import java.sql.SQLException;

/**
 * 和事务管理相关的工具类，它包含了开启事务，提交事务，回滚事务和释放连接。
 */
public class TransactionManager {

    private ConnectionUtils connectionUtils;

    public void beginTransaction() {
        try {
            connectionUtils.getConnection().setAutoCommit(false);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void commit() {
        try {
            connectionUtils.getConnection().commit();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void rollback() {
        try {
            connectionUtils.getConnection().rollback();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void release() {
        try {
            connectionUtils.getConnection().close();
            connectionUtils.remove();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
