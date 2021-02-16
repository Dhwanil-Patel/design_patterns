package com.world_of_anonymous.design_patterns.structural_design_pattern.iterator_design_pattern.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Topic {

  private String name;

  public Topic(String name) {
    super();
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
