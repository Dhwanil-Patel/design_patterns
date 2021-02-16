package com.world_of_anonymous.design_patterns.structural_design_pattern.command_design_pattern.service.concreate_command;

import com.world_of_anonymous.design_patterns.structural_design_pattern.command_design_pattern.service.command_interface.ICommand;
import com.world_of_anonymous.design_patterns.structural_design_pattern.command_design_pattern.service.receiver.Fan;
import com.world_of_anonymous.design_patterns.structural_design_pattern.command_design_pattern.service.receiver.Light;

public class StartFanCommand implements ICommand {

  private Fan fan;

  public StartFanCommand(Fan fan) {
    super();
    this.fan = fan;
  }

  @Override
  public void execute() {
    System.out.println("Start Fan!!!");
    fan.start();
  }
}
