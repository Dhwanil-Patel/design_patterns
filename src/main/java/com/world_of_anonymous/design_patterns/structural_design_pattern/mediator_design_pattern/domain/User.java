package com.world_of_anonymous.design_patterns.structural_design_pattern.mediator_design_pattern.domain;

import com.world_of_anonymous.design_patterns.structural_design_pattern.mediator_design_pattern.mediator.IChatRoom;

/**
 * Colleague
 */
public abstract class User {

  private IChatRoom mediator;

  private String id;
  private String name;

  public User(IChatRoom mediator, String id, String name) {
    this.mediator = mediator;
    this.id = id;
    this.name = name;
  }

  public IChatRoom getMediator() {
    return mediator;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public abstract void send(String msg, String userId);
  public abstract void receive(String msg);
}
