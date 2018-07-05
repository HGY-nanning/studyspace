package com.hezhan.springbootmybatisdemo.controller;

import com.hezhan.springbootmybatisdemo.model.User;
import com.hezhan.springbootmybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by 何光义 on 2018/7/5 0005
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping("/add")
    public int addUser(User user){
        return userService.addUser(user);
    }

    @RequestMapping("/all")
    public Object findAllUser( @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                                           int pageNum,
                               @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                                           int pageSize){
        return userService.findAllUser(pageNum,pageSize);
    }

}
