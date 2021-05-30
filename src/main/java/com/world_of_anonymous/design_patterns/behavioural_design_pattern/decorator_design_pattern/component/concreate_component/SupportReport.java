package com.world_of_anonymous.design_patterns.behavioural_design_pattern.decorator_design_pattern.component.concreate_component;

import com.world_of_anonymous.design_patterns.behavioural_design_pattern.decorator_design_pattern.component.Report;

public class SupportReport implements Report {
  @Override
  public Object[][] getReportData(String reportId) {
    return null;
  }

  @Override
  public String getFirstColumnData() {
    return "Support Data!!!";
  }
}
