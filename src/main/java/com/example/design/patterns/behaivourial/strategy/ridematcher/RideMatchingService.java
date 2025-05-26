package com.example.design.patterns.behaivourial.strategy.ridematcher;

public class RideMatchingService {
    private RideMatchingStrategy rideMatchingStrategy;

    public RideMatchingService(RideMatchingStrategy rideMatchingStrategy) {
        this.rideMatchingStrategy = rideMatchingStrategy;
    }

    public void setRideMatchingStrategy(RideMatchingStrategy rideMatchingStrategy) {
        this.rideMatchingStrategy = rideMatchingStrategy;
    }

    public void matchRide() {
        rideMatchingStrategy.match();
    }
}
