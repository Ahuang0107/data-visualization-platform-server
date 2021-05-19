package com.example.demo.api.user.facade

import com.example.demo.api.user.dto.LoginRequest
import com.example.demo.module.user.entity.User

interface UserFacade {
    fun create(user: User): String
    fun login(request: LoginRequest): String
}