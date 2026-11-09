package com.multisport.planner.controller;

import com.multisport.planner.model.Workout;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WorkoutController {

    private final List<Workout> workouts = new ArrayList<>();

    @GetMapping("/workouts")
    public String listWorkouts(Model model) {
        model.addAttribute("workouts", workouts);
        return "workouts";
    }

    @GetMapping("/workouts/new")
    public String newWorkout(Model model) {
        model.addAttribute("workout", new Workout());
        return "workout-form";
    }

    @PostMapping("/workouts")
    public String saveWorkout(@ModelAttribute Workout workout) {
        workouts.add(workout);
        return "redirect:/workouts";
    }

}
