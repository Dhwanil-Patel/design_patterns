package com.world_of_anonymous.design_patterns.behavioural_design_pattern.decorator_design_pattern.decorator;

import com.world_of_anonymous.design_patterns.behavioural_design_pattern.decorator_design_pattern.component.Report;

public class ColumnDecorator implements Report {

  private Report decoratedReport;

  public ColumnDecorator(Report report) {
    this.decoratedReport = report;
  }

  @Override
  public Object[][] getReportData(String reportId) {
    return decoratedReport.getReportData(reportId);
  }

  @Override
  public String getFirstColumnData() {
    return decoratedReport.getFirstColumnData();
  }
}
