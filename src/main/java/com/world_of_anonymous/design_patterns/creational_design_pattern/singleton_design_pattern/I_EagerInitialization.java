package com.world_of_anonymous.design_patterns.creational_design_pattern.singleton_design_pattern;

public class I_EagerInitialization {
  private static volatile I_EagerInitialization INSTANCE = new I_EagerInitialization();
  private I_EagerInitialization() {
  }
  public I_EagerInitialization getInstance() {
    return INSTANCE;
  }
}

