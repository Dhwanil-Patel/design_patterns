package com.world_of_anonymous.design_patterns.creational_design_pattern.singleton_design_pattern;

import java.io.*;

public class SingletonDesignPattern {

  static VII_ReadResolve readResolve1 = VII_ReadResolve.getInstance();

  public static void main(String[] args) {
    /**
     * For readResolveMethod()
     */
    try {
      ObjectOutput output = new ObjectOutputStream(new FileOutputStream("filename.ser"));
      output.writeObject(readResolve1);
      output.close();

      readResolve1.setI(20);

      ObjectInput input = new ObjectInputStream(new FileInputStream("filename.ser"));
      VII_ReadResolve readResolve2 = (VII_ReadResolve) input.readObject();
      input.close();

      System.out.println(readResolve1.getI());
      System.out.println(readResolve2.getI());

    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
