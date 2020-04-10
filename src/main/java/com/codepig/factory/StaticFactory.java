package com.codepig.factory;

import com.codepig.service.AccountService;
import com.codepig.service.AccountServiceImpl;

public class StaticFactory {

    public static AccountService getAccountService() {
        return new AccountServiceImpl();
    }
}
