package com.example.demo.api.canvas.facade.impl

import com.example.demo.api.canvas.dto.CanvasInfo
import com.example.demo.api.canvas.dto.CanvasListRequest
import com.example.demo.api.canvas.dto.CreateCanvasRequest
import com.example.demo.api.canvas.dto.SaveCanvasRequest
import com.example.demo.api.canvas.dto.converter.toEntity
import com.example.demo.api.canvas.dto.converter.toInfo
import com.example.demo.api.canvas.dto.converter.updateEntity
import com.example.demo.api.canvas.facade.CanvasFacade
import com.example.demo.base.util.generatorId
import com.example.demo.module.canvas.entity.CanvasEntity
import com.example.demo.module.canvas.service.CanvasService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class CanvasFacadeImpl(
    private val canvasService: CanvasService,
) : CanvasFacade {
    override fun create(request: CreateCanvasRequest): CanvasEntity {
        return request.toEntity().let {
            it.id = generatorId()
            canvasService.save(it)
        }
    }

    override fun update(id: String, request: SaveCanvasRequest): CanvasEntity {
        return canvasService.getById(id).updateEntity(request).also {
            canvasService.save(it)
        }
    }

    override fun list(request: CanvasListRequest): List<CanvasInfo> {
        //todo 这里浪费了很多性能，需要优化
        return canvasService.findByUserId(request.userId).map {
            it.toInfo()
        }
    }

    override fun getDetail(id: String): CanvasEntity {
        return canvasService.getById(id)
    }
}