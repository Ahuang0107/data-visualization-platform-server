package com.example.demo.api.canvas.facade.impl

import com.example.demo.api.canvas.dto.CreateRequest
import com.example.demo.api.canvas.facade.CanvasFacade
import com.example.demo.module.canvas.entity.Canvas
import com.example.demo.module.canvas.service.CanvasService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class CanvasFacadeImpl(
    private val canvasService: CanvasService,
) : CanvasFacade {
    override fun create(request: CreateRequest): Canvas {
        TODO("Not yet implemented")
    }
}