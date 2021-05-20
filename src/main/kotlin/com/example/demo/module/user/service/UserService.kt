package com.example.demo.module.user.service

import com.example.demo.module.user.entity.UserEntity

/**
 * 用户信息相关服务
 */
interface UserService {
    fun save(user: UserEntity): UserEntity
    fun findByUsername(username: String): UserEntity?
}