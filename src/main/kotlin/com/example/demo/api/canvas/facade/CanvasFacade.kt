package com.example.demo.api.canvas.facade

import com.example.demo.api.canvas.dto.CanvasInfo
import com.example.demo.api.canvas.dto.CanvasListRequest
import com.example.demo.api.canvas.dto.CreateCanvasRequest
import com.example.demo.api.canvas.dto.SaveCanvasRequest
import com.example.demo.module.canvas.entity.CanvasEntity

interface CanvasFacade {
    fun create(request: CreateCanvasRequest): CanvasEntity
    fun update(id: String, request: SaveCanvasRequest): CanvasEntity
    fun list(request: CanvasListRequest): List<CanvasInfo>
    fun getDetail(id: String): CanvasEntity
}