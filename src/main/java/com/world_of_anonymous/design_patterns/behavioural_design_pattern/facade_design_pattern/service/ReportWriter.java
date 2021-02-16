package com.world_of_anonymous.design_patterns.behavioural_design_pattern.facade_design_pattern.service;

import com.world_of_anonymous.design_patterns.behavioural_design_pattern.facade_design_pattern.domain.Report;

public class ReportWriter {
  public void writeHTMLReport(Report report) {
    System.out.println("HTML Report");
  }
  public void writePDFReport(Report report) {
    System.out.println("PDF Report");
  }
}
