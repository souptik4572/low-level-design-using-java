package com.example.design.patterns.creational.factory;

import com.example.design.patterns.creational.factory.logictics.LogisticService;
import com.example.design.patterns.creational.factory.logictics.TransportMode;

public class FactoryImplementation {
    public static void main(String[] args) {
        LogisticService logisticService = new LogisticService();
        logisticService.send(TransportMode.AIR);
        logisticService.send(TransportMode.ROAD);
    }
}
