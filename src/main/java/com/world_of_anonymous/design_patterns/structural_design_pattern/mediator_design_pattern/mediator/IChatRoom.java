package com.world_of_anonymous.design_patterns.structural_design_pattern.mediator_design_pattern.mediator;

import com.world_of_anonymous.design_patterns.structural_design_pattern.mediator_design_pattern.domain.User;

/**
 * Mediator
 */
public interface IChatRoom {
  void sendMessage(String msg, String userId);
  void addUser(User user);
}
