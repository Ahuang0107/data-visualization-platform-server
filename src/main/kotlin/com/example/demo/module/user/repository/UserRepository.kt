package com.example.demo.module.user.repository

import com.example.demo.module.user.entity.UserEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : MongoRepository<UserEntity, String> {
    fun findByUsername(username: String): UserEntity?
}