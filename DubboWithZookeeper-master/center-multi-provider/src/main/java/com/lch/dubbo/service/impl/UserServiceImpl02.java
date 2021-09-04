package com.lch.dubbo.service.impl;

import com.lch.dubbo.model.User;
import com.lch.dubbo.service.UserService;

public class UserServiceImpl02  implements UserService {
    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUserName("lch version:02");
        return user;
    }

    @Override
    public Integer queryAllUserCount() {
        return 100;
    }
}
