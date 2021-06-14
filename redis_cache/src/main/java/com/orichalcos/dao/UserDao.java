package com.orichalcos.dao;

import com.orichalcos.entity.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
}
