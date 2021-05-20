package com.example.demo.module.user.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.io.Serializable

@Document(collection = "user")
data class UserEntity(
    @Id
    var id: String = "",
    var username: String = "",
    var password: String = "",
) : Serializable