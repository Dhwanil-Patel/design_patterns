package com.world_of_anonymous.design_patterns.creational_design_pattern.factory_design_pattern.howtodoinjava;

public class SedanCar extends Car {

  public SedanCar() {
    super(CarType.SEDAN);
    construct();
  }

  @Override
  protected void construct() {
    System.out.println("Building Sedan Car!!!");
  }
}
