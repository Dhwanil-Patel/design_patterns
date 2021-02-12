package com.world_of_anonymous.design_patterns.structural_design_pattern.state_design_pattern.service.impl;

import com.world_of_anonymous.design_patterns.structural_design_pattern.state_design_pattern.service.DeliveryContext;
import com.world_of_anonymous.design_patterns.structural_design_pattern.state_design_pattern.service.PackageState;

public class InTransition implements PackageState {
  private static InTransition instance = new InTransition();

  private InTransition() { }

  public static InTransition getInstance() {
    return instance;
  }

  @Override
  public void updateState(DeliveryContext ctx) {
    System.out.println("Package is in transition!!!");
    ctx.setCurrState(OutForDelivery.getInstance());
  }
}
