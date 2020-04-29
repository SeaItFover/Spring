package com.codepig.utils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionUtils {

    private ThreadLocal<Connection> tl = new ThreadLocal<>();

    private DataSource dataSource;

    public Connection getConnection() {
        Connection conn = tl.get();
        if (conn == null) {
            try {
                conn = dataSource.getConnection();
                tl.set(conn);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return conn;
    }

    public void remove() {
        tl.remove();
    }
}
