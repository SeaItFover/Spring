package com.codepig.spy.service;

import com.codepig.spy.dao.Marry;
import com.codepig.spy.mapper.MarryMapper;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("marryService")
@Data
public class MarryServiceImpl implements IMarryService{

    @Autowired
    private MarryMapper marryMapper;

    @Override
    public void transfer(String sourceName, String targetName, Float money) {

        //根据名称查询转出账户
        Marry source = marryMapper.findMarryByName(sourceName);
        //根据名称查询转入账户
        Marry target = marryMapper.findMarryByName(targetName);
        //转出账户减钱
        source.setMoney(source.getMoney()-money);
        //转入账户加钱
        target.setMoney(target.getMoney()+money);
        //更新转出账户
        marryMapper.Update(source);

       // int i = 1 / 0;

        //更新转入账户
        marryMapper.Update(target);
    }
}
