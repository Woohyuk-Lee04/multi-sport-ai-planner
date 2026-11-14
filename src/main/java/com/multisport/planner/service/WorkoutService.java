package com.multisport.planner.service;

import com.multisport.planner.model.Workout;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorkoutService {

    private final List<Workout> workouts = new ArrayList<>();

    public List<Workout> getAllWorkouts() {
        return new ArrayList<>(workouts);
    }

    public void addWorkout(Workout workout) {
        workouts.add(workout);
    }

    public int getWorkoutCount() {
        return workouts.size();
    }
}
