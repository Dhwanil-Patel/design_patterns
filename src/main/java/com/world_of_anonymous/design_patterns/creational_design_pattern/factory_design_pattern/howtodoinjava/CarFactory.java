package com.world_of_anonymous.design_patterns.creational_design_pattern.factory_design_pattern.howtodoinjava;

public class CarFactory {
  public static Car buildCar(CarType carType) {
    Car car = null;
    switch (carType) {
      case SMALL:
        car = new SmallCar();
        return car;
      case SEDAN:
        car = new SedanCar();
        return car;
      case LUXURY:
        car = new Luxury();
        return car;
      default:
        break;
    }
    return car;
  }
}
