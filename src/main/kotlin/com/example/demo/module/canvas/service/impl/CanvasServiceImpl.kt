package com.example.demo.module.canvas.service.impl

import com.example.demo.module.canvas.entity.Canvas
import com.example.demo.module.canvas.repository.CanvasRepository
import com.example.demo.module.canvas.service.CanvasService
import org.springframework.stereotype.Service

@Service
class CanvasServiceImpl(
    private val repository: CanvasRepository,
) : CanvasService {
    override fun create(canvas: Canvas): Canvas {
        return repository.save(canvas)
    }

    override fun findByUserId(userId: String): List<Canvas> {
        return repository.findByUserId(userId)
    }
}