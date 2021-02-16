package com.world_of_anonymous.design_patterns.structural_design_pattern.visitor_design_pattern.visitable;

import com.world_of_anonymous.design_patterns.structural_design_pattern.visitor_design_pattern.visitor.impl.DLinkRouter;
import com.world_of_anonymous.design_patterns.structural_design_pattern.visitor_design_pattern.visitor.impl.LinkSysRouter;
import com.world_of_anonymous.design_patterns.structural_design_pattern.visitor_design_pattern.visitor.impl.TPLinkRouter;

public interface RouterVisitor {
  void visit(DLinkRouter router);
  void visit(TPLinkRouter router);
  void visit(LinkSysRouter router);
}
