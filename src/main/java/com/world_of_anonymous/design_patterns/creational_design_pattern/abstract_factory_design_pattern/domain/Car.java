package com.world_of_anonymous.design_patterns.creational_design_pattern.abstract_factory_design_pattern.domain;

import com.world_of_anonymous.design_patterns.creational_design_pattern.abstract_factory_design_pattern.enumration.CarType;
import com.world_of_anonymous.design_patterns.creational_design_pattern.abstract_factory_design_pattern.enumration.Location;

public abstract class Car {

  private CarType model = null;

  // Newly added
  private Location location = null;

  public Car(CarType model, Location location) {
    this.model = model;
    this.location = location;
  }
  // End

  public CarType getModel() {
    return model;
  }

  public void setModel(CarType model) {
    this.model = model;
  }

//  // Optional
//  private void arrangeParts() {
//    // Do one time processing here
//  }

  // Do subclass level processing in this method
  protected abstract void construct();

  @Override
  public String toString() {
    return "Car{" +
        "model=" + model +
        ", location=" + location +
        '}';
  }
}
