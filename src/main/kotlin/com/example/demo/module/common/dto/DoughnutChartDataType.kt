package com.example.demo.module.common.dto

import com.example.demo.api.mock.dto.common.Data

data class DoughnutChartDataType(
    val name: String? = null,
    val data: List<Data>? = emptyList()
)
