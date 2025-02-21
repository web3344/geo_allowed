package com.wxl.boot.Exception;

import com.wxl.boot.pojo.Result;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandlerAdvice {

    Logger logger = LoggerFactory.getLogger(GlobalExceptionHandlerAdvice.class);
    @ExceptionHandler( {Exception.class})
    public Result<String> handleException(Exception e, HttpServletRequest request, HttpServletResponse response) {
        logger.error("统一异常",e);
        return new Result( 500,"系统异常",null);
//        return Result.success(500,"系统异常",e.getMessage());
    }
}
