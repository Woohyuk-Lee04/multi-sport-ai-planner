package com.multisport.planner.model;

public class Workout {

    private String sport;
    private double distance;
    private int duration;

    public Workout(String sport, double distance, int duration) {
        this.sport = sport;
        this.distance = distance;
        this.duration = duration;
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
}

