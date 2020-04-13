package com.codepig.spy;

import com.codepig.spy.model.Account;
import com.codepig.spy.service.AccountService;
import config.SpringConfiguration;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;
import java.util.List;

public class AccountServiceTest2 {

    @Test
    public void testFindAll() {
        //获取容器
        //ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        //获取bean对象
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        //3.执行方法
        List<Account> allAccount = accountService.findAllAccount();
        for (Account account : allAccount) {
            System.out.println(account);
        }
        applicationContext.close();
    }
    @Test
    public void testFindOne() {
        //获取容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        //获取bean对象
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        //3.执行方法
        Account account1 = accountService.findAccountById(1);
        System.out.println(account1);
        applicationContext.close();
    }
    @Test
    public void testSave() {
        //获取容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        //获取bean对象
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        //3.执行方法
        Account account = new Account();
        account.setMoney(1231223f);
        account.setName("wangwei");
        accountService.saveAccount(account);
        List<Account> allAccount = accountService.findAllAccount();
        for (Account account1 : allAccount) {
            System.out.println(account1);
        }
        applicationContext.close();
    }
    @Test
    public void testUpdate() {
        //获取容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        //获取bean对象
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        //3.执行方法
        Account account1 = accountService.findAccountById(1);
        System.out.println(account1);
        applicationContext.close();
    }
    @Test
    public void testDelete() {
        //获取容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        //获取bean对象
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        //3.执行方法
        Account account1 = accountService.findAccountById(1);
        System.out.println(account1);
        applicationContext.close();
    }
}
