package com.codepig.spy.factory;

import com.codepig.spy.service.AccountService;
import com.codepig.spy.service.AccountServiceImpl;

public class FactoryInstance {

    public AccountService getAccountService() {
        return new AccountServiceImpl();
    }
}
