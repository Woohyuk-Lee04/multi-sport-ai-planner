package com.multisport.planner.controller;

import com.multisport.planner.model.Workout;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {

        Workout workout = new Workout("Running", 5.0, 30);

        model.addAttribute("workout", workout);
        
        return "index";
    }
}
