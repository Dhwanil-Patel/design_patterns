package com.world_of_anonymous.design_patterns.creational_design_pattern.singleton_design_pattern;


import java.io.Serializable;

public class VIII_Final_Conclusion implements Serializable {
  private static final long serialVersionUID = 1L;
  private VIII_Final_Conclusion() {
  }
  private static class LazyVariable {
    private static final VIII_Final_Conclusion INSTANCE = new VIII_Final_Conclusion();
  }
  public VIII_Final_Conclusion getInstance() {
    return LazyVariable.INSTANCE;
  }
  protected Object readResolve() {
    return getInstance();
  }
}
