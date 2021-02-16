package com.world_of_anonymous.design_patterns.structural_design_pattern.visitor_design_pattern.visitor;

import com.world_of_anonymous.design_patterns.structural_design_pattern.visitor_design_pattern.visitable.RouterVisitor;

public interface IRouter {
  void sendData(char[] data);
  void acceptData(char[] data);
  void accept(RouterVisitor v);
}
