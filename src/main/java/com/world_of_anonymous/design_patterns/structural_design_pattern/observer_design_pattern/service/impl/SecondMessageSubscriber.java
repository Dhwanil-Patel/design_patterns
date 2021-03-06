package com.world_of_anonymous.design_patterns.structural_design_pattern.observer_design_pattern.service.impl;

import com.world_of_anonymous.design_patterns.structural_design_pattern.observer_design_pattern.service.Observer;
import com.world_of_anonymous.design_patterns.structural_design_pattern.observer_design_pattern.service.domain.Message;

public class SecondMessageSubscriber implements Observer {
  @Override
  public void update(Message message) {
    System.out.println("Second Message Subscriber : "+message.getMessageContent());
  }
}
