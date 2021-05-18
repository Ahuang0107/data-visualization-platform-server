package com.example.demo.module.user.repository

import com.example.demo.module.user.entity.User
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : MongoRepository<User, String> {
    fun findByUsername(username: String): User?
}