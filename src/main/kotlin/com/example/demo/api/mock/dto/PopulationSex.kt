package com.example.demo.api.mock.dto

import com.example.demo.api.mock.dto.common.Data

data class PopulationSex(
    var year: String? = null,
    var data: List<Data>? = emptyList(),
)
