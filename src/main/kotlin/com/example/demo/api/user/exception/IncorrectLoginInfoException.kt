package com.example.demo.api.user.exception

import com.example.demo.base.exception.ServiceException

class IncorrectLoginInfoException : ServiceException("用户名或密码错误")