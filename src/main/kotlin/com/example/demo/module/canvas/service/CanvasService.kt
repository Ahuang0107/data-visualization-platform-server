package com.example.demo.module.canvas.service

import com.example.demo.module.canvas.entity.CanvasEntity

/**
 * 数据大屏项目信息相关服务
 */
interface CanvasService {
    fun save(canvas: CanvasEntity): CanvasEntity
    fun findByUserId(userId: String): List<CanvasEntity>
    fun getById(id: String): CanvasEntity
}