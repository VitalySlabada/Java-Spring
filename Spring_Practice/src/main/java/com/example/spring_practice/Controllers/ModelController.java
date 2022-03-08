package com.example.spring_practice.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelController {




    @RequestMapping("/bike")
    public String homePage(Model model){

        //model method
        model.addAttribute("name", "string");
        model.addAttribute("course", "course a");


        return "/bike";
    }
//    @RequestMapping ("/bike")
//    public String bike (Model model ){
//
//        model.addAttribute("name", "ktm");
//
//
//        return "/bike";
//    }
}
