package com.example.demo.api.mock.dto

import com.example.demo.api.mock.dto.common.Data

data class PopulationAgeRate(
    val name: String? = null,
    val data: List<Data>? = emptyList()
)