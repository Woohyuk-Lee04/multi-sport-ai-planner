package com.multisport.planner.model;

import jakarta.persistence.*;

@Entity
@Table(name = "workouts")
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sport;
    private double distance;
    private int duration;

    public Workout(String sport, double distance, int duration) {
        this.sport = sport;
        this.distance = distance;
        this.duration = duration;
    }

    public Long getId() {
        return id;
    }

    public String getSport() {
        return sport;
    }
    public double getDistance() {
        return distance;
    }
    public int getDuration() {
        return duration;
    }

    public Workout() {
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}

