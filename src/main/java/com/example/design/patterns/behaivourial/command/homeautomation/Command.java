package com.example.design.patterns.behaivourial.command.homeautomation;

public interface Command {
    ApplianceState getState();
    void execute();
    void undo();
}
