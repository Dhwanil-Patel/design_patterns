package com.world_of_anonymous.design_patterns.behavioural_design_pattern.adepter_design_pattern;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * Target (OutputStreamWriter / Writer): It defines the application-specific interface that Client uses directly.
 * Adapter (OutputStreamWriter): It adapts the interface Adaptee to the Target interface. It’s middle man.
 * Adaptee (File): It defines an existing incompatible interface that needs adapting before using in application.
 * Client: It is your application that works with Target interface.
 */
public class OutputStreamWriterDemo {
  public static void main(String[] args) throws IOException {
    Writer writer = new OutputStreamWriter(new FileOutputStream("./test.txt"));
    writer.write("Hello to all!!!");
    writer.close();
  }
}
