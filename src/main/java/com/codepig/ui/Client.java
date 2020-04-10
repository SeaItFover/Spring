package com.codepig.ui;

import com.codepig.factory.BeanFactory;
import com.codepig.service.AccountService;
import com.codepig.service.AccountServiceImpl;

/**
 * 模拟一个表现层，用于调用业务层（实际开发中，此处应该是servlet或者Controller）
 */
public class Client {

    public static void main(String[] args) {
        //AccountService accountService = new AccountServiceImpl();
        for (int i = 0; i < 5; i++){

            AccountService accountService = (AccountService)BeanFactory.getBean("accountService");
            System.out.println(accountService);
        }
        //accountService.saveAccount();
    }
}
