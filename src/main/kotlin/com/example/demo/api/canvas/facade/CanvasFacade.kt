package com.example.demo.api.canvas.facade

import com.example.demo.api.canvas.dto.CanvasCreateRequest
import com.example.demo.api.canvas.dto.CanvasInfo
import com.example.demo.api.canvas.dto.CanvasListRequest
import com.example.demo.module.canvas.entity.Canvas

interface CanvasFacade {
    fun create(request: CanvasCreateRequest): Canvas
    fun list(request: CanvasListRequest): List<CanvasInfo>
}