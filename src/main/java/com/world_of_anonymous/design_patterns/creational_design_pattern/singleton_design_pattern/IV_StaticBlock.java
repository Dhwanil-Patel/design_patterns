package com.world_of_anonymous.design_patterns.creational_design_pattern.singleton_design_pattern;

public class IV_StaticBlock {
  private static volatile IV_StaticBlock INSTANCE = null;

  static {
    try {
      if (INSTANCE == null) {
        INSTANCE = new IV_StaticBlock();
      }
    } catch (Exception ex) {
      throw new RuntimeException("Oops, Something went wrong!!!", ex);
    }
  }

  private IV_StaticBlock() {
  }

  public static IV_StaticBlock getInstance() {
    return INSTANCE;
  }
}
