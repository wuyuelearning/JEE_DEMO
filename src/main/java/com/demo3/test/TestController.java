package com.demo3.test;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wuyue on 2019/11/8.
 */
@RestController
public class TestController {

    @Autowired
    private Resource resource;

    @RequestMapping("/test")
    public Object test(){
        return "test";
    }

    @RequestMapping("/getResource")
    public IMoocJSONResult getResource(){
        Resource bean =new Resource();
        BeanUtils.copyProperties(resource,bean);
        return IMoocJSONResult.ok(bean);
    }
}
