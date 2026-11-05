package com.multisport.planner.controller;

import java.util.List;
import com.multisport.planner.model.Workout;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {

        List<Workout> workouts = List.of(
                new Workout("Running", 5.0, 30),
                new Workout("Swimming", 1.0, 40),
                new Workout("Running", 10.0, 60),
                new Workout("Running", 15.0, 90)
        );

        model.addAttribute("workouts", workouts);

        return "index";
    }
}
