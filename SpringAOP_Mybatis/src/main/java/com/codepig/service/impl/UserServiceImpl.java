package com.codepig.service.impl;

import com.codepig.dao.User;
import com.codepig.mapper.IUserMapper;
import com.codepig.service.IUserService;
import lombok.Data;

import java.util.List;

@Data
public class UserServiceImpl implements IUserService {

    private IUserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
