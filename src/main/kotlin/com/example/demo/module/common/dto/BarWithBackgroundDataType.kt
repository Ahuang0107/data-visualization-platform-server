package com.example.demo.module.common.dto

data class BarWithBackgroundDataType(
    val category: XAxis? = null,
    val series: List<YAxis>? = emptyList(),
)

data class XAxis(
    val data: List<String>? = emptyList(),
)

data class YAxis(
    val data: List<Int>? = emptyList(),
    val type: String? = null,
)