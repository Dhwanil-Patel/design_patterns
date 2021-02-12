package com.world_of_anonymous.design_patterns.structural_design_pattern.state_design_pattern;

import com.world_of_anonymous.design_patterns.structural_design_pattern.state_design_pattern.service.DeliveryContext;

public class StateMain {
  public static void main(String[] args) {
    DeliveryContext context = new DeliveryContext("P001", null);
    context.update();
    context.update();
    context.update();
    context.update();
  }
}
