package com.world_of_anonymous.design_patterns.structural_design_pattern.chainofresponsibility_design_pattern.service;

import com.world_of_anonymous.design_patterns.structural_design_pattern.chainofresponsibility_design_pattern.domain.ServiceRequest;

public interface ISupportService {
  void handleRequest(ServiceRequest request);
}
