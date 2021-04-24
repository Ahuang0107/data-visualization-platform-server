package com.example.demo.service

import com.example.demo.entity.Canvas
import reactor.core.publisher.Mono

interface CanvasService {
    fun create(canvas: Canvas): Mono<Canvas>

    fun findByUserId(id: String): Mono<Canvas>
}