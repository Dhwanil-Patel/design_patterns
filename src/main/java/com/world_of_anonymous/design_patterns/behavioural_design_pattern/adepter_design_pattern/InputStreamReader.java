package com.world_of_anonymous.design_patterns.behavioural_design_pattern.adepter_design_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Target (BufferedReader): It defines the application-specific interface that Client uses directly.
 * Adapter (InputStreamReader): It adapts the interface Adaptee to the Target interface. It’s middle man.
 * Adaptee (System.in): It defines an existing incompatible interface that needs adapting before using in application.
 * Client: It is your application that works with Target interface.
 */
public class InputStreamReader {
  public static void main(String[] args) throws IOException {
//    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//    System.out.println("Enter String :");
//    String str = reader.readLine();
//    System.out.println("Result :"+ str);
  }
}

