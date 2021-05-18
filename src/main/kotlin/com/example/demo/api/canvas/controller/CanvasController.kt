package com.example.demo.api.canvas.controller

import com.example.demo.base.property.SystemConst
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin("http://localhost:4000")
@RequestMapping(SystemConst.API_PREFIX + "/canvas")
class CanvasController {
}