package com.world_of_anonymous.design_patterns.behavioural_design_pattern.facade_design_pattern.config;

import com.world_of_anonymous.design_patterns.behavioural_design_pattern.facade_design_pattern.contents.ReportData;
import com.world_of_anonymous.design_patterns.behavioural_design_pattern.facade_design_pattern.contents.ReportFooter;
import com.world_of_anonymous.design_patterns.behavioural_design_pattern.facade_design_pattern.contents.ReportHeader;
import com.world_of_anonymous.design_patterns.behavioural_design_pattern.facade_design_pattern.domain.Report;
import com.world_of_anonymous.design_patterns.behavioural_design_pattern.facade_design_pattern.domain.ReportType;
import com.world_of_anonymous.design_patterns.behavioural_design_pattern.facade_design_pattern.service.ReportWriter;

import java.util.Map;

public class ReportGeneratorFacade {
  public void generateReport(ReportType reportType, Map<String, String> data) {
    if ((reportType == null)) { //  || (data.size() <=0 )
      throw new RuntimeException("Invalid Data!!!");
    }

    Report report = new Report();
    report.setHeader(new ReportHeader());
    report.setData(new ReportData(data));
    report.setFooter(new ReportFooter());

    ReportWriter writer = new ReportWriter();
    switch (reportType) {

      case HTML:
        writer.writeHTMLReport(report);
        break;

      case PDF:
        writer.writePDFReport(report);
        break;

      default:
        throw new RuntimeException("Invalid Data!!!");
    }
  }
}
