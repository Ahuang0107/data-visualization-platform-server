package com.example.demo.module.canvas.service.impl

import com.example.demo.module.canvas.entity.Canvas
import com.example.demo.module.canvas.repository.CanvasRepository
import com.example.demo.module.canvas.service.CanvasService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class CanvasServiceImpl : CanvasService {
    @Autowired
    lateinit var canvasRepository: CanvasRepository

    override fun create(canvas: Canvas): Mono<Canvas> {
        return canvasRepository.save(canvas)
    }

    override fun getById(id: String): Mono<Canvas>? {
        return canvasRepository.findById(id)
    }

    override fun findByUserId(id: String): Mono<Canvas> {
        return canvasRepository.findByUserId(id)
    }


}