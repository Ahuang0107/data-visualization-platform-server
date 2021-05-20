package com.example.demo.module.canvas.repository

import com.example.demo.module.canvas.entity.CanvasEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CanvasRepository : MongoRepository<CanvasEntity, String> {
    fun findByUserId(userId: String): List<CanvasEntity>
}