package com.example.demo.api.user.controller

import com.example.demo.module.user.entity.User
import com.example.demo.module.user.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@CrossOrigin("http://localhost:4000")
@RequestMapping("/api/user")
class UserController {
    @Autowired
    lateinit var userService: UserService

    /**
     * 保存或新增用户信息
     */
    @PostMapping("/")
    fun create(@RequestBody user: User): Mono<User> {
        return userService.create(user)
    }

    /**
     * 更新用户信息
     */
    @PutMapping("/")
    fun update(@RequestBody user: User): Mono<User> {
        return userService.create(user)
    }

    /**
     * 查找所有用户信息
     */
    @GetMapping("/list")
    fun listUser(): Flux<User> {
        return userService.list()
    }

    /**
     * 通过用户_id查找用户信息
     */
    @GetMapping("/id")
    fun user(@RequestParam id: String): Mono<User>? {
        return userService.find(id)
    }

    /**
     * 登录
     */
    @PostMapping
    fun login(@RequestBody user: User): Mono<User>? {
        return userService.login(user)
    }
    /**
     * 注册
     */
    @PutMapping
    fun register(@RequestBody user: User): Mono<User>? {
        return userService.register(user)
    }

    /**
     * 通过用户_id删除用户信息
     */
    @DeleteMapping("/")
    fun delete(@RequestParam id: String): Mono<Void> {
        return userService.delete(id)
    }
}