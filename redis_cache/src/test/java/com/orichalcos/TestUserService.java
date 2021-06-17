package com.orichalcos;

import com.orichalcos.service.RoleService;
import com.orichalcos.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestUserService {
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;

    @Test
    public void test() {
        userService.findAll().forEach(u -> System.out.println("u = " + u));
        System.out.println("=================================================");

        roleService.updateRole();
        userService.findAll().forEach(u -> System.out.println("u = " + u));
    }
}
