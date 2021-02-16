package com.world_of_anonymous.design_patterns.structural_design_pattern.strategy_design_pattern.service;

public class SocialMediaContext {
  ISocialMediaStrategy strategy;

  public void setSocialMediaStrategy(ISocialMediaStrategy strategy) {
    this.strategy = strategy;
  }

  public void connect(String name) {
    strategy.connectTo(name);
  }
}
