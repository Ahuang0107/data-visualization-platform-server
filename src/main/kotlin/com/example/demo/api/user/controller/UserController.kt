package com.example.demo.api.user.controller

import com.example.demo.api.user.facade.UserFacade
import com.example.demo.base.property.SystemConst
import com.example.demo.module.user.entity.User
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@CrossOrigin("http://localhost:4000")
@RequestMapping(SystemConst.API_PREFIX + "/user")
class UserController(
    private val facade: UserFacade,
) {
    /**
     * 查找所有用户信息
     */
    @GetMapping("/list")
    fun listUser(): Flux<User> {
        return facade.list()
    }

    /**
     * 注册
     */
    @PutMapping
    fun register(@RequestBody user: User): Mono<User>? {
        return facade.register(user)
    }
}