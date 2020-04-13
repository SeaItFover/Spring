package com.codepig.spy.mapper;

import com.codepig.spy.model.Account;

import java.util.List;

public interface AccountMapper {
    List<Account> findAllAccount();

    Account findAccountById(Integer accountId);

    void saveAccount(Account account);

    void updateAccount(Account account);

    void deleteAccount(Integer accountId);
}
