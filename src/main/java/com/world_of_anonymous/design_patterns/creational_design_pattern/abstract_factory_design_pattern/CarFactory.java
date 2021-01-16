package com.world_of_anonymous.design_patterns.creational_design_pattern.abstract_factory_design_pattern;

import com.world_of_anonymous.design_patterns.creational_design_pattern.abstract_factory_design_pattern.FactoryLocation.AsiaFactory;
import com.world_of_anonymous.design_patterns.creational_design_pattern.abstract_factory_design_pattern.FactoryLocation.DefaultFactory;
import com.world_of_anonymous.design_patterns.creational_design_pattern.abstract_factory_design_pattern.FactoryLocation.USAFactory;
import com.world_of_anonymous.design_patterns.creational_design_pattern.abstract_factory_design_pattern.domain.Car;
import com.world_of_anonymous.design_patterns.creational_design_pattern.abstract_factory_design_pattern.enumration.CarType;
import com.world_of_anonymous.design_patterns.creational_design_pattern.abstract_factory_design_pattern.enumration.Location;

public class CarFactory {
  public static Car buildCar(CarType carType) {
    Car car = null;
    // Newly Added
    Location location = Location.ASIA;
    // End
    switch (location) {
      case DEFAULT:
        car = DefaultFactory.buildCar(carType);
        return car;
      case USA:
        car = USAFactory.buildCar(carType);
        return car;
      case ASIA:
        car = AsiaFactory.buildCar(carType);
        return car;
      default:
        break;
    }
    return car;
  }
}
