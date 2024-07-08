package com.msr.controller;

import com.msr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    //跳转到登录页面
    @RequestMapping("toLoginPage")
    public String toLoginPage(){
        return "login";
    }
}
