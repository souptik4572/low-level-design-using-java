package com.example.design.patterns.behaivourial.command.homeautomation;

public class FanCommand implements Command {
    FanAppliance appliance;

    public FanCommand(FanAppliance appliance) {
        this.appliance = appliance;
    }

    @Override
    public ApplianceState getApplianceState() {
        return appliance.getState();
    }

    @Override
    public void execute() {
        System.out.println("[Fan Command] is turning on Fan Appliance");
        appliance.turnOn();
    }

    @Override
    public void undo() {
        System.out.println("[Fan Command] is turning off Fan Appliance");
        appliance.turnOff();
    }
}
