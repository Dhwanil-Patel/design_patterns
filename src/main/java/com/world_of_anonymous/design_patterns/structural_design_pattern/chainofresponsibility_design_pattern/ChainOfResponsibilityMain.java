package com.world_of_anonymous.design_patterns.structural_design_pattern.chainofresponsibility_design_pattern;

import com.world_of_anonymous.design_patterns.structural_design_pattern.chainofresponsibility_design_pattern.domain.ServiceRequest;
import com.world_of_anonymous.design_patterns.structural_design_pattern.chainofresponsibility_design_pattern.domain.enumration.ServiceLevel;
import com.world_of_anonymous.design_patterns.structural_design_pattern.chainofresponsibility_design_pattern.service.impl.SupportService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ChainOfResponsibilityMain {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("./applicationConfig.xml");
    SupportService service = (SupportService) context.getBean("supportService");

    ServiceRequest request = new ServiceRequest();
    request.setServiceLevel(ServiceLevel.LEVEL_ONE);
    service.handleRequest(request);
    System.out.println(request.getConclusion());

    request = new ServiceRequest();
    request.setServiceLevel(ServiceLevel.LEVEL_THREE);
    service.handleRequest(request);
    System.out.println(request.getConclusion());

    request = new ServiceRequest();
    request.setServiceLevel(ServiceLevel.INVALID_REQUEST);
    service.handleRequest(request);
    System.out.println(request.getConclusion());
  }
}
