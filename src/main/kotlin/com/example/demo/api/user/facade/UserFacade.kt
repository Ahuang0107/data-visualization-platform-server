package com.example.demo.api.user.facade

import com.example.demo.module.user.entity.User

interface UserFacade {
    fun create(user: User): User
}