package com.codepig.service;

import com.codepig.factory.BeanFactory;
import com.codepig.mapper.AccountMapper;
import com.codepig.mapper.AccountMapperImpl;

import java.util.Date;

/**
 * 账户的业务层实现类
 *
 * 业务层操作持久层
 */


public class AccountServiceImpl implements AccountService{

    private String name;
    private Integer age;
    private Date birthday;

    //private AccountMapper accountMapper = new AccountMapperImpl(); 传统的强耦合
     private AccountMapper accountMapper = (AccountMapper)BeanFactory.getBean("accountMapper");

    @Override
    public void saveAccount() {
        accountMapper.saveAccount();
    }

    public void init() {
        System.out.println("对象初始化");
    }

    public void destory() {
        System.out.println("对象消亡");
    }
}
