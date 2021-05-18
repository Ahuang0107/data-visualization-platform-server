package com.example.demo.module.user.repository

import com.example.demo.module.user.entity.User
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface UserRepository : ReactiveMongoRepository<User, String> {
}