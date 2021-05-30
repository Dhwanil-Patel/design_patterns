package com.world_of_anonymous.design_patterns.behavioural_design_pattern.decorator_design_pattern.decorator.concreate_decorator;

import com.world_of_anonymous.design_patterns.behavioural_design_pattern.decorator_design_pattern.component.Report;
import com.world_of_anonymous.design_patterns.behavioural_design_pattern.decorator_design_pattern.decorator.ColumnDecorator;

public class SupportPopupDecorator extends ColumnDecorator {

  public SupportPopupDecorator(Report report) {
    super(report);
  }

  public String getFirstColumnData() {
    return addPopup(super.getFirstColumnData());
  }

  public String addPopup(String data) {
    return data + " - support popup - ";
  }
}
