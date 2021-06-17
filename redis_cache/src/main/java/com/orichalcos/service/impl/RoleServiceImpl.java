package com.orichalcos.service.impl;

import com.orichalcos.entity.Role;
import com.orichalcos.mapper.RoleMapper;
import com.orichalcos.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Orichalcos
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> findAll() {
        return roleMapper.findAll();
    }

    @Override
    public void updateRole() {
        roleMapper.updateRole();
    }
}
