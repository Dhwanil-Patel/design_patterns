package com.world_of_anonymous.design_patterns.creational_design_pattern.factory_design_pattern.howtodoinjava;

public abstract class Car {

  private CarType model = null;

  public Car(CarType model) {
    this.model = model;
  }

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
}
