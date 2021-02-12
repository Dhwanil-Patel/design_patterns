package com.world_of_anonymous.design_patterns.structural_design_pattern.state_design_pattern.service.impl;

import com.world_of_anonymous.design_patterns.structural_design_pattern.state_design_pattern.service.DeliveryContext;
import com.world_of_anonymous.design_patterns.structural_design_pattern.state_design_pattern.service.PackageState;

public class OutForDelivery implements PackageState {

  private static OutForDelivery instance = new OutForDelivery();

  private OutForDelivery() { }

  public static OutForDelivery getInstance() {
    return instance;
  }

  @Override
  public void updateState(DeliveryContext ctx) {
    System.out.println("Package is out for delivery!!!");
    ctx.setCurrState(Delivered.getInstance());
  }
}
