package com.world_of_anonymous.design_patterns.behavioural_design_pattern.proxy_design_pattern.service.impl;

import com.world_of_anonymous.design_patterns.behavioural_design_pattern.proxy_design_pattern.service.Internet;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

  private Internet internet = new RealInternet();
  private static List<String> bannedSites;
  static {
    bannedSites = new ArrayList<>();
    bannedSites.add("abc.com");
    bannedSites.add("def.com");
    bannedSites.add("ijk.com");
    bannedSites.add("lnm.com");
  }

  @Override
  public void connectTo(String serverHost) {
    if (bannedSites.contains(serverHost.toLowerCase())) {
      throw new RuntimeException("Access Denied!!!");
    }
    internet.connectTo(serverHost);
  }
}
