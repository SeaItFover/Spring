package com.codepig.spy.service;

import org.springframework.beans.factory.BeanFactory;

/**
 * 账户业务层的接口
 */
public interface AccountService {

    /**
     * 模拟保存账户（并不是为了操作数据库）
     */
    void saveAccount();

}
