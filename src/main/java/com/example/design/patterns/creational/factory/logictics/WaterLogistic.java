package com.example.design.patterns.creational.factory.logictics;

public class WaterLogistic implements LogisticInterface {
    @Override
    public void send() {
        System.out.println("The package is being sent by Water");
    }
}
