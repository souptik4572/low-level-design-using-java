package com.example.design.patterns.behaivourial.command.homeautomation;

import java.util.HashMap;
import java.util.Map;

public class RemoteControl {
    private final Map<ApplianceType, Command> commands;

    public RemoteControl() {
        commands = new HashMap<>();
    }

    public void setCommand(ApplianceType applianceType, Command command) {
        commands.put(applianceType, command);
    }

    public void pressButton(ApplianceType applianceType) {
        Command command = commands.get(applianceType);
        if(command == null) {
            System.out.println("Command not found :)");
            return;
        }
        if(isApplianceTurnedOn(command.getApplianceState())) {
            command.undo();
            return;
        }
        command.execute();
    }

    private boolean isApplianceTurnedOn(ApplianceState state) {
        return state == ApplianceState.ON;
    }
}
