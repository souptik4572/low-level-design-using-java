package com.example.design.patterns.behaivourial.strategy;

import com.example.design.patterns.behaivourial.strategy.ridematcher.AirportQueueStrategy;
import com.example.design.patterns.behaivourial.strategy.ridematcher.NearestDistanceStrategy;
import com.example.design.patterns.behaivourial.strategy.ridematcher.RideMatchingService;

public class StrategyDriver {
    public static void main(String[] args) {
        RideMatchingService nearestDistanceRideMatcher = new RideMatchingService(new NearestDistanceStrategy());
        nearestDistanceRideMatcher.matchRide();

        System.out.println();

        RideMatchingService airportQueueRideMatcher = new RideMatchingService(new AirportQueueStrategy());
        airportQueueRideMatcher.matchRide();
    }
}
