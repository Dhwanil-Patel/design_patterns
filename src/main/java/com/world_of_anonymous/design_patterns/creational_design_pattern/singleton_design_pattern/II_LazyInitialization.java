package com.world_of_anonymous.design_patterns.creational_design_pattern.singleton_design_pattern;

public final class II_LazyInitialization {
  private static volatile II_LazyInitialization INSTANCE = null;
  private II_LazyInitialization() {
  }
  public II_LazyInitialization getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new II_LazyInitialization();
    }
    return INSTANCE;
  }
}
