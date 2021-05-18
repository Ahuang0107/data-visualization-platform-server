package com.example.demo.api.user.facade

import com.example.demo.module.user.entity.User
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface UserFacade {
    /**
     * 通过用户_id获取用户信息
     */
    fun find(id: String): Mono<User>?

    /**
     * 查找所有用户信息
     */
    fun list(): Flux<User>

    /**
     * 登录
     */
    fun login(user: User): Mono<User>?

    /**
     * 注册
     */
    fun register(user: User): Mono<User>?

    /**
     * 创建一个用户信息
     */
    fun create(user: User): Mono<User>

    /**
     * 通过用户_id删除用户信息
     */
    fun delete(id: String): Mono<Void>
}