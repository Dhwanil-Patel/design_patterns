package com.world_of_anonymous.design_patterns.structural_design_pattern.template_design_pattern.service.impl;

import com.world_of_anonymous.design_patterns.structural_design_pattern.template_design_pattern.service.House;

public class GlassWallHouse extends House {
  @Override
  public void constructWalls() {
    System.out.println("Constructing glass wall for my house.");
  }

  @Override
  public void constructWindows() {
    System.out.println("Constructing windows for glass wall house");
  }

  @Override
  public void constructDoors() {
    System.out.println("Constructing doors for glass wall house");
  }

  @Override
  public void paintHouse() {
    System.out.println("Painting glass wall house");
  }

  @Override
  public void decorateHouse() {
    System.out.println("Decorating glass wall house");
  }
}
