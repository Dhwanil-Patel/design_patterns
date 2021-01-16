package com.world_of_anonymous.design_patterns.creational_design_pattern.singleton_design_pattern;

import javax.swing.*;

/**
 * Bill Pugh was main force behind the java memory model changes. His principle “Initialization-on-demand holder idiom” also uses the static block idea.
 * As you can see, until we need an instance, the LazyHolder class will not be initialized until required
 * and you can still use other static members of BillPughSingleton class. This is the solution, i will recommend to use. I have used it in my all projects.
 */
public class V_BillPugSolution {
  private V_BillPugSolution() {
  }
  private static class LazyHolder {
    private static final V_BillPugSolution INSTANCE = new V_BillPugSolution();
  }
  public static V_BillPugSolution getInstance() {
    return LazyHolder.INSTANCE;
  }
}
