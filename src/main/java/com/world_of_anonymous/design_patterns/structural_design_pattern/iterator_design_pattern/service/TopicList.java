package com.world_of_anonymous.design_patterns.structural_design_pattern.iterator_design_pattern.service;

import com.world_of_anonymous.design_patterns.structural_design_pattern.iterator_design_pattern.config.Iterator;
import com.world_of_anonymous.design_patterns.structural_design_pattern.iterator_design_pattern.config.List;
import com.world_of_anonymous.design_patterns.structural_design_pattern.iterator_design_pattern.domain.Topic;

public class TopicList implements List<Topic> {

  private Topic[] topics;

  public TopicList(Topic[] topics) {
    this.topics = topics;
  }


  @Override
  public Iterator<Topic> iterator() {
    return new TopicIterator(topics);
  }
}
