package com.example.demo.module.canvas.entity

import com.example.demo.module.common.dto.CanvasProperty
import com.example.demo.module.common.dto.Element
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Canvas {
    @Id
    var id: String? = null
    var userId: String? = null
    var property: CanvasProperty? = null
    var elements: List<Element>? = emptyList()

    override fun toString(): String {
        return ObjectMapper().writeValueAsString(this)
    }
}