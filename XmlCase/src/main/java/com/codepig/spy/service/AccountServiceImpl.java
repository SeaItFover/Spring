package com.codepig.spy.service;

import com.codepig.spy.mapper.AccountMapper;
import com.codepig.spy.model.Account;
import lombok.Data;

import java.util.List;

@Data
public class AccountServiceImpl implements AccountService{

    private AccountMapper accountMapper;

    @Override
    public List<Account> findAllAccount() {
        return accountMapper.findAllAccount();
    }

    @Override
    public Account findAccountById(Integer accountId) {
        return accountMapper.findAccountById(accountId);
    }

    @Override
    public void saveAccount(Account account) {
        accountMapper.saveAccount(account);
    }

    @Override
    public void updateAccount(Account account) {
        accountMapper.updateAccount(account);
    }

    @Override
    public void deleteAccount(Integer accountId) {
        accountMapper.deleteAccount(accountId);
    }
}
