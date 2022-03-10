package com.example.spring08springmvcmodel.controller;

import com.example.spring08springmvcmodel.model.Mentor;
import com.example.spring08springmvcmodel.enums.Gender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller

@RequestMapping("/mentor")
public class MentorController {

    @RequestMapping("/list")
    public String showTable (Model model){

        List<Mentor> listPers = new ArrayList<>();
        listPers.add(new Mentor("Mike","Smith", 45, Gender.MALE));
        listPers.add(new Mentor("Tom","Hanks", 65, Gender.MALE));
        listPers.add(new Mentor("Ammy","Bryan", 25, Gender.FEMALE));


        model.addAttribute("mentors",listPers );



        return "/mentor/list";

    }


}
