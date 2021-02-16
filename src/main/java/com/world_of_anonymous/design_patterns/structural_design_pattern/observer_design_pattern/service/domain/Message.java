package com.world_of_anonymous.design_patterns.structural_design_pattern.observer_design_pattern.service.domain;

public class Message {
  final String messageContent;

  public Message(String message) {
    this.messageContent = message;
  }

  public String getMessageContent() {
    return messageContent;
  }
}
