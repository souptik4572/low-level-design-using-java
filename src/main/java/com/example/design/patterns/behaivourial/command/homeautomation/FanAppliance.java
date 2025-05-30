package com.example.design.patterns.behaivourial.command.homeautomation;

public class FanAppliance {
    private ApplianceState state;

    public FanAppliance() {
        this.state = ApplianceState.OFF;
    }

    public ApplianceState getState() {
        return state;
    }

    public void turnOn() {
        this.state = ApplianceState.ON;
        System.out.println("[Fan Appliance] has been turned on - It is very windy");
    }

    public void turnOff() {
        this.state = ApplianceState.OFF;
        System.out.println("[Fan Appliance] has been turned off - It is winless");
    }
}
