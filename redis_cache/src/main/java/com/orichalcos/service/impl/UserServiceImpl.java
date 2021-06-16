package com.orichalcos.service.impl;

import com.orichalcos.mapper.UserMapper;
import com.orichalcos.entity.User;
import com.orichalcos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Orichalcos
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
