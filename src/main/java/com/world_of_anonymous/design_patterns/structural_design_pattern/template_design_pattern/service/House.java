package com.world_of_anonymous.design_patterns.structural_design_pattern.template_design_pattern.service;

/**
 * abstract class House containing template method buildHouse and implementation of steps which is same for all types of houses. Those implementations have been marked as final.
 */
public abstract class House {

  /**
   * This is the template method we are discussing. This method should be final so that other class can't re-implement and change the order of the steps.
   */
  public final void buildHouse() {
    constructBase();
    constructRoof();
    constructWalls();
    constructWindows();
    constructDoors();
    paintHouse();
    decorateHouse();
  }

  // Common for all kind of house
  private final void constructBase() {
    System.out.println("Base has been constructed.");
  }

  // Common for all kind of house
  private final void constructRoof() {
    System.out.println("Roof has been constructed.");
  }

  // Various based on house type
  public abstract void constructWalls();
  public abstract void constructWindows();
  public abstract void constructDoors();
  public abstract void paintHouse();
  public abstract void decorateHouse();
}
