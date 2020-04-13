package com.codepig.spy.ui;

import com.codepig.spy.factory.BeanFactory;
import com.codepig.spy.service.AccountService;

/**
 * 模拟一个表现层，用于调用业务层（实际开发中，此处应该是servlet或者Controller）
 */
public class Client {

    public static void main(String[] args) {

        // 1.0 AccountService accountService = new AccountServiceImpl();  //最早的new

        for (int i = 0; i < 5; i++){
            AccountService accountService = (AccountService) BeanFactory.getBean("accountService");
            System.out.println(accountService);
        }

        //accountService.saveAccount();
    }
}
