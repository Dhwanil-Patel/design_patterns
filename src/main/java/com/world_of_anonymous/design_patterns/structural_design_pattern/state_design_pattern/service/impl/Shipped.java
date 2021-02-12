package com.world_of_anonymous.design_patterns.structural_design_pattern.state_design_pattern.service.impl;

import com.world_of_anonymous.design_patterns.structural_design_pattern.state_design_pattern.service.DeliveryContext;
import com.world_of_anonymous.design_patterns.structural_design_pattern.state_design_pattern.service.PackageState;

public class Shipped implements PackageState {

  private static Shipped instance = new Shipped();

  private Shipped() { }

  public static Shipped getInstance() {
    return instance;
  }

  @Override
  public void updateState(DeliveryContext ctx) {
    System.out.println("Package is shipped!!!");
    ctx.setCurrState(InTransition.getInstance());
  }
}
