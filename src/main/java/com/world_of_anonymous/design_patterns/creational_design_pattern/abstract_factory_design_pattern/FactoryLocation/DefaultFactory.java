package com.world_of_anonymous.design_patterns.creational_design_pattern.abstract_factory_design_pattern.FactoryLocation;

import com.world_of_anonymous.design_patterns.creational_design_pattern.abstract_factory_design_pattern.domain.Luxury;
import com.world_of_anonymous.design_patterns.creational_design_pattern.abstract_factory_design_pattern.domain.SedanCar;
import com.world_of_anonymous.design_patterns.creational_design_pattern.abstract_factory_design_pattern.domain.SmallCar;
import com.world_of_anonymous.design_patterns.creational_design_pattern.abstract_factory_design_pattern.domain.Car;
import com.world_of_anonymous.design_patterns.creational_design_pattern.abstract_factory_design_pattern.enumration.CarType;
import com.world_of_anonymous.design_patterns.creational_design_pattern.abstract_factory_design_pattern.enumration.Location;

public class DefaultFactory {
  public static Car buildCar(CarType carType) {
    Car car = null;
    switch (carType) {
      case SMALL:
        car = new SmallCar(Location.DEFAULT);
        return car;
      case SEDAN:
        car = new SedanCar(Location.DEFAULT);
        return car;
      case LUXURY:
        car = new Luxury(Location.DEFAULT);
        return car;
      default:
        break;
    }
    return car;
  }
}
