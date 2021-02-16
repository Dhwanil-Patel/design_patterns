package com.world_of_anonymous.design_patterns.structural_design_pattern.iterator_design_pattern.config;

public interface Iterator<E> {
  void reset();
  boolean hasNext();
  E currentItem();
  E next();
}
