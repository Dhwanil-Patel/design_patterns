package com.world_of_anonymous.design_patterns.creational_design_pattern.abstract_factory_design_pattern;

import com.world_of_anonymous.design_patterns.creational_design_pattern.abstract_factory_design_pattern.enumration.CarType;

public class AbstractCarFacrotyMain {
  public static void main(String[] args) {
    System.out.println(CarFactory.buildCar(CarType.SMALL));
    System.out.println(CarFactory.buildCar(CarType.SEDAN));
    System.out.println(CarFactory.buildCar(CarType.LUXURY));
  }
}
