package com.codepig.spy.jdbc;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class mybatis {
    public static void main(String[] args) throws IOException {
        InputStream in = Resources.getResourceAsStream("xx.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = factory.openSession();
        //UserMapper mapper = sqlSession.getMapper(UserMapper.class);


    }
}
