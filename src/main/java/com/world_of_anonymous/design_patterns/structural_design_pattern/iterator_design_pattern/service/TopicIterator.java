package com.world_of_anonymous.design_patterns.structural_design_pattern.iterator_design_pattern.service;

import com.world_of_anonymous.design_patterns.structural_design_pattern.iterator_design_pattern.config.Iterator;
import com.world_of_anonymous.design_patterns.structural_design_pattern.iterator_design_pattern.domain.Topic;

public class TopicIterator implements Iterator<Topic> {

  private Topic[] topics;
  private int position;

  public TopicIterator(Topic[] topics) {
    this.topics = topics;
    this.position = 0;
  }

  @Override
  public void reset() {
    position = 0;
  }

  @Override
  public boolean hasNext() {
    if (position < topics.length) {
      return true;
    }
    return false;
  }

  @Override
  public Topic currentItem() {
    return topics[position];
  }

  @Override
  public Topic next() {
    return topics[position++];
  }
}
