package com.world_of_anonymous.design_patterns.creational_design_pattern.singleton_design_pattern;

import java.io.Serializable;

/**
 * Let’s say your application is distributed and it frequently serializes objects into the file system,
 * only to read them later when required. Please note that de-serialization always creates a new instance.
 *
 * Initial call define in main class display two values means more then one object exist.
 * To solve above issue, we need to include a readResolve() method in our class. This method will be invoked when you will de-serialize the object.
 * Inside of this method, you must return the existing instance to ensure a single instance application wide.
 */
public class VII_ReadResolve implements Serializable {

  private static final long serialVersionUID = 1L;

  private static volatile VII_ReadResolve INSTANCE = null;
  public static VII_ReadResolve getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new VII_ReadResolve();
    }
    return INSTANCE;
  }

  protected Object readResolve() {
    return INSTANCE;
  }

  private int i = 10;

  public int getI() {
    return i;
  }

  public void setI(int i) {
    this.i = i;
  }
}
