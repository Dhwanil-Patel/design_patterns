package com.world_of_anonymous.design_patterns.creational_design_pattern.factory_design_pattern.Telusko;

public class OSFactoryDemo {
  public static void main(String[] args) {
    OSFactory factory = new OSFactory();
    factory.getInstance("unix").spec();
  }
}
