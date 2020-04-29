package com.codepig.spy.mapper;

import com.codepig.spy.dao.Marry;

public interface IMarryMapper {

    /**
     * 根据名称查询账户：如果有唯一的结果 就返回，如果没有结果就返回null
     * @param marryName
     * @return
     */
    Marry findMarryByName(String marryName);

    void Update(Marry marry);
}
