package com.multisport.planner.controller;

import com.multisport.planner.model.Workout;
import com.multisport.planner.service.WorkoutService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class WorkoutController {

    private final WorkoutService workoutService;

    public WorkoutController(WorkoutService workoutService) {
        this.workoutService = workoutService;
    }

    @GetMapping("/workouts")
    public String listWorkouts(Model model) {
        model.addAttribute("workouts", workoutService.getAllWorkouts());
        model.addAttribute("workoutCount", workoutService.getWorkoutCount());
        return "workouts";
    }

    @GetMapping("/workouts/new")
    public String newWorkout(Model model) {
        model.addAttribute("workout", new Workout());
        return "workout-form";
    }

    @PostMapping("/workouts")
    public String saveWorkout(@ModelAttribute Workout workout) {
        workoutService.addWorkout(workout);
        return "redirect:/workouts";
    }

}
