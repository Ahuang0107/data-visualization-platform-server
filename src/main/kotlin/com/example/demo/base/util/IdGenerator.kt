package com.example.demo.base.util

import java.util.*
import kotlin.math.abs

fun generatorId() = abs(UUID.randomUUID().leastSignificantBits)