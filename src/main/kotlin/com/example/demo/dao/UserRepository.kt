package com.example.demo.dao

import com.example.demo.entity.User
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface UserRepository: ReactiveMongoRepository<User, String> {
}