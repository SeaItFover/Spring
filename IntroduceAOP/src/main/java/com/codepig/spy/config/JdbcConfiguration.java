package com.codepig.spy.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
public class JdbcConfiguration {

    @Bean
    public QueryRunner getRunner(DataSource dataSource){
        return new QueryRunner(dataSource);
    }

    @Bean
    public DataSource getSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/springlearn?serverTimezone=UTC");
        dataSource.setUser("root");
        dataSource.setPassword("123456");
        return dataSource;
    }
}
