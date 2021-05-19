package com.example.demo.api.user.facade.impl

import com.example.demo.api.user.dto.LoginRequest
import com.example.demo.api.user.exception.IncorrectLoginInfoException
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
    override fun create(user: User): Long {
        userService.findByUsername(user.username)?.also {
            throw UserExistedException("该用户名已被注册")
        }
        return user.let {
            it.id = generatorId()
            userService.save(it).id
        }
    }

    override fun login(request: LoginRequest): Long {
        //判断是否存在用户名
        val userEntity = userService.findByUsername(request.username)
            ?: throw IncorrectLoginInfoException()

        //判断用户名对应密码是否正确
        if (userEntity.password != request.password) {
            throw IncorrectLoginInfoException()
        }

        return userEntity.id
    }
}