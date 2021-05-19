package com.example.demo.module.user.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class User(
    @Id
    var id: String = "",
    var username: String = "",
    var password: String = "",
)