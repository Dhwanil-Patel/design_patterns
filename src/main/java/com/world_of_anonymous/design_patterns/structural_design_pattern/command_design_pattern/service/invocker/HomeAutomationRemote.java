package com.world_of_anonymous.design_patterns.structural_design_pattern.command_design_pattern.service.invocker;

import com.world_of_anonymous.design_patterns.structural_design_pattern.command_design_pattern.service.command_interface.ICommand;

public class HomeAutomationRemote {
  ICommand command;

  public void setCommand(ICommand command) {
    this.command = command;
  }

  public void buttonPressed() {
    command.execute();
  }
}
