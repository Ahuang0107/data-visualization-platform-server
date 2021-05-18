package com.example.demo.api.user.facade.impl

import com.example.demo.api.user.facade.UserFacade
import com.example.demo.module.user.entity.User
import com.example.demo.module.user.service.UserService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
@Transactional
class UserFacadeImpl(
    private val userService: UserService,
) : UserFacade {
    override fun find(id: String): Mono<User>? {
        return userService.find(id)
    }

    override fun list(): Flux<User> {
        return userService.list()
    }

    override fun login(user: User): Mono<User>? {
        return userService.login(user)
    }

    override fun register(user: User): Mono<User>? {
        return userService.register(user)
    }

    override fun create(user: User): Mono<User> {
        return userService.create(user)
    }

    override fun delete(id: String): Mono<Void> {
        return userService.delete(id)
    }

}