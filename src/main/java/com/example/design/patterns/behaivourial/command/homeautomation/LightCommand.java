package com.example.design.patterns.behaivourial.command.homeautomation;

public class LightCommand implements Command {

    LightAppliance appliance;

    public LightCommand(LightAppliance appliance) {
        this.appliance = appliance;
    }

    @Override
    public ApplianceState getState() {
        return appliance.getState();
    }

    @Override
    public void execute() {
        System.out.println("[Light Command] is turning on Light Appliance");
        appliance.turnOn();
    }

    @Override
    public void undo() {
        System.out.println("[Light Command] is turning off Light Appliance");
        appliance.turnOff();
    }
}
