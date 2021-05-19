package com.example.demo.module.canvas.service

import com.example.demo.module.canvas.entity.Canvas

/**
 * 数据大屏项目信息相关服务
 */
interface CanvasService {
    fun create(canvas: Canvas): Canvas
    fun findByUserId(userId: String): List<Canvas>
    fun getById(id: String): Canvas
}