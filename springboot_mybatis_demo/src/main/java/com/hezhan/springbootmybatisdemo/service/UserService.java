package com.hezhan.springbootmybatisdemo.service;

import com.hezhan.springbootmybatisdemo.model.User;

import java.util.List;

/**
 * Create by 何光义 on 2018/7/5 0005 下午 3:10
 */
public interface UserService {
    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}
