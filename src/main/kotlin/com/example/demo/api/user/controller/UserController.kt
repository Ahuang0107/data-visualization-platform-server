package com.example.demo.api.user.controller

import com.example.demo.api.user.dto.LoginRequest
import com.example.demo.api.user.facade.UserFacade
import com.example.demo.base.dto.AppResponse
import com.example.demo.base.property.SystemConst
import com.example.demo.base.util.successResult
import com.example.demo.module.user.entity.UserEntity
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping(SystemConst.API_PREFIX + "/user")
class UserController(
    private val facade: UserFacade,
) {
    /**
     * 注册
     */
    @PutMapping
    fun register(@RequestBody user: UserEntity): AppResponse<String> {
        return facade.create(user).successResult()
    }

    /**
     * 登录
     */
    @PostMapping("/login")
    fun login(@RequestBody request: LoginRequest): AppResponse<String> {
        return facade.login(request).successResult()
    }
}