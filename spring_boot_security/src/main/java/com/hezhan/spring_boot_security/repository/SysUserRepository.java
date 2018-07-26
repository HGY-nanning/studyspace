package com.hezhan.spring_boot_security.repository;

import com.hezhan.spring_boot_security.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 数据访问接口
 * Create by 何光义 on 2018/07/25 12:20
 */
public interface SysUserRepository extends JpaRepository<SysUser, Long> {

    /**
     * 根据用户名查找用户
     * @param username 用户名
     * @return 用户信息
     */
    SysUser findByUsername(String username);
}
