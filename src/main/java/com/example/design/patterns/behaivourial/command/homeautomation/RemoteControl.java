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
        if(isTurnedOn(command.getState())) {
            command.undo();
            return;
        }
        command.execute();
    }

    private boolean isTurnedOn(ApplianceState state) {
        return state == ApplianceState.ON;
    }
}
