package com.world_of_anonymous.design_patterns.structural_design_pattern.command_design_pattern.service.concreate_command;

import com.world_of_anonymous.design_patterns.structural_design_pattern.command_design_pattern.service.command_interface.ICommand;
import com.world_of_anonymous.design_patterns.structural_design_pattern.command_design_pattern.service.receiver.Light;

public class TurnOnLightCommand implements ICommand {

  private Light light;

  public TurnOnLightCommand(Light light) {
    super();
    this.light = light;
  }

  @Override
  public void execute() {
    System.out.println("Turn on light!!!");
    light.on();
  }
}
