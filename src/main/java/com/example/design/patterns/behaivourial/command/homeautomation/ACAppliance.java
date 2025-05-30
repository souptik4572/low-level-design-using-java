package com.example.design.patterns.behaivourial.command.homeautomation;

public class ACAppliance {
    private ApplianceState state;

    public ACAppliance() {
        this.state = ApplianceState.OFF;
    }

    public ApplianceState getState() {
        return state;
    }

    public void turnOn() {
        this.state = ApplianceState.ON;
        System.out.println("[AC Appliance] has been turned on - It is very cold");
    }

    public void turnOff() {
        this.state = ApplianceState.OFF;
        System.out.println("[AC Appliance] has been turned off - It is pretty hot");
    }
}
