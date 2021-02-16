package com.world_of_anonymous.design_patterns.structural_design_pattern.mediator_design_pattern;

import com.world_of_anonymous.design_patterns.structural_design_pattern.mediator_design_pattern.domain.ChatUser;
import com.world_of_anonymous.design_patterns.structural_design_pattern.mediator_design_pattern.domain.User;
import com.world_of_anonymous.design_patterns.structural_design_pattern.mediator_design_pattern.mediator.ChatRoom;
import com.world_of_anonymous.design_patterns.structural_design_pattern.mediator_design_pattern.mediator.IChatRoom;

public class MediatorMain {
  public static void main(String[] args) {
    IChatRoom chatroom = new ChatRoom();

    User user1 = new ChatUser(chatroom,"1", "Alex");
    User user2 = new ChatUser(chatroom,"2", "Brian");
    User user3 = new ChatUser(chatroom,"3", "Charles");
    User user4 = new ChatUser(chatroom,"4", "David");

    chatroom.addUser(user1);
    chatroom.addUser(user2);
    chatroom.addUser(user3);
    chatroom.addUser(user4);

    user1.send("Hi, Brian", user2.getId());
    user1.send("Hi, Charles", user3.getId());
    user4.send("Hi, Alax", user1.getId());
    user3.send("Hi, Alax by Charles", user1.getId());

  }
}
