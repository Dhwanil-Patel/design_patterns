package com.world_of_anonymous.design_patterns.creational_design_pattern.factory_design_pattern.howtodoinjava;

public class Luxury extends Car {

  public Luxury() {
    super(CarType.LUXURY);
    construct();
  }

  @Override
  protected void construct() {
    System.out.println("Building Luxury Car!!!");
  }
}
