package com.world_of_anonymous.design_patterns.structural_design_pattern.visitor_design_pattern.visitor.impl;

import com.world_of_anonymous.design_patterns.structural_design_pattern.visitor_design_pattern.visitable.RouterVisitor;
import com.world_of_anonymous.design_patterns.structural_design_pattern.visitor_design_pattern.visitor.IRouter;

public class DLinkRouter implements IRouter {

  @Override
  public void sendData(char[] data) {

  }

  @Override
  public void acceptData(char[] data) {

  }

  @Override
  public void accept(RouterVisitor v) {
    v.visit(this);
  }
}
