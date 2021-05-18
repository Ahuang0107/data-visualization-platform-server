package com.example.demo.module.user.service.impl

import com.example.demo.module.user.entity.User
import com.example.demo.module.user.repository.UserRepository
import com.example.demo.module.user.service.UserService
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class UserServiceImpl(
    private val repository: UserRepository,
) : UserService {
    override fun find(id: String): Mono<User>? {
        return repository.findById(id)
    }

    override fun list(): Flux<User> {
        return repository.findAll()
    }

    override fun login(user: User): Mono<User>? {
        return user.username?.let {
            user.password?.let { it1 ->
                repository.findByUsernameAndPassword(it, it1)
            }
        }
    }

    override fun register(user: User): Mono<User>? {
        return repository.save(user)
    }

    override fun create(user: User): Mono<User> {
        return repository.save(user)
    }

    override fun delete(id: String): Mono<Void> {
        return repository.deleteById(id)
    }
}