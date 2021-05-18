package com.example.demo.module.canvas.service.impl

import com.example.demo.module.canvas.repository.CanvasRepository
import com.example.demo.module.canvas.service.CanvasService
import org.springframework.stereotype.Service

@Service
class CanvasServiceImpl(
    private val repository: CanvasRepository,
) : CanvasService {
}