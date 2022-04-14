package com.example.xyz_banksimulation.controller;

import com.example.xyz_banksimulation.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class AccountController {


    private final AccountService accountService;

    public AccountService


    @GetMapping ("/index")
    public String accountList (Model model){
        model.addAttribute("accountList", accountService.listAllAcounts)
    }
}
