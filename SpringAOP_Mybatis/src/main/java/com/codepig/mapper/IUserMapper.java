package com.codepig.mapper;

import com.codepig.dao.User;

import java.util.List;

public interface IUserMapper {
    List<User> findAll();
}
