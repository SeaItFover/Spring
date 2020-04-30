package com.codepig.jdbctemplate;

import com.codepig.dao.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class JdbcTemplate02 {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        JdbcTemplate jdbcTemplate = ac.getBean("jdbcTemplate", JdbcTemplate.class);
        jdbcTemplate.execute("insert into account (name, money) values ('zhangsan', 2030)");
        jdbcTemplate.update("update account set name=?, money = ? where id = ?", "test", 1000, 3);
        List<Account> accounts = jdbcTemplate.query("select * from account where money > ?", new BeanPropertyRowMapper<Account>(Account.class), 1000);
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
