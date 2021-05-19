package com.example.demo.base.exception

import com.example.demo.base.dto.AppResponse
import com.example.demo.base.dto.AppResponse.ResponseCode.*
import com.example.demo.base.util.getDetail
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.http.converter.HttpMessageNotReadableException
import org.springframework.web.HttpRequestMethodNotSupportedException
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.MissingServletRequestParameterException
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest

/**
 * 业务异常处理类
 */
@ControllerAdvice
class RestExceptionHandler {
    private val log: Logger = LoggerFactory.getLogger(RestExceptionHandler::class.java)

    @ExceptionHandler(ServiceException::class)
    fun handleServiceException(ex: ServiceException, request: WebRequest): ResponseEntity<Any> {
        log.error("\n捕获业务异常！异常信息：", ex)
        return ResponseEntity(AppResponse.failed(ex), HttpStatus.OK)
    }

    @ExceptionHandler(MethodArgumentNotValidException::class)
    fun handleArgumentException(ex: MethodArgumentNotValidException, request: WebRequest): ResponseEntity<Any> {
        log.warn("\n捕获异常！异常信息：缺少必要参数！")
        log.debug("\n异常详情：", ex)
        return ResponseEntity(AppResponse.failed(INVALID_REQUEST, data = ex.getDetail()), HttpStatus.OK)
    }

    @ExceptionHandler(MissingServletRequestParameterException::class)
    fun handleMissingParamException(ex: MissingServletRequestParameterException, request: WebRequest):
            ResponseEntity<Any> {
        log.warn("\n捕获异常！异常信息：缺少必要参数！")
        log.debug("\n异常详情：", ex)
        return ResponseEntity(AppResponse.failed(INVALID_REQUEST, ex), HttpStatus.OK)
    }

    @ExceptionHandler(IllegalArgumentException::class)
    fun handleIllegalArgumentException(ex: IllegalArgumentException, request: WebRequest):
            ResponseEntity<Any> {
        log.warn("\n捕获异常！异常信息：缺少必要参数！")
        log.debug("\n异常详情：", ex)
        return ResponseEntity(AppResponse.failed(INVALID_REQUEST, ex), HttpStatus.OK)
    }

    @ExceptionHandler(HttpMessageNotReadableException::class)
    fun handleMissingParamException(ex: HttpMessageNotReadableException, request: WebRequest): ResponseEntity<Any> {
        log.warn("\n捕获异常！异常信息：请求有误！")
        log.debug("\n异常详情：", ex)
        return ResponseEntity(AppResponse.failed(INVALID_REQUEST, data = ex.getDetail()), HttpStatus.OK)
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException::class)
    fun handleArgumentException(ex: HttpRequestMethodNotSupportedException, request: WebRequest): ResponseEntity<Any> {
        log.warn("\n捕获异常！异常信息：不支持的请求方式！")
        return ResponseEntity(AppResponse.failed(INVALID_REQUEST, ex), HttpStatus.OK)
    }

    @ExceptionHandler(AccessDeniedException::class)
    fun handleAuthorityException(ex: AccessDeniedException, request: WebRequest): ResponseEntity<Any> {
        log.warn("\n捕获异常！异常信息：请求权限不足！")
        return ResponseEntity(AppResponse.failed(ACCESS_DENIED, ex), HttpStatus.OK)
    }

    @ExceptionHandler(ConflictedException::class)
    fun handleConflictedException(ex: ConflictedException, request: WebRequest): ResponseEntity<Any> {
        log.warn("\n捕获异常！异常信息：${ex.message}！")
        log.debug("\n异常详情：", ex)
        return ResponseEntity(AppResponse.failed(CONFLICTED, ex), HttpStatus.OK)
    }
}