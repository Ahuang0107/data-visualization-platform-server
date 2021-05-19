package com.example.demo.api.canvas.facade.impl

import com.example.demo.api.canvas.dto.CanvasCreateRequest
import com.example.demo.api.canvas.dto.CanvasInfo
import com.example.demo.api.canvas.dto.CanvasListRequest
import com.example.demo.api.canvas.dto.converter.toEntity
import com.example.demo.api.canvas.dto.converter.toInfo
import com.example.demo.api.canvas.facade.CanvasFacade
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

    override fun list(request: CanvasListRequest): List<CanvasInfo> {
        //todo 这里浪费了很多性能，需要优化
        return canvasService.findByUserId(request.userId).map {
            it.toInfo()
        }
    }

    override fun getDetail(id: String): Canvas {
        return canvasService.getById(id)
    }
}