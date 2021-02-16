package com.world_of_anonymous.design_patterns.behavioural_design_pattern.flyweight_design_pattern.service;


import com.world_of_anonymous.design_patterns.behavioural_design_pattern.flyweight_design_pattern.enumration.Color;

public interface Pen {
  void setColor(Color color);
  void draw(String content);
}
