package com.world_of_anonymous.design_patterns.behavioural_design_pattern.flyweight_design_pattern.domain;

import com.world_of_anonymous.design_patterns.behavioural_design_pattern.flyweight_design_pattern.enumration.BrushSize;
import com.world_of_anonymous.design_patterns.behavioural_design_pattern.flyweight_design_pattern.enumration.Color;
import com.world_of_anonymous.design_patterns.behavioural_design_pattern.flyweight_design_pattern.service.Pen;

public class ThinPen implements Pen {

  final BrushSize brushSize = BrushSize.THIN;            // Intrinsic Attribute
  private Color color;                                    // Extrinsic Attribute

  public void setColor(Color color) {
    this.color = color;
  }

  @Override
  public void draw(String content) {
    System.out.println("Draw thick content " +content+ " in color : " +color);
  }
}
