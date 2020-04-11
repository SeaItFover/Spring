package com.codepig.ui;

import com.codepig.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnocationClient {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annocationBean.xml");
        AccountService accountService = (AccountService)applicationContext.getBean("accountServiceImpl");
        accountService.saveAccount();
    }
}
