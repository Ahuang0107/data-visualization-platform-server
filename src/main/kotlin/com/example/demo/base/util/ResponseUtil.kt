package com.example.demo.base.util

import com.example.demo.base.dto.AppResponse
import com.google.gson.Gson
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.io.PrintWriter
import javax.servlet.http.HttpServletResponse

object ResponseUtil {
    private val log: Logger = LoggerFactory.getLogger(ResponseUtil::class.java)

    fun out(response: HttpServletResponse, o: Any) {
        var out: PrintWriter? = null
        try {
            response.characterEncoding = "UTF-8"
            response.contentType = "application/json"
            response.status = HttpServletResponse.SC_OK
            out = response.writer
            out.println(Gson().toJson(o))
        } catch (e: Exception) {
            log.error(e.toString() + "输出JSON出错")
        } finally {
            if (out != null) {
                out.flush()
                out.close()
            }
        }
    }
}

fun HttpServletResponse.out(o: Any) = ResponseUtil.out(this, o)

fun <T> T.successResult() = AppResponse.success(this)