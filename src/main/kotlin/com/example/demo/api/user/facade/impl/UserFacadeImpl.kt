package com.example.demo.api.user.facade.impl

import com.example.demo.api.user.facade.UserFacade
import com.example.demo.base.util.generatorId
import com.example.demo.module.user.entity.User
import com.example.demo.module.user.exception.UserExistedException
import com.example.demo.module.user.service.UserService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class UserFacadeImpl(
    private val userService: UserService,
) : UserFacade {
    override fun create(user: User): User {
        userService.findByUsername(user.username)?.also {
            throw UserExistedException("该用户名已被注册")
        }
        return user.let {
            it.id = generatorId()
            userService.save(it)
        }
    }
}