package com.world_of_anonymous.design_patterns.behavioural_design_pattern.bridge_design_pattern.abstraction.service;

public interface FileDownloaderAbstraction {
  Object download(String path);
  boolean store(Object object);
}
