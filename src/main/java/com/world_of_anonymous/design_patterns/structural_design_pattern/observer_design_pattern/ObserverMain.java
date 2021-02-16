package com.world_of_anonymous.design_patterns.structural_design_pattern.observer_design_pattern;

import com.world_of_anonymous.design_patterns.structural_design_pattern.observer_design_pattern.service.domain.Message;
import com.world_of_anonymous.design_patterns.structural_design_pattern.observer_design_pattern.service.impl.FirstMessageSubscriber;
import com.world_of_anonymous.design_patterns.structural_design_pattern.observer_design_pattern.service.impl.MessagePublisher;
import com.world_of_anonymous.design_patterns.structural_design_pattern.observer_design_pattern.service.impl.SecondMessageSubscriber;
import com.world_of_anonymous.design_patterns.structural_design_pattern.observer_design_pattern.service.impl.ThirdMessageSubscriber;

public class ObserverMain {
  public static void main(String[] args) {

    FirstMessageSubscriber first = new FirstMessageSubscriber();
    SecondMessageSubscriber second = new SecondMessageSubscriber();
    ThirdMessageSubscriber third = new ThirdMessageSubscriber();

    MessagePublisher publisher = new MessagePublisher();

    publisher.attach(first);
    publisher.attach(second);

    publisher.notifyObservers(new Message("First Message"));

    publisher.detach(second);
    publisher.attach(third);

    publisher.notifyObservers(new Message("Second Message"));
  }
}
