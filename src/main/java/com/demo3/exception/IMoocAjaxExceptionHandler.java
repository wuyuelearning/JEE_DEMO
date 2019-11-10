package com.demo3.exception;

import com.demo3.test.IMoocJSONResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wuyue on  2019/11/09.
 */
//@RestControllerAdvice
public class IMoocAjaxExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public IMoocJSONResult defaultErrorHandler(HttpServletRequest request,
                                               Exception e) throws Exception {
        e.printStackTrace();
        return IMoocJSONResult.errorException(e.getMessage());
    }
}
