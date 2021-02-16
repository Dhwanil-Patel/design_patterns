package com.world_of_anonymous.design_patterns.behavioural_design_pattern.composite_design_pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Composite<E> {
  private int id;
  private String name;
  private List<E> list;
}
