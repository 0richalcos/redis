package com.orichalcos.service;

import com.orichalcos.entity.Role;

import java.util.List;

/**
 * @author Orichalcos
 */
public interface RoleService {
    List<Role> findAll();

    void updateRole();
}
