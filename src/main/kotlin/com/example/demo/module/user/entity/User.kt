package com.example.demo.module.user.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class User(
    @Id
    var id: Long? = 0L,
    var username: String? = null,
    var password: String? = null,
)