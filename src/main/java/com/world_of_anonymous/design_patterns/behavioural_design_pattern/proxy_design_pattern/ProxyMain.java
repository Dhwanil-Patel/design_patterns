package com.world_of_anonymous.design_patterns.behavioural_design_pattern.proxy_design_pattern;

import com.world_of_anonymous.design_patterns.behavioural_design_pattern.proxy_design_pattern.service.Internet;
import com.world_of_anonymous.design_patterns.behavioural_design_pattern.proxy_design_pattern.service.impl.ProxyInternet;

public class ProxyMain {
  public static void main(String[] args) {
    Internet internet = new ProxyInternet();
    try {
      internet.connectTo("xyz.com");
      internet.connectTo("abc.com");
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
  }
}
