package com.example.demo.api.mock.dto

data class PopulationCensus(
    var year: String? = null,
    var data: PopulationNum? = null,
)

data class PopulationNum(
    var total: Int? = null,
    var male: Int? = null,
    var female: Int? = null,
    var radio: Double? = null,
)