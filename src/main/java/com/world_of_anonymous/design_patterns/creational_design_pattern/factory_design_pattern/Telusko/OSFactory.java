package com.world_of_anonymous.design_patterns.creational_design_pattern.factory_design_pattern.Telusko;

public class OSFactory {
  public OS getInstance(String str) {
    OS os = null;
    switch (str) {
      case "windows":
        os = new WindowsOS();
        break;

      case "unix":
        os = new UnixOS();
        break;

      case "mac":
        os = new MacOS();
        break;

      default:
        break;
    }
    return os;
  }
}
