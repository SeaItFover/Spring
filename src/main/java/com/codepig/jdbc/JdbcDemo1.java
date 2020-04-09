package com.codepig.jdbc;

import java.sql.*;

/**
 * 程序的耦合
 *         耦合：程序间的依赖关系
 *              包括：类之间的依赖和方法间的依赖
 *         解耦：降低程序间的依赖关系
 *
 */
public class JdbcDemo1 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //1.注册驱动
        //DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());//强依赖，在编译期就已经依赖了该类
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2.获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/springlearn?serverTimezone=UTC", "root", "123456");
        //3.获取操作数据库的预处理对象
        PreparedStatement preparedStatement = connection.prepareStatement("select * from account");
        //4.执行sql语句，得到结果集
        ResultSet resultSet = preparedStatement.executeQuery();
        //5.遍历结果集
        while (resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }
        //6.释放资源
        resultSet.close();
        preparedStatement.close();
        connection.close();

    }
}
