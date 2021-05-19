package com.example.demo.module.canvas.repository

import com.example.demo.module.canvas.entity.Canvas
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CanvasRepository : MongoRepository<Canvas, Long> {
    fun findByUserId(userId: String): List<Canvas>
}