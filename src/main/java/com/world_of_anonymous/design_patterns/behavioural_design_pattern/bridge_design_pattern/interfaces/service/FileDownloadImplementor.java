package com.world_of_anonymous.design_patterns.behavioural_design_pattern.bridge_design_pattern.interfaces.service;

public interface FileDownloadImplementor {
  Object download(String path);
  boolean store(Object object);
}
