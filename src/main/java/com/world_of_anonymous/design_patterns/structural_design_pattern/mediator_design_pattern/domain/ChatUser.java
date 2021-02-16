package com.world_of_anonymous.design_patterns.structural_design_pattern.mediator_design_pattern.domain;

import com.world_of_anonymous.design_patterns.structural_design_pattern.mediator_design_pattern.mediator.IChatRoom;

/**
 * Concrete Colleague
 */
public class ChatUser extends User {

  public ChatUser(IChatRoom mediator, String id, String name) {
    super(mediator, id, name);
  }

  @Override
  public void send(String msg, String userId) {
    System.out.println(this.getName() + " :: sending message : "+msg);
    getMediator().sendMessage(msg, userId);
  }

  @Override
  public void receive(String msg) {
    System.out.println(this.getName() + " :: receive message : "+msg);
  }
}
