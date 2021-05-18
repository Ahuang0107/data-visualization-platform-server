package com.example.demo.module.user.service.impl

import com.example.demo.module.user.entity.User
import com.example.demo.module.user.repository.UserRepository
import com.example.demo.module.user.service.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(
    private val repository: UserRepository,
) : UserService {
    override fun save(user: User): User {
        return repository.save(user)
    }

    override fun findByUsername(username: String): User? {
        return repository.findByUsername(username)
    }
}