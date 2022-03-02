package com.example.spring07springmvccontroller.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //annotate the class with the @Controller stereotypoe annotation
public class HomeController {

    @RequestMapping("/home") //associate method with request
    public String home(){
        return "home.html"; // which html to display
    }
    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome.html";
    }
}
