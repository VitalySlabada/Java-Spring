package com.example.spring09thymeleaf.controller;

import com.example.spring09thymeleaf.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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


    //@RequestMapping("/register", method = RequestMethod.GET)
    //same as below
    @GetMapping ("/register")
    public String register(Model model){

        model.addAttribute("students", DataGenerator.createStudent());

        return "/student/register";
    }


    @RequestMapping ("/welcome")
    public String welcome() {
        return "/student/welcome";

    }
}