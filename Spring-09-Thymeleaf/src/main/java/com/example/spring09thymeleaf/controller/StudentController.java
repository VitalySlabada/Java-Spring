package com.example.spring09thymeleaf.controller;

import com.example.spring09thymeleaf.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
//
//@RequestMapping ("/student")
//public class StudentController {
//
//
//@RequestMapping ("/register")
//public String register(Model model){
//    //view
//
//    model.addAttribute("students", DataGenerator.createStudent());
//    return "/student/register";
//}
//
//
//}
@Controller
@RequestMapping("/student")
public class StudentController {
    @RequestMapping ("/welcome")
    public String welcome() {
        return "/student/welcome";

    }

    @RequestMapping("/register")
    public String register(Model model){

        model.addAttribute("students", DataGenerator.createStudent());

        return "/student/register";
    }

}