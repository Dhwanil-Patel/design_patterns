package com.world_of_anonymous.design_patterns.behavioural_design_pattern.bridge_design_pattern;

import com.world_of_anonymous.design_patterns.behavioural_design_pattern.bridge_design_pattern.abstraction.impl.FileDownloaderAbstractionImpl;
import com.world_of_anonymous.design_patterns.behavioural_design_pattern.bridge_design_pattern.abstraction.service.FileDownloaderAbstraction;
import com.world_of_anonymous.design_patterns.behavioural_design_pattern.bridge_design_pattern.interfaces.impl.LinuxFileDownloadImplementorImpl;
import com.world_of_anonymous.design_patterns.behavioural_design_pattern.bridge_design_pattern.interfaces.impl.WindowsFileDownloadImplementorImpl;
import com.world_of_anonymous.design_patterns.behavioural_design_pattern.bridge_design_pattern.interfaces.service.FileDownloadImplementor;

public class FileProcessingBuilderMain {
  public static void main(String[] args) {
    String os = "linux";
    FileDownloaderAbstraction downloader = null;
    FileDownloadImplementor implementor = null;
    switch (os) {
      case "windows":
        implementor = new WindowsFileDownloadImplementorImpl();
        downloader = new FileDownloaderAbstractionImpl(implementor);
        break;
      case "linux":
        implementor = new LinuxFileDownloadImplementorImpl();
        downloader = new FileDownloaderAbstractionImpl(implementor);
        break;
      default:
        System.out.println("OS not supported!!!");
        break;
    }

    Object fileContent = downloader.download("./test.txt");
    downloader.store(fileContent);
  }
}
