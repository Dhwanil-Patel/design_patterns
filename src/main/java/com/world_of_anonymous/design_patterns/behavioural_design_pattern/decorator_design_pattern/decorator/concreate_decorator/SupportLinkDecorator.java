package com.world_of_anonymous.design_patterns.behavioural_design_pattern.decorator_design_pattern.decorator.concreate_decorator;

import com.world_of_anonymous.design_patterns.behavioural_design_pattern.decorator_design_pattern.decorator.ColumnDecorator;
import com.world_of_anonymous.design_patterns.behavioural_design_pattern.decorator_design_pattern.component.Report;

public class SupportLinkDecorator extends ColumnDecorator {
  public SupportLinkDecorator(Report report) {
    super(report);
  }

  public String getFirstColumnData() {
    return addMoreInfo(super.getFirstColumnData());
  }

  private String addMoreInfo(String data) {
    return data + " - support link - ";
  }
}
