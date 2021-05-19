package com.example.demo.api.canvas.facade

import com.example.demo.api.canvas.dto.CreateRequest
import com.example.demo.module.canvas.entity.Canvas

interface CanvasFacade {
    fun create(request: CreateRequest): Canvas
}