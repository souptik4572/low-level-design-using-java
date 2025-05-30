package com.example.design.patterns.behaivourial.command.homeautomation;

public class LightAppliance {
    private ApplianceState state;

    public LightAppliance() {
        this.state = ApplianceState.OFF;
    }

    public ApplianceState getState() {
        return state;
    }

    public void turnOn() {
        this.state = ApplianceState.ON;
        System.out.println("[Light Appliance] has been turned on - It is very bright");
    }

    public void turnOff() {
        this.state = ApplianceState.OFF;
        System.out.println("[Light Appliance] has been turned off - It is pitch dark");
    }
}
