package com.example.demo.module.user.entity

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class User {
    @Id
    var id: String? = null
    var username: String? = null
    var password: String? = null

    override fun toString(): String {
        return ObjectMapper().writeValueAsString(this)
    }
}