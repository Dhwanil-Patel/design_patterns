package com.world_of_anonymous.design_patterns.behavioural_design_pattern.decorator_design_pattern.decorator;

import com.world_of_anonymous.design_patterns.behavioural_design_pattern.decorator_design_pattern.component.Report;

public class ClientDecorator implements Report {

  private Report clientReport;

  public ClientDecorator(Report clientReport) {
    this.clientReport = clientReport;
  }

  @Override
  public Object[][] getReportData(String reportId) {
    return null;
  }

  @Override
  public String getFirstColumnData() {
    return clientReport.getFirstColumnData() + " - client decorator";
  }
}
