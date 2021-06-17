package com.orichalcos.mapper;

import com.orichalcos.entity.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Orichalcos
 */
@Mapper
public interface RoleMapper {
    List<Role> findAll();

    void updateRole();
}
