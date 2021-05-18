package com.example.demo.service.impl

import com.example.demo.dao.CanvasRepository
import com.example.demo.entity.Canvas
import com.example.demo.service.CanvasService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class CanvasServiceImpl : CanvasService {
    @Autowired
    lateinit var canvasRepository: CanvasRepository

    override fun create(userId: String, canvas: Canvas): Mono<Canvas> {
        canvas.userId = userId
        return canvasRepository.save(canvas)
    }

    override fun getById(id: String): Mono<Canvas>? {
        return canvasRepository.findById(id)
    }

    override fun findByUserId(id: String): Mono<Canvas> {
        return canvasRepository.findByUserId(id)
    }


}