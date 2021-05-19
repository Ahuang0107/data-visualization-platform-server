package com.example.demo.api.canvas.dto.converter

import com.example.demo.api.canvas.dto.CanvasCreateRequest
import com.example.demo.api.canvas.dto.CanvasInfo
import com.example.demo.module.canvas.entity.Canvas
import org.mapstruct.Mapper
import org.mapstruct.factory.Mappers

@Mapper
interface CanvasConverter {

    companion object {
        @JvmField
        val INSTANCE: CanvasConverter = Mappers.getMapper(CanvasConverter::class.java)
    }

    fun toEntity(source: CanvasCreateRequest): Canvas

    fun toInfo(source: Canvas): CanvasInfo
}

fun CanvasCreateRequest.toEntity(): Canvas =
    CanvasConverter.INSTANCE.toEntity(this)

fun Canvas.toInfo(): CanvasInfo =
    CanvasConverter.INSTANCE.toInfo(this)