package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService {


    /**
     * 根据用户ID查询用户信息
     * @param userId 用户ID
     * @return 用户信息
     */
    User getUserByUserId(int userId);
}
