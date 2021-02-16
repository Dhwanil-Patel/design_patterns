package com.world_of_anonymous.design_patterns.structural_design_pattern.mediator_design_pattern.mediator;


import com.world_of_anonymous.design_patterns.structural_design_pattern.mediator_design_pattern.domain.User;

import java.util.HashMap;
import java.util.Map;

/**
 * ConcreteMediator
 */
public class ChatRoom implements IChatRoom {

  private Map<String, User> userMap = new HashMap<>();

  @Override
  public void sendMessage(String msg, String userId) {
    User u = userMap.get(userId);
    u.receive(msg);
  }

  @Override
  public void addUser(User user) {
    this.userMap.put(user.getId(), user);
  }
}
