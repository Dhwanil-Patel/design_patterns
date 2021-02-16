package com.world_of_anonymous.design_patterns.structural_design_pattern.iterator_design_pattern;

import com.world_of_anonymous.design_patterns.structural_design_pattern.iterator_design_pattern.config.Iterator;
import com.world_of_anonymous.design_patterns.structural_design_pattern.iterator_design_pattern.config.List;
import com.world_of_anonymous.design_patterns.structural_design_pattern.iterator_design_pattern.domain.Topic;
import com.world_of_anonymous.design_patterns.structural_design_pattern.iterator_design_pattern.service.TopicList;

public class IteratorMain {
  public static void main(String[] args) {
    Topic[] topics = new Topic[5];
    topics[0] = new Topic("topic1");
    topics[1] = new Topic("topic2");
    topics[2] = new Topic("topic3");
    topics[3] = new Topic("topic4");
    topics[4] = new Topic("topic5");

    List<Topic> list = new TopicList(topics);
    Iterator<Topic> topicIterator = list.iterator();

    while (topicIterator.hasNext()) {
      Topic currTopic = topicIterator.next();
      System.out.println(currTopic.getName());
    }
  }
}
