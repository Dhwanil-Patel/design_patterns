package com.world_of_anonymous.design_patterns.structural_design_pattern.observer_design_pattern.service.impl;

import com.world_of_anonymous.design_patterns.structural_design_pattern.observer_design_pattern.service.Observer;
import com.world_of_anonymous.design_patterns.structural_design_pattern.observer_design_pattern.service.domain.Message;

public class ThirdMessageSubscriber implements Observer {
  @Override
  public void update(Message message) {
    System.out.println("Third Message Subscriber : "+message.getMessageContent());
  }
}
