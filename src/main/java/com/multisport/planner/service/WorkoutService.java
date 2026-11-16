package com.multisport.planner.service;

import com.multisport.planner.model.Workout;
import com.multisport.planner.repository.WorkoutRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkoutService {

    private final WorkoutRepository workoutRepository;

    public WorkoutService(WorkoutRepository workoutRepository) {
        this.workoutRepository = workoutRepository;
    }

    public List<Workout> getAllWorkouts() {
        return workoutRepository.findAll();
    }

    public void addWorkout(Workout workout) {
        workoutRepository.save(workout);
    }

    public long getWorkoutCount() {
        return workoutRepository.count();
    }

    public Optional<Workout> getWorkoutById(Long id) {
        return workoutRepository.findById((id);
    }
}
