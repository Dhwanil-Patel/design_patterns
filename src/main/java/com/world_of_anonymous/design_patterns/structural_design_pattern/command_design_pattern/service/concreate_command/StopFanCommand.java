package com.world_of_anonymous.design_patterns.structural_design_pattern.command_design_pattern.service.concreate_command;

import com.world_of_anonymous.design_patterns.structural_design_pattern.command_design_pattern.service.command_interface.ICommand;
import com.world_of_anonymous.design_patterns.structural_design_pattern.command_design_pattern.service.receiver.Fan;

public class StopFanCommand implements ICommand {

  private Fan fan;

  public StopFanCommand(Fan fan) {
    super();
    this.fan = fan;
  }

  @Override
  public void execute() {
    System.out.println("Stop fan!!!");
    fan.stop();
  }
}
