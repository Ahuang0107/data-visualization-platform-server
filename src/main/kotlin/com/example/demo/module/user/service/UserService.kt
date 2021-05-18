package com.example.demo.module.user.service

import com.example.demo.module.user.entity.User

/**
 * 用户信息相关服务
 */
interface UserService {
    fun save(user: User): User
}