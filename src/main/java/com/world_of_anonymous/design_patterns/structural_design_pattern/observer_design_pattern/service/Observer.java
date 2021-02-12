package com.world_of_anonymous.design_patterns.structural_design_pattern.observer_design_pattern.service;

import com.world_of_anonymous.design_patterns.structural_design_pattern.observer_design_pattern.service.domain.Message;

public interface Observer {
  void update(Message message);
}
