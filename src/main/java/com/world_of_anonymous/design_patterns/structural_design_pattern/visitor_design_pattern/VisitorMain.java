package com.world_of_anonymous.design_patterns.structural_design_pattern.visitor_design_pattern;

import com.world_of_anonymous.design_patterns.structural_design_pattern.visitor_design_pattern.visitable.impl.LinuxConfigurator;
import com.world_of_anonymous.design_patterns.structural_design_pattern.visitor_design_pattern.visitable.impl.MacConfigurator;
import com.world_of_anonymous.design_patterns.structural_design_pattern.visitor_design_pattern.visitor.impl.DLinkRouter;
import com.world_of_anonymous.design_patterns.structural_design_pattern.visitor_design_pattern.visitor.impl.LinkSysRouter;
import com.world_of_anonymous.design_patterns.structural_design_pattern.visitor_design_pattern.visitor.impl.TPLinkRouter;

public class VisitorMain {

  private static MacConfigurator macConfigurator;
  private static LinuxConfigurator linuxConfigurator;
  private static DLinkRouter dLinkRouter;
  private static TPLinkRouter tpLinkRouter;
  private static LinkSysRouter linkSysRouter;

  private static void setup() {
    macConfigurator = new MacConfigurator();
    linuxConfigurator = new LinuxConfigurator();
    dLinkRouter = new DLinkRouter();
    tpLinkRouter = new TPLinkRouter();
    linkSysRouter = new LinkSysRouter();
  }

  private static void testDLink() {
    dLinkRouter.accept(macConfigurator);
    dLinkRouter.accept(linuxConfigurator);
  }

  private static void testTPLink() {
    tpLinkRouter.accept(macConfigurator);
    tpLinkRouter.accept(linuxConfigurator);
  }

  private static void testlinkSys() {
    linkSysRouter.accept(macConfigurator);
    linkSysRouter.accept(linuxConfigurator);
  }

  public static void main(String[] args) {
    setup();
    testDLink();
    testTPLink();
    testlinkSys();
  }
}
