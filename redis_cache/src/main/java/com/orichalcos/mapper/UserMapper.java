package com.orichalcos.mapper;

import com.orichalcos.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Orichalcos
 */
@Mapper
public interface UserMapper {
    List<User> findAll();
}
