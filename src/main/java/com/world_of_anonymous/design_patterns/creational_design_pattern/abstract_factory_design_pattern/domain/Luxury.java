package com.world_of_anonymous.design_patterns.creational_design_pattern.abstract_factory_design_pattern.domain;

import com.world_of_anonymous.design_patterns.creational_design_pattern.abstract_factory_design_pattern.enumration.CarType;
import com.world_of_anonymous.design_patterns.creational_design_pattern.abstract_factory_design_pattern.enumration.Location;

public class Luxury extends Car {

  public Luxury(Location location) {
    super(CarType.LUXURY, location);
    construct();
  }

  @Override
  protected void construct() {
    System.out.println("Building Luxury Car!!!");
  }
}
