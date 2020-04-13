package com.codepig.spy.service;

import com.codepig.spy.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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

    //自定义的bean工厂
    //private AccountMapper accountMapper = (AccountMapper)BeanFactory.getBean("accountMapper");

    private AccountMapper accountMapper;

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
