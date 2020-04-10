package com.codepig.factory;

import com.codepig.service.AccountService;
import com.codepig.service.AccountServiceImpl;

public class FactoryInstance {

    public AccountService getAccountService() {
        return new AccountServiceImpl();
    }
}
