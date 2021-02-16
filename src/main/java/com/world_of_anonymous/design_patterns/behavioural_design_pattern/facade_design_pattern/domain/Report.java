package com.world_of_anonymous.design_patterns.behavioural_design_pattern.facade_design_pattern.domain;

import com.world_of_anonymous.design_patterns.behavioural_design_pattern.facade_design_pattern.contents.ReportData;
import com.world_of_anonymous.design_patterns.behavioural_design_pattern.facade_design_pattern.contents.ReportFooter;
import com.world_of_anonymous.design_patterns.behavioural_design_pattern.facade_design_pattern.contents.ReportHeader;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Report {
  private ReportHeader header;
  private ReportData data;
  private ReportFooter footer;

  public void setHeader(ReportHeader header) {
    System.out.println("Setting report header");
    this.header = header;
  }

  public void setData(ReportData data) {
    System.out.println("Setting report data");
    this.data = data;
  }

  public void setFooter(ReportFooter footer) {
    System.out.println("Setting report footer");
    this.footer = footer;
  }
}
