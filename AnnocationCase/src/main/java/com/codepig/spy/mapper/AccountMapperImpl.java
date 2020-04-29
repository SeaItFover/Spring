package com.codepig.spy.mapper;

import com.codepig.spy.model.Account;
import lombok.Data;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Data
@Repository("accountMapper")
public class AccountMapperImpl implements AccountMapper{

    @Autowired
    private QueryRunner queryRunner;

    @Override
    public List<Account> findAllAccount() {
        try {
            return queryRunner.query("select * from account",new BeanListHandler<Account>(Account.class));
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
    }

    @Override
    public Account findAccountById(Integer accountId) {
        try {
            return queryRunner.query("select * from account where id = ?",new BeanHandler<>(Account.class),accountId);
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
    }

    @Override
    public void saveAccount(Account account) {
        try {
            queryRunner.update("insert into account(name,money) values(?,?)",account.getName(),account.getMoney());
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
    }

    @Override
    public void updateAccount(Account account) {
        try {
            queryRunner.update("update account set account = ?, money = ? where id = ?",account.getName(),account.getMoney(),account.getId());
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
    }

    @Override
    public void deleteAccount(Integer accountId) {
        try {
            queryRunner.update("delete from account where id = ?",accountId);
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
    }
}
