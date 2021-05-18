package com.example.demo.base.exception

open class ConflictedException @JvmOverloads constructor(message: String = "数据冲突") : ServiceException(message)