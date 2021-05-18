package com.example.demo.module.user.exception

import com.example.demo.base.exception.ConflictedException

class UserExistedException(message: String = "用户已存在") : ConflictedException(message)