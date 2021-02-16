package com.world_of_anonymous.design_patterns.structural_design_pattern.strategy_design_pattern.service.impl;

import com.world_of_anonymous.design_patterns.structural_design_pattern.strategy_design_pattern.service.ISocialMediaStrategy;

public class TwitterStrategy implements ISocialMediaStrategy {
  @Override
  public void connectTo(String friendName) {
    System.out.println("Connect with " +friendName+ " through twitter");
  }
}
