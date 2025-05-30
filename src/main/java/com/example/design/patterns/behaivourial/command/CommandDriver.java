package com.example.design.patterns.behaivourial.command;

import com.example.design.patterns.behaivourial.command.homeautomation.*;

public class CommandDriver {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(ApplianceType.LIGHT, new LightCommand(new LightAppliance()));
        remoteControl.setCommand(ApplianceType.FAN, new FanCommand(new FanAppliance()));
        remoteControl.setCommand(ApplianceType.AC, new ACCommand(new ACAppliance()));

        remoteControl.pressButton(ApplianceType.LIGHT);
        remoteControl.pressButton(ApplianceType.FAN);
        remoteControl.pressButton(ApplianceType.AC);

        remoteControl.pressButton(ApplianceType.LIGHT);
        remoteControl.pressButton(ApplianceType.FAN);
        remoteControl.pressButton(ApplianceType.AC);
    }
}
