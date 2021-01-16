package com.world_of_anonymous.design_patterns.creational_design_pattern.singleton_design_pattern;

/**
 * Please be sure to use “volatile” keyword with instance variable otherwise you can run into an out of order write error scenario,
 * where reference of an instance is returned before actually the object is constructed
 * i.e. JVM has only allocated the memory and constructor code is still not executed. In this case, your other thread,
 * which refers to the uninitialized object may throw null pointer exception and can even crash the whole application.
 */
public class III_SynchronizationBlock {
  private static volatile III_SynchronizationBlock INSTANCE = null;
  private III_SynchronizationBlock() {
  }
  public III_SynchronizationBlock getInstance() {
    if (INSTANCE == null) {
      synchronized (III_SynchronizationBlock.class) {
        if (INSTANCE == null) {
          INSTANCE = new III_SynchronizationBlock();
        }
      }
    }
    return INSTANCE;
  }
}
