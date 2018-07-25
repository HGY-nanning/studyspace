package com.hezhan.myspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by 何光义 on 2018/7/5 0005 上午 11:02
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String helloWorld(){
        System.out.println("你好！");

        return "Hello World";
    }
}
