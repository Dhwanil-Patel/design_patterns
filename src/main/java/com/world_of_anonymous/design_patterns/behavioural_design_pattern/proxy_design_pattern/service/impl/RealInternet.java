package com.world_of_anonymous.design_patterns.behavioural_design_pattern.proxy_design_pattern.service.impl;

import com.world_of_anonymous.design_patterns.behavioural_design_pattern.proxy_design_pattern.service.Internet;

public class RealInternet implements Internet {
  @Override
  public void connectTo(String serverHost) {
    System.out.println("Connect to : "+serverHost);
  }
}
