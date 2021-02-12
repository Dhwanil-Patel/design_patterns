package com.world_of_anonymous.design_patterns.structural_design_pattern.observer_design_pattern.service.impl;

import com.world_of_anonymous.design_patterns.structural_design_pattern.observer_design_pattern.service.Observer;
import com.world_of_anonymous.design_patterns.structural_design_pattern.observer_design_pattern.service.Subject;
import com.world_of_anonymous.design_patterns.structural_design_pattern.observer_design_pattern.service.domain.Message;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {

  @Deprecated
  List<Observer> observers = new ArrayList<>();

  @Override
  public void attach(Observer o) {
    observers.add(o);
  }

  @Override
  public void detach(Observer o) {
    observers.remove(o);
  }

  @Override
  public void notifyObservers(Message message) {
    for (Observer obs : observers) {
      obs.update(message);
    }
  }
}
