package com.example.design.patterns.behaivourial.command.homeautomation;

public interface Command {
    ApplianceState getApplianceState();
    void execute();
    void undo();
}
