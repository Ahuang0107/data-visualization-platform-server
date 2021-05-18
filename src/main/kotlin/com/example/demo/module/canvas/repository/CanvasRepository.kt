package com.example.demo.module.canvas.repository

import com.example.demo.module.canvas.entity.Canvas
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import reactor.core.publisher.Mono

interface CanvasRepository : ReactiveMongoRepository<Canvas, String> {

    fun findByUserId(id: String): Mono<Canvas>
}