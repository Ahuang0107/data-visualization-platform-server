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

    override fun create(canvas: Canvas): Mono<Canvas> {
        return canvasRepository.save(canvas)
    }

    override fun findByUserId(id: String): Mono<Canvas> {
        return canvasRepository.findByUserId(id)
    }


}