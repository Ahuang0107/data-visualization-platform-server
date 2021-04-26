package com.example.demo.dto

data class DigitalCardFlipperDateType(
    val content: String? = null,
    val title: DigitalCardFlipperTitle? = null,
    val prefix: DigitalCardFlipperPrefix? = null,
    val suffix: DigitalCardFlipperSuffix? = null,
)

data class DigitalCardFlipperTitle(
    val content: String? = null,
    val isTop: Boolean = true,
)

data class DigitalCardFlipperPrefix(
    val content: String? = null,
)

data class DigitalCardFlipperSuffix(
    val content: String? = null,
)