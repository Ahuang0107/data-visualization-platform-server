package com.example.demo.module.canvas.repository

import com.example.demo.module.canvas.entity.Canvas
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface CanvasRepository : ReactiveMongoRepository<Canvas, String> {
}