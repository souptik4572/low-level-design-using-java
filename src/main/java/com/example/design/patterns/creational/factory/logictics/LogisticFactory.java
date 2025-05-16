package com.example.design.patterns.creational.factory.logictics;

public class LogisticFactory {
    public static LogisticInterface getLogistics(TransportMode transportMode) {
        switch(transportMode) {
            case AIR:
                return new AirLogistic();
            case WATER:
                return new WaterLogistic();
            default:
                return new RoadLogistic();
        }
    }
}
