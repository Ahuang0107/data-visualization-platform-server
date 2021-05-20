package com.example.demo.api.canvas.dto.converter

import com.example.demo.api.canvas.dto.CanvasInfo
import com.example.demo.api.canvas.dto.CreateCanvasRequest
import com.example.demo.api.canvas.dto.SaveCanvasRequest
import com.example.demo.module.canvas.entity.CanvasEntity
import org.mapstruct.Mapper
import org.mapstruct.MappingTarget
import org.mapstruct.factory.Mappers

@Mapper
interface CanvasConverter {

    companion object {
        @JvmField
        val INSTANCE: CanvasConverter = Mappers.getMapper(CanvasConverter::class.java)
    }

    fun toEntity(source: CreateCanvasRequest): CanvasEntity

    fun updateEntity(source: SaveCanvasRequest, @MappingTarget target: CanvasEntity): CanvasEntity

    fun toInfo(source: CanvasEntity): CanvasInfo
}

fun CreateCanvasRequest.toEntity(): CanvasEntity =
    CanvasConverter.INSTANCE.toEntity(this)

fun CanvasEntity.toInfo(): CanvasInfo =
    CanvasConverter.INSTANCE.toInfo(this)

fun CanvasEntity.updateEntity(source: SaveCanvasRequest): CanvasEntity =
    CanvasConverter.INSTANCE.updateEntity(source, this)