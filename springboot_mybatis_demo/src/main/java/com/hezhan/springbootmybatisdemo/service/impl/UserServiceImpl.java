package com.hezhan.springbootmybatisdemo.service.impl;

import com.github.pagehelper.PageHelper;
import com.hezhan.springbootmybatisdemo.mapper.UserMapper;
import com.hezhan.springbootmybatisdemo.model.User;
import com.hezhan.springbootmybatisdemo.service.UserService;
import com.sun.org.apache.bcel.internal.classfile.Unknown;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create by 何光义 on 2018/7/5 0005
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.insertSelective(user);
    }

    /*
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    @Override
    public List<User> findAllUser(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum,pageSize);
        return userMapper.selectAllUser();
    }
}
