package com.world_of_anonymous.design_patterns.behavioural_design_pattern.flyweight_design_pattern;

import com.world_of_anonymous.design_patterns.behavioural_design_pattern.flyweight_design_pattern.enumration.BrushSize;
import com.world_of_anonymous.design_patterns.behavioural_design_pattern.flyweight_design_pattern.enumration.Color;
import com.world_of_anonymous.design_patterns.behavioural_design_pattern.flyweight_design_pattern.service.Pen;
import com.world_of_anonymous.design_patterns.behavioural_design_pattern.flyweight_design_pattern.service.PenFactory;

/**
 * Pen   : Actual Entity class
 * Size  : Intrinsic Attribute
 * Color : Extrinsic Attribute
 * FlywayFactory : Provide Pen object based on requirement of extrinsic property.
 */
public class FlyweightMain {
  public static void main(String[] args) {
    Pen yellowThickPen1 = PenFactory.getPenSize(BrushSize.THICK, Color.YELLOW);
    yellowThickPen1.draw("data");
    Pen yellowThickPen2 = PenFactory.getPenSize(BrushSize.THICK, Color.YELLOW);
    yellowThickPen2.draw("data");
    Pen blueThickPen = PenFactory.getPenSize(BrushSize.THICK, Color.BLUE);
    blueThickPen.draw("data");

    System.out.println(yellowThickPen1.hashCode());           // Same hashcode
    System.out.println(yellowThickPen2.hashCode());           // Same hashcode
    System.out.println(blueThickPen.hashCode());
  }
}
