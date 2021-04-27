package com.example.demo.controller

import com.example.demo.entity.Canvas
import com.example.demo.service.CanvasService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono

@RestController
@CrossOrigin("http://localhost:4000")
@RequestMapping("/api/canvas")
class CanvasController {
    @Autowired
    lateinit var canvasService: CanvasService

    /**
     * 新增大屏应用项目
     */
    @PostMapping("/")
    fun create(@RequestBody canvas: Canvas): Mono<Canvas> {
        return canvasService.create(canvas)
    }

    /**
     * 根据 ID 获取大屏应用项目数据
     */
    @GetMapping("/{id}")
    fun getCanvasInfo(@PathVariable id: String): Mono<Canvas>? {
        return canvasService.getById(id)
    }

}