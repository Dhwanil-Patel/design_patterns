package com.world_of_anonymous.design_patterns.creational_design_pattern.factory_design_pattern.howtodoinjava;

public class SmallCar extends Car {
  public SmallCar() {
    super(CarType.SMALL);
    construct();
  }

  @Override
  protected void construct() {
    System.out.println("Building Small Car!!!");
  }
}
