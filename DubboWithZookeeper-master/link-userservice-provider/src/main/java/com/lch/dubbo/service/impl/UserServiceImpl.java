package com.lch.dubbo.service.impl;

import com.lch.dubbo.model.User;
import com.lch.dubbo.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(1001);
        user.setAge(23);
        user.setUsername("zs");
        return user;
    }
}
