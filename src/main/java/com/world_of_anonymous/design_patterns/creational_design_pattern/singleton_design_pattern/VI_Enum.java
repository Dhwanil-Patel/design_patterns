package com.world_of_anonymous.design_patterns.creational_design_pattern.singleton_design_pattern;

/**
 * This type of implementation employs the use of enum. Enum, as written in the java docs,
 * provided implicit support for thread safety and only one instance is guaranteed.
 * Java enum singleton is also a good way to have singleton with minimal effort.
 */
public enum  VI_Enum {
  INSTANCE;
  public void someMethod(String param) {

  }
}
