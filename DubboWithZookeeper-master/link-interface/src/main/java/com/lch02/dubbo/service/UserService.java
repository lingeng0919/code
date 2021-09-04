package com.lch02.dubbo.service;

import com.lch02.dubbo.model.User;

public interface UserService {
    User queryUserById(Integer id);

    Integer queryAllUserCount();
}
