package com.codepig.spy.service;

public interface IMarryService {

    /**
     * 转账
     * @param sourceName
     * @param targetName
     * @param money
     */
    void transfer(String sourceName, String targetName, Float money);
}
