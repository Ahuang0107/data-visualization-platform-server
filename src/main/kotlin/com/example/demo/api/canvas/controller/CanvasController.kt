package com.example.demo.api.canvas.controller

import com.example.demo.api.canvas.dto.CreateRequest
import com.example.demo.api.canvas.facade.CanvasFacade
import com.example.demo.base.dto.AppResponse
import com.example.demo.base.property.SystemConst
import com.example.demo.module.canvas.entity.Canvas
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping(SystemConst.API_PREFIX + "/canvas")
class CanvasController(
    private val facade: CanvasFacade,
) {
    /**
     * 获取假数据（测试）
     */
    @GetMapping("/getMockCanvasData")
    fun getMockCanvasData(): AppResponse<Canvas> {
        TODO()
    }

    /**
     * 创建数据大屏项目
     */
    @PostMapping
    fun create(@RequestBody request: CreateRequest): AppResponse<Canvas> {
        TODO()
    }
}