package com.example.design.patterns.behaivourial.strategy.ridematcher;

public class NearestDistanceStrategy implements RideMatchingStrategy {
    @Override
    public void match() {
        System.out.println("Match ride based on nearest distance between rider and driver");
    }
}
