package com.world_of_anonymous.design_patterns.behavioural_design_pattern.decorator_design_pattern.component;

public interface Report {
  Object[][] getReportData(final String reportId);
  String getFirstColumnData();
}
