package com.example.demo.dao

import com.example.demo.entity.Canvas
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import reactor.core.publisher.Mono

interface CanvasRepository : ReactiveMongoRepository<Canvas, String> {

    fun findByUserId(id: String): Mono<Canvas>
}