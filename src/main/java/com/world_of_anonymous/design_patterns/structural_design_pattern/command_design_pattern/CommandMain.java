package com.world_of_anonymous.design_patterns.structural_design_pattern.command_design_pattern;

import com.world_of_anonymous.design_patterns.structural_design_pattern.command_design_pattern.service.concreate_command.StartFanCommand;
import com.world_of_anonymous.design_patterns.structural_design_pattern.command_design_pattern.service.concreate_command.StopFanCommand;
import com.world_of_anonymous.design_patterns.structural_design_pattern.command_design_pattern.service.concreate_command.TurnOffLightCommand;
import com.world_of_anonymous.design_patterns.structural_design_pattern.command_design_pattern.service.concreate_command.TurnOnLightCommand;
import com.world_of_anonymous.design_patterns.structural_design_pattern.command_design_pattern.service.invocker.HomeAutomationRemote;
import com.world_of_anonymous.design_patterns.structural_design_pattern.command_design_pattern.service.receiver.Fan;
import com.world_of_anonymous.design_patterns.structural_design_pattern.command_design_pattern.service.receiver.Light;

public class CommandMain {
  public static void main(String[] args) {
    Light livingRoomLight = new Light();
    Light badRoomLight = new Light();
    Fan badRoomFan = new Fan();

    HomeAutomationRemote remote = new HomeAutomationRemote();

    remote.setCommand(new TurnOnLightCommand(livingRoomLight));
    remote.buttonPressed();
    remote.setCommand(new TurnOnLightCommand(badRoomLight));
    remote.buttonPressed();
    remote.setCommand(new StartFanCommand(badRoomFan));
    remote.buttonPressed();
    remote.setCommand(new StopFanCommand(badRoomFan));
    remote.buttonPressed();
    remote.setCommand(new TurnOffLightCommand(badRoomLight));
    remote.buttonPressed();
  }
}
