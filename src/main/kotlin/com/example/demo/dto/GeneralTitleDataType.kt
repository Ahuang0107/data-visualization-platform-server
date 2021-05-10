package com.example.demo.dto

data class GeneralTitleDataType(
    /**
     * 标题内容
     */
    val content: String? = null,
    /**
     * 字体
     */
    val fontFamily: String? = null,
    /**
     * 字号
     */
    val fontSize: Int? = 0,
)