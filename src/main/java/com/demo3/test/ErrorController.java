package com.demo3.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wuyue on  2019/11/09.
 */
@Controller
@RequestMapping("err")
public class ErrorController {
    @RequestMapping("/error")
    public String error(){
        int a =1/0;
        return "thymeleaf/error";
    }
    @RequestMapping("/ajaxerror")
    public String ajaxerror(){
        return "thymeleaf/ajaxerror";
    }

    @RequestMapping("/getAjaxerror")
    @ResponseBody
    public IMoocJSONResult getAjaxerror(){
        int a =1/0;
        return IMoocJSONResult.ok();
    }
}
