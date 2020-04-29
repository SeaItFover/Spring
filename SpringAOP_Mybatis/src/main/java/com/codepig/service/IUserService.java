package com.codepig.service;

import com.codepig.dao.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();
}
