package com.example.spring_practice_forms.controller;


import com.example.spring_practice_forms.model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingsController {

//    @RequestMapping ("/greeting")
//    public String greeting(Model model){
//        Greeting greeting = new Greeting();
//        model.addAttribute("greeting", greeting);
//        return "/greeting";
//    }


    @GetMapping("/greeting")
    public String greetingForm (Model model){
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping ("/greeting")
    public String greetingSubmit (@ModelAttribute Greeting greeting, Model model ){
        model.addAttribute("greeting", greeting);
        //System.out.println(greeting.getContent());
        return "result";
    }



}
