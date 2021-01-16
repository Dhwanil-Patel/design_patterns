package com.world_of_anonymous.design_patterns.creational_design_pattern.factory_design_pattern.howtodoinjava;

public class CarFacrotyMain {
  public static void main(String[] args) {
    System.out.println(CarFactory.buildCar(CarType.SMALL));
    System.out.println(CarFactory.buildCar(CarType.SEDAN));
    System.out.println(CarFactory.buildCar(CarType.LUXURY));
  }
}
