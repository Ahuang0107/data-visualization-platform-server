package com.example.demo.service

import com.example.demo.entity.Canvas
import reactor.core.publisher.Mono

interface CanvasService {
    /**
     * 新增大屏应用项目
     */
    fun create(canvas: Canvas): Mono<Canvas>

    /**
     * 根据 ID 获取大屏应用项目数据
     */
    fun getById(id: String): Mono<Canvas>?

    fun findByUserId(id: String): Mono<Canvas>
}