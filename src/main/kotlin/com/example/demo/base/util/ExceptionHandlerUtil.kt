package com.example.demo.base.util

import com.fasterxml.jackson.module.kotlin.MissingKotlinParameterException
import org.springframework.http.converter.HttpMessageNotReadableException
import org.springframework.validation.FieldError
import org.springframework.web.bind.MethodArgumentNotValidException

/**
 * 处理请求参数校验异常，生成直观的详细错误信息
 */
fun MethodArgumentNotValidException.getDetail(): String {
    return bindingResult.allErrors.joinToString(separator = "；") {
        if (it is FieldError) {
            "${it.field} ${it.defaultMessage}"
        } else {
            it.defaultMessage ?: ""
        }
    }
}

/**
 * 处理请求参数空异常，生成直观的详细错误信息
 */
fun HttpMessageNotReadableException.getDetail(): String? {
    return if (cause is MissingKotlinParameterException) {
        "需要请求参数：" + (cause as MissingKotlinParameterException).parameter.name
    } else message
}