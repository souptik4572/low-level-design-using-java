package com.example.design.patterns.behaivourial.strategy.ridematcher;

public class AirportQueueStrategy implements RideMatchingStrategy {
    @Override
    public void match() {
        System.out.println("Match ride based on airport vehicle queue");
    }
}
