package com.world_of_anonymous.design_patterns.behavioural_design_pattern.bridge_design_pattern.abstraction.impl;

import com.world_of_anonymous.design_patterns.behavioural_design_pattern.bridge_design_pattern.abstraction.service.FileDownloaderAbstraction;
import com.world_of_anonymous.design_patterns.behavioural_design_pattern.bridge_design_pattern.interfaces.service.FileDownloadImplementor;

public class FileDownloaderAbstractionImpl implements FileDownloaderAbstraction {

  private FileDownloadImplementor provider = null;

  public FileDownloaderAbstractionImpl(FileDownloadImplementor provider) {
    super();
    this.provider = provider;
  }

  @Override
  public Object download(String path) {
    return provider.download(path);
  }

  @Override
  public boolean store(Object object) {
    return provider.store(object);
  }
}
