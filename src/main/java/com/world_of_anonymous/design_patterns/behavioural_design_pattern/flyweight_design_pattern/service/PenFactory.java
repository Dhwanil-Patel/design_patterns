package com.world_of_anonymous.design_patterns.behavioural_design_pattern.flyweight_design_pattern.service;

import java.util.HashMap;
import java.util.Map;

import com.world_of_anonymous.design_patterns.behavioural_design_pattern.flyweight_design_pattern.domain.ThickPen;
import com.world_of_anonymous.design_patterns.behavioural_design_pattern.flyweight_design_pattern.domain.ThinPen;
import com.world_of_anonymous.design_patterns.behavioural_design_pattern.flyweight_design_pattern.enumration.BrushSize;
import com.world_of_anonymous.design_patterns.behavioural_design_pattern.flyweight_design_pattern.enumration.Color;

public class PenFactory {

  private static final Map<String, Pen> pensMap = new HashMap<String, Pen>();

  public static Pen getPenSize(BrushSize size, Color color) {

    String key = color.name() + "-" + size.name();
    Pen pen = pensMap.get(key);

    if (pen==null) {
      switch (size.toString()) {
        case "THICK":
          pen = new ThickPen();
          break;

        case "THIN":
          pen = new ThinPen();
          break;
      }
      pen.setColor(color);
      pensMap.put(key, pen);
    }
    return pen;
  }
}
