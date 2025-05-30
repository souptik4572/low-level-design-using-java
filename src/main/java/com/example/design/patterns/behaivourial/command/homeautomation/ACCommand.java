package com.example.design.patterns.behaivourial.command.homeautomation;

public class ACCommand implements Command {
    ACAppliance appliance;

    public ACCommand(ACAppliance appliance) {
        this.appliance = appliance;
    }

    @Override
    public ApplianceState getState() {
        return appliance.getState();
    }

    @Override
    public void execute() {
        System.out.println("[AC Command] is turning on AC Appliance");
        appliance.turnOn();
    }

    @Override
    public void undo() {
        System.out.println("[AC Command] is turning off AC Appliance");
        appliance.turnOff();
    }
}
