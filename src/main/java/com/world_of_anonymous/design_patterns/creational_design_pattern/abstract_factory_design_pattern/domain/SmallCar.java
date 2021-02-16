package com.world_of_anonymous.design_patterns.creational_design_pattern.abstract_factory_design_pattern.domain;

import com.world_of_anonymous.design_patterns.creational_design_pattern.abstract_factory_design_pattern.enumration.CarType;
import com.world_of_anonymous.design_patterns.creational_design_pattern.abstract_factory_design_pattern.enumration.Location;

public class SmallCar extends Car {
  public SmallCar(Location location) {
    super(CarType.SMALL, location);
    construct();
  }

  @Override
  protected void construct() {
    System.out.println("Building Small Car!!!");
  }
}
