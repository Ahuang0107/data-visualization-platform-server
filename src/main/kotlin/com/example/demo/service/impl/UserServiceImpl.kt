package com.example.demo.service.impl

import com.example.demo.dao.UserRepository
import com.example.demo.entity.User
import com.example.demo.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class UserServiceImpl : UserService {
    @Autowired
    lateinit var userRepository: UserRepository

    override fun find(id: String): Mono<User>? {
        return userRepository.findById(id)
    }

    override fun list(): Flux<User> {
        return userRepository.findAll()
    }

    override fun login(user: User): Mono<User>? {
        return user.username?.let {
            user.password?.let { it1 ->
                userRepository.findByUsernameAndPassword(it, it1)
            }
        }
    }

    override fun register(user: User): Mono<User>? {
        userRepository.getByUsername(user.username)?.also {
            throw RuntimeException("用户名已存在")
        }
        return userRepository.save(user)
    }

    override fun create(user: User): Mono<User> {
        return userRepository.save(user)
    }

    override fun delete(id: String): Mono<Void> {
        return userRepository.deleteById(id)
    }
}