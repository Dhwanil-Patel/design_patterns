package com.world_of_anonymous.design_patterns.structural_design_pattern.visitor_design_pattern.visitable.impl;

import com.world_of_anonymous.design_patterns.structural_design_pattern.visitor_design_pattern.visitable.RouterVisitor;
import com.world_of_anonymous.design_patterns.structural_design_pattern.visitor_design_pattern.visitor.impl.DLinkRouter;
import com.world_of_anonymous.design_patterns.structural_design_pattern.visitor_design_pattern.visitor.impl.LinkSysRouter;
import com.world_of_anonymous.design_patterns.structural_design_pattern.visitor_design_pattern.visitor.impl.TPLinkRouter;

public class LinuxConfigurator implements RouterVisitor {
  @Override
  public void visit(DLinkRouter router) {
    System.out.println("DLinkRouter Configuration for Linux complete !!");
  }

  @Override
  public void visit(TPLinkRouter router) {
    System.out.println("TPLinkRouter Configuration for Linux complete !!");
  }

  @Override
  public void visit(LinkSysRouter router) {
    System.out.println("LinkSysRouter Configuration for Linux complete !!");
  }
}
