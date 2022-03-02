package com.example.spring07springmvccontroller.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/user")
    public String userInfo(){
        return "/user/userinfo.html";
    }
}
