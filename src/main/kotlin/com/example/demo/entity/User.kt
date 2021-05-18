package com.example.demo.entity

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class User {
    @Id
    var id: String? = null
    var username: String = ""
    var password: String = ""

    override fun toString(): String {
        return ObjectMapper().writeValueAsString(this)
    }
}