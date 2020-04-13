package com.codepig.spy.mapper;

/**
 * 账户的持久层实现类
 */
public class AccountMapperImpl implements AccountMapper{

    public void saveAccount() {
        System.out.println("保存了账户");
    }
}
