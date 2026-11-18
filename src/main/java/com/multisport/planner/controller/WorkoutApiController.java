package com.multisport.planner.controller;

import com.multisport.planner.model.Workout;
import com.multisport.planner.service.WorkoutService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/workouts")
public class WorkoutApiController {

    private final WorkoutService workoutService;

    public WorkoutApiController(WorkoutService workoutService) {
        this.workoutService = workoutService;
    }

    @GetMapping
    public List<Workout> getAllWorkouts() {
        return workoutService.getAllWorkouts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Workout> getWorkoutById(
            @PathVariable Long id) {

        return workoutService.getWorkoutById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/count")
    public Map<String, Long> getWorkoutCount() {
        return Map.of("count", workoutService.getWorkoutCount());
    }
}
