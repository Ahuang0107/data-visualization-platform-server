package com.example.demo.api.canvas.controller

import com.example.demo.api.canvas.facade.CanvasFacade
import com.example.demo.base.dto.AppResponse
import com.example.demo.base.property.SystemConst
import com.example.demo.module.canvas.entity.Canvas
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

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
}