package com.world_of_anonymous.design_patterns.behavioural_design_pattern.bridge_design_pattern.interfaces.impl;

import com.world_of_anonymous.design_patterns.behavioural_design_pattern.bridge_design_pattern.interfaces.service.FileDownloadImplementor;

public class WindowsFileDownloadImplementorImpl implements FileDownloadImplementor {
  @Override
  public Object download(String path) {
    return new Object();
  }

  @Override
  public boolean store(Object object) {
    System.out.println("File downloaded successfully in WINDOWS !!");
    return true;
  }
}
