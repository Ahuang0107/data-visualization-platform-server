package com.example.demo.module.canvas.entity

import com.example.demo.module.common.dto.CanvasProperty
import com.example.demo.module.common.dto.Element
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.io.Serializable

@Document
data class CanvasEntity(
    @Id
    var id: String = "",
    var userId: String? = null,
    var property: CanvasProperty? = null,
    var elements: List<Element>? = emptyList(),
) : Serializable