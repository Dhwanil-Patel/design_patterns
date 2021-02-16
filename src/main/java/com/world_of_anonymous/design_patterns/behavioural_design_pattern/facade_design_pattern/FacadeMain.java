package com.world_of_anonymous.design_patterns.behavioural_design_pattern.facade_design_pattern;

import com.world_of_anonymous.design_patterns.behavioural_design_pattern.facade_design_pattern.config.ReportGeneratorFacade;
import com.world_of_anonymous.design_patterns.behavioural_design_pattern.facade_design_pattern.domain.ReportType;

import java.util.Collections;

public class FacadeMain {
  public static void main(String[] args) {
    ReportGeneratorFacade facade = new ReportGeneratorFacade();
    facade.generateReport(ReportType.PDF, Collections.EMPTY_MAP);
  }
}
