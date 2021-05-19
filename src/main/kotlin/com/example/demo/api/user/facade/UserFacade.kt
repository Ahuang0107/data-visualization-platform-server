package com.example.demo.api.user.facade

import com.example.demo.api.user.dto.LoginRequest
import com.example.demo.module.user.entity.User

interface UserFacade {
    fun create(user: User): Long
    fun login(request: LoginRequest): Long
}