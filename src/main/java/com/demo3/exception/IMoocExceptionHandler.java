package com.demo3.exception;

import com.demo3.test.IMoocJSONResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by wuyue on  2019/11/09.
 */
@ControllerAdvice
public class IMoocExceptionHandler {

    public static final String IMOOC_ERROR_VIEW = "error";

//    @ExceptionHandler(value = Exception.class)
//    public Object errorHandler(HttpServletRequest reqest,
//                               HttpServletResponse response, Exception e) throws Exception {
//
//        e.printStackTrace();
//        ModelAndView mav = new ModelAndView();
//        mav.addObject("exception", e);
//        mav.addObject("url", reqest.getRequestURL());
//        mav.setViewName(IMOOC_ERROR_VIEW);
//        return mav;
//    }

    @ExceptionHandler(value = Exception.class)
    public Object errorHandler(HttpServletRequest request,
                               HttpServletResponse response, Exception e) throws Exception {
        e.printStackTrace();
        if (isAjax(request)){
            return IMoocJSONResult.errorException(e.getMessage());
        }else {
            ModelAndView modelAndView =new ModelAndView();
            modelAndView.addObject("exception",e);
            modelAndView.addObject("url",request.getRequestURL());
            modelAndView.setViewName(IMOOC_ERROR_VIEW);
            return modelAndView;
        }
    }

    /**
     * @Title: IMoocExceptionHandler.java
     * @Package com.imooc.exception
     * @Description: 判断是否是ajax请求
     * Copyright: Copyright (c) 2017
     * Company:FURUIBOKE.SCIENCE.AND.TECHNOLOGY
     *
     * @author leechenxiang
     * @date 2017年12月3日 下午1:40:39
     * @version V1.0
     */
    public static boolean isAjax(HttpServletRequest request){
        return  (request.getHeader("X-Requested-With") != null
                && "XMLHttpRequest"
                .equals( request.getHeader("X-Requested-With").toString()) );
    }
}
