package com.example.spring08springmvcmodel.controller;

import com.example.spring08springmvcmodel.Mentor;
import com.example.spring08springmvcmodel.enums.Gender;
import com.example.spring08springmvcmodel.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {


    @RequestMapping("/welcome")
    public String homePage(Model model){

        //model method
        model.addAttribute("name", "string");
        model.addAttribute("course", "course a");


        String subject = "Collections";
        model.addAttribute("subject", subject);

        //Create some random student id and show in UI

        int rand = (int)(Math.random()*100);

        model.addAttribute("id", rand);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(6);
        numbers.add(1);
        numbers.add(2);

        model.addAttribute("numbers", numbers);

        Student student = new Student(1,"VAsya","pupkin");
        model.addAttribute("student", student);


        return "/student/welcome";
    }
}
