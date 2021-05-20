package com.example.demo.api.canvas.dto

import com.example.demo.module.common.dto.CanvasProperty
import com.example.demo.module.common.dto.Element

data class CreateCanvasRequest(
    var userId: String? = null,
    var property: CanvasProperty? = null,
    var elements: List<Element>? = emptyList(),
)
