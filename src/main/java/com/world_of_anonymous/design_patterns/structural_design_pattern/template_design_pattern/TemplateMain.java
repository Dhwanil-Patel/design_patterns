package com.world_of_anonymous.design_patterns.structural_design_pattern.template_design_pattern;

import com.world_of_anonymous.design_patterns.structural_design_pattern.template_design_pattern.service.House;
import com.world_of_anonymous.design_patterns.structural_design_pattern.template_design_pattern.service.impl.ConcreteWallHouse;
import com.world_of_anonymous.design_patterns.structural_design_pattern.template_design_pattern.service.impl.GlassWallHouse;

public class TemplateMain {
  public static void main(String[] args) {
    System.out.println("**************************************************");
    System.out.println("Going to build Concrete Wall House");
    System.out.println("**************************************************");

    House house = new ConcreteWallHouse();
    house.buildHouse();

    System.out.println("**************************************************");
    System.out.println("Concrete wall house constructed successfully");
    System.out.println("**************************************************");

    System.out.println("**************************************************");
    System.out.println("Going to build Glass Wall House");
    System.out.println("**************************************************");

    house = new GlassWallHouse();
    house.buildHouse();

    System.out.println("**************************************************");
    System.out.println("Glass Wall House constructed successfully");
    System.out.println("**************************************************");
  }
}
