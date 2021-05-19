package com.example.demo.api.canvas.facade.impl

import com.example.demo.api.canvas.dto.CanvasCreateRequest
import com.example.demo.api.canvas.dto.CanvasListRequest
import com.example.demo.api.canvas.facade.CanvasFacade
import com.example.demo.api.user.dto.converter.toEntity
import com.example.demo.base.util.generatorId
import com.example.demo.module.canvas.entity.Canvas
import com.example.demo.module.canvas.service.CanvasService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class CanvasFacadeImpl(
    private val canvasService: CanvasService,
) : CanvasFacade {
    override fun create(request: CanvasCreateRequest): Canvas {
        return request.toEntity().let {
            it.id = generatorId()
            canvasService.create(it)
        }
    }

    override fun list(request: CanvasListRequest): List<Canvas> {
        return canvasService.findByUserId(request.userId)
    }
}