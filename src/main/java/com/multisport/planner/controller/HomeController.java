package com.multisport.planner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("appName", "Multi-Sport AI Planner");
        model.addAttribute("totalWorkouts", 12);
        return "index";
    }
}
