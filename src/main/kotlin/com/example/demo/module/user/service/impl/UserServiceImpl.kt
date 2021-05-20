package com.example.demo.module.user.service.impl

import com.example.demo.module.user.entity.UserEntity
import com.example.demo.module.user.repository.UserRepository
import com.example.demo.module.user.service.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(
    private val repository: UserRepository,
) : UserService {
    override fun save(user: UserEntity): UserEntity {
        return repository.save(user)
    }

    override fun findByUsername(username: String): UserEntity? {
        return repository.findByUsername(username)
    }
}