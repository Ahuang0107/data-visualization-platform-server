package com.example.demo.module.common.dto

data class MultipleXAxesDataType(
    val category: List<String>? = emptyList(),
    val series: List<Series>? = emptyList()
)

data class Series(
    val yCategory: String? = null,
    val data: List<Int>? = emptyList(),
)