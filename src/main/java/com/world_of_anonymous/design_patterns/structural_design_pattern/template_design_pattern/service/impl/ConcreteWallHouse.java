package com.world_of_anonymous.design_patterns.structural_design_pattern.template_design_pattern.service.impl;

import com.world_of_anonymous.design_patterns.structural_design_pattern.template_design_pattern.service.House;

public class ConcreteWallHouse extends House {

  @Override
  public void constructWalls() {
    System.out.println("Constructing concrete wall for my house.");
  }

  @Override
  public void constructWindows() {
    System.out.println("Constructing windows for concrete wall house");
  }

  @Override
  public void constructDoors() {
    System.out.println("Constructing doors for concrete wall house");
  }

  @Override
  public void paintHouse() {
    System.out.println("Painting concrete wall house");
  }

  @Override
  public void decorateHouse() {
    System.out.println("Decorating concrete wall house");
  }
}
