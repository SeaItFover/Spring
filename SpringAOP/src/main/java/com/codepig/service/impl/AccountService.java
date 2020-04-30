package com.codepig.service.impl;

import com.codepig.service.IAccountSerivce;

public class AccountService implements IAccountSerivce {

    @Override
    public void saveAccount() {
        System.out.println("operate save method");
    }

    @Override
    public void updateAccount(int i) {
        System.out.println("operate update method" + i);
    }

    @Override
    public int deleteAccount() {
        System.out.println("operate delete method");
        return 0;
    }
}
