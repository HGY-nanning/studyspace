package com.hezhan.springboot_thymeleaf.web;

import com.hezhan.springboot_thymeleaf.entity.User;
import com.hezhan.springboot_thymeleaf.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create by 何光义 on 2018/07/24 15:15
 */
@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/studentOneUser")
    public Map<String,Object> studentOneUser(){
        Map<String,Object> model = new HashMap<>();
        User user = userService.findOneUser();
        model.put("user",user);
        return model;
    }

    @RequestMapping("/studentAllUser")
    public Map<String,Object> studentAllUser(){
        Map<String,Object> model = new HashMap<>();
        List<User> user = userService.findAllUsers();
        model.put("users",user);
        return model;
    }


}
