package com.example.demo.api.canvas.controller

import com.example.demo.api.canvas.dto.CanvasCreateRequest
import com.example.demo.api.canvas.dto.CanvasInfo
import com.example.demo.api.canvas.dto.CanvasListRequest
import com.example.demo.api.canvas.facade.CanvasFacade
import com.example.demo.base.dto.AppResponse
import com.example.demo.base.property.SystemConst
import com.example.demo.base.util.successResult
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
     * 根据用户 ID 获取数据大屏项目列表
     */
    @GetMapping("/list")
    fun getCanvasList(request: CanvasListRequest): AppResponse<List<CanvasInfo>> {
        return facade.list(request).successResult()
    }

    /**
     * 创建数据大屏项目
     */
    @PostMapping
    fun create(@RequestBody request: CanvasCreateRequest): AppResponse<Canvas> {
        return facade.create(request).successResult()
    }

//    @GetMapping("/{id}")
//    fun getDetail(@PathVariable id: String): AppResponse<Canvas> {
//        TODO()
//    }
}