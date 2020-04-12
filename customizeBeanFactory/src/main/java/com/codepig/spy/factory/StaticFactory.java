package com.codepig.spy.factory;

import com.codepig.spy.service.AccountService;
import com.codepig.spy.service.AccountServiceImpl;

public class StaticFactory {

    public static AccountService getAccountService() {
        return new AccountServiceImpl();
    }
}
