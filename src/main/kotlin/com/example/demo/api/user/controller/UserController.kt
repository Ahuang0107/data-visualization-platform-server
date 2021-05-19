package com.example.demo.api.user.controller

import com.example.demo.api.user.dto.LoginRequest
import com.example.demo.api.user.facade.UserFacade
import com.example.demo.base.dto.AppResponse
import com.example.demo.base.property.SystemConst
import com.example.demo.base.util.successResult
import com.example.demo.module.user.entity.User
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin("http://localhost:4000")
@RequestMapping(SystemConst.API_PREFIX + "/user")
class UserController(
    private val facade: UserFacade,
) {
    /**
     * 注册
     */
    @PutMapping
    fun register(@RequestBody user: User): AppResponse<Long> {
        return facade.create(user).successResult()
    }

    /**
     * 登录
     */
    @PostMapping("/login")
    fun login(@RequestBody request: LoginRequest): AppResponse<Long> {
        return facade.login(request).successResult()
    }
}