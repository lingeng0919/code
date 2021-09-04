package com.lch2.dubbo.service.impl;

import com.lch02.dubbo.model.User;
import com.lch02.dubbo.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUserName("lch");
        return user;
    }

    @Override
    public Integer queryAllUserCount() {
        return 10086;
    }
}
