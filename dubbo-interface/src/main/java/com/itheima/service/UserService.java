package com.itheima.service;

import com.itheima.pojo.User;

public interface UserService {


    public String sayHello();

    /**
     * 查询用户
     * test
     * test2
     */
    public User findUserById(int id);
}
