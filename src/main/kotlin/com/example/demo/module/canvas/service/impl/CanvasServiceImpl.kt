package com.example.demo.module.canvas.service.impl

import com.example.demo.module.canvas.entity.CanvasEntity
import com.example.demo.module.canvas.repository.CanvasRepository
import com.example.demo.module.canvas.service.CanvasService
import org.springframework.stereotype.Service

@Service
class CanvasServiceImpl(
    private val repository: CanvasRepository,
) : CanvasService {
    override fun save(canvas: CanvasEntity): CanvasEntity {
        return repository.save(canvas)
    }

    override fun findByUserId(userId: String): List<CanvasEntity> {
        return repository.findByUserId(userId)
    }

    override fun getById(id: String): CanvasEntity {
        return repository.findById(id).get()
    }
}