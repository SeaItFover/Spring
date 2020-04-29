package com.codepig.spy.mapper;

import com.codepig.spy.dao.Marry;
import lombok.Data;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
@Data
public class MarryMapper implements IMarryMapper{

    @Autowired
    private QueryRunner runner;

    @Override
    public Marry findMarryByName(String marryName) {
        try{
            List<Marry> marries = runner.query("select * from marry where name = ?",new BeanListHandler<>(Marry.class),marryName);
            if (marries == null || marries.size() == 0){
                return null;
            }
            if (marries.size() > 1){
                throw new RuntimeException("结果集不唯一");
            }
            return marries.get(0);
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
    }

    @Override
    public void Update(Marry marry) {
        try {
            runner.update("update marry set money = ? where id = ?",marry.getMoney(),marry.getId());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
