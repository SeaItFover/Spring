package com.codepig.mapper;

import com.codepig.dao.Account;

public interface IAccountMapper {

    Account findAccountById(Integer accountId);

    Account findAccountByName(String accountName);

    void updateAccount(Account account);
}
