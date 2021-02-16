package com.world_of_anonymous.design_patterns.structural_design_pattern.chainofresponsibility_design_pattern.service.impl;

import com.world_of_anonymous.design_patterns.structural_design_pattern.chainofresponsibility_design_pattern.domain.ServiceRequest;
import com.world_of_anonymous.design_patterns.structural_design_pattern.chainofresponsibility_design_pattern.service.ISupportService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SupportService implements ISupportService {

  private ISupportService handler = null;

  @Override
  public void handleRequest(ServiceRequest request) {
    handler.handleRequest(request);
  }
}
