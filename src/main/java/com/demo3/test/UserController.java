package com.demo3.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by wuyue on 2019/11/8.
 */
@RestController   //  @RestController  =   @Controller +@ResponseBody
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/getUser")
    public User getUser() {
        User user = new User();
        user.setName("wuyue123");
        user.setAge(28);
        user.setBirthday(new Date());
        user.setPassword("123123123");
        user.setDesc("123123123");
        return user;
    }



    @RequestMapping("/getUserJson")
    public IMoocJSONResult getUserJson() {
        User user = new User();
        user.setName("wuyue123");
        user.setAge(28123);
        user.setBirthday(new Date());
        user.setPassword("1231111122");
        user.setDesc("23");
        return IMoocJSONResult.ok(user);
    }

}
