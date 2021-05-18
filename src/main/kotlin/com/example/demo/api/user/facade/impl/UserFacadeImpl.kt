package com.example.demo.api.user.facade.impl

import com.example.demo.api.user.facade.UserFacade
import com.example.demo.module.user.entity.User
import com.example.demo.module.user.service.UserService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class UserFacadeImpl(
    private val userService: UserService,
) : UserFacade {
    override fun create(user: User): User {
        return userService.save(user)
    }
}