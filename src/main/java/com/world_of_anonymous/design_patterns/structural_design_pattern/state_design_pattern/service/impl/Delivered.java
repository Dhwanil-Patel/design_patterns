package com.world_of_anonymous.design_patterns.structural_design_pattern.state_design_pattern.service.impl;

import com.world_of_anonymous.design_patterns.structural_design_pattern.state_design_pattern.service.DeliveryContext;
import com.world_of_anonymous.design_patterns.structural_design_pattern.state_design_pattern.service.PackageState;

public class Delivered implements PackageState {

  private static Delivered instance = new Delivered();

  private Delivered() { }

  public static Delivered getInstance() {
    return instance;
  }

  @Override
  public void updateState(DeliveryContext ctx) {
    System.out.println("Package is delivered!!!");
  }
}
