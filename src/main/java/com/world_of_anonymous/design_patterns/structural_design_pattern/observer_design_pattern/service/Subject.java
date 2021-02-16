package com.world_of_anonymous.design_patterns.structural_design_pattern.observer_design_pattern.service;

import com.world_of_anonymous.design_patterns.structural_design_pattern.observer_design_pattern.service.domain.Message;

public interface Subject {
  void attach(Observer o);
  void detach(Observer o);
  void notifyObservers(Message message);
}
