package com.example.demo.api.user.facade

import com.example.demo.api.user.dto.LoginRequest
import com.example.demo.module.user.entity.UserEntity

interface UserFacade {
    fun create(user: UserEntity): String
    fun login(request: LoginRequest): String
}