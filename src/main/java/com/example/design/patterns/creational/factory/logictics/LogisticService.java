package com.example.design.patterns.creational.factory.logictics;

public class LogisticService {
    public void send(TransportMode transportMode) {
        LogisticInterface logistics = LogisticFactory.getLogistics(transportMode);
        logistics.send();
    }
}
