package com.world_of_anonymous.design_patterns.structural_design_pattern.chainofresponsibility_design_pattern.service.impl;

import com.world_of_anonymous.design_patterns.structural_design_pattern.chainofresponsibility_design_pattern.domain.ServiceRequest;
import com.world_of_anonymous.design_patterns.structural_design_pattern.chainofresponsibility_design_pattern.domain.enumration.ServiceLevel;
import com.world_of_anonymous.design_patterns.structural_design_pattern.chainofresponsibility_design_pattern.service.ISupportService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FrontDeskSupport implements ISupportService {

  private ISupportService next = null;

  @Override
  public void handleRequest(ServiceRequest request) {
    if (request.getServiceLevel() == ServiceLevel.LEVEL_ONE) {
      request.setConclusion("Front desk solved level 1 request!!!");
    } else {
      if (!Objects.isNull(next)) {
        next.handleRequest(request);
      } else {
        throw new IllegalArgumentException("No handler found for :: "+request.getServiceLevel());
      }
    }
  }
}
