package com.orichalcos;

import com.orichalcos.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestUserService {
    @Autowired
    private UserService userService;

    @Test
    public void test() {
        userService.findAll().forEach(u -> System.out.println("u = " + u));

        System.out.println("=================================================");

        userService.findAll().forEach(u -> System.out.println("u = " + u));
    }
}
