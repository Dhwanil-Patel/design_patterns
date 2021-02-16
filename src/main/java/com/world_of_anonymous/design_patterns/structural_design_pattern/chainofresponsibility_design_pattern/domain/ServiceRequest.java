package com.world_of_anonymous.design_patterns.structural_design_pattern.chainofresponsibility_design_pattern.domain;

import com.world_of_anonymous.design_patterns.structural_design_pattern.chainofresponsibility_design_pattern.domain.enumration.ServiceLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceRequest {
    private ServiceLevel serviceLevel;
    private String conclusion = null;
}
