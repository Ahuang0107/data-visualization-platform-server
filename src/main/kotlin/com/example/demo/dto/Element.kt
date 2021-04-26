package com.example.demo.dto

data class Element(
    val primaryKey: String = "",
    val type: String? = null,
    val name: String? = null,

    val width: Int? = null,
    val height: Int? = null,
    val x: Int? = null,
    val y: Int? = null,

    val subItem: List<Element>? = null,

    val generalTitle: GeneralTitleDataType? = null,

    val digitalCardFlipper: DigitalCardFlipperDateType? = null

)


