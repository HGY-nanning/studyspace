package com.hezhan.spring_boot_security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * SpringMVC配置
 * Create by 何光义 on 2018/07/25 12:27
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport{

    public void addViewControllers(ViewControllerRegistry registry) {
        //当用户访问login时跳转到login.html页面
        registry.addViewController("/login").setViewName("login");
    }
}
