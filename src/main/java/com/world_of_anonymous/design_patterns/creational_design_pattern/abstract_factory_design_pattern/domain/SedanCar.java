package com.world_of_anonymous.design_patterns.creational_design_pattern.abstract_factory_design_pattern.domain;

import com.world_of_anonymous.design_patterns.creational_design_pattern.abstract_factory_design_pattern.enumration.CarType;
import com.world_of_anonymous.design_patterns.creational_design_pattern.abstract_factory_design_pattern.enumration.Location;

public class SedanCar extends Car {

  public SedanCar(Location location) {
    super(CarType.SEDAN, location);
    construct();
  }

  @Override
  protected void construct() {
    System.out.println("Building Sedan Car!!!");
  }
}
