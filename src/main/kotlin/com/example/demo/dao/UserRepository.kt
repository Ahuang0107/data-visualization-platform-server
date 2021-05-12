package com.example.demo.dao

import com.example.demo.entity.User
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import reactor.core.publisher.Mono

interface UserRepository : ReactiveMongoRepository<User, String> {
    fun findByUsernameAndPassword(username: String, password: String): Mono<User>?
}