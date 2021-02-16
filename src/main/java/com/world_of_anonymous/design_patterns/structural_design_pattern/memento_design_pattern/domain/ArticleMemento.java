package com.world_of_anonymous.design_patterns.structural_design_pattern.memento_design_pattern.domain;

public class ArticleMemento {
  private final long id;
  private final String title;
  private final String content;

  public ArticleMemento(long id, String title, String content) {
    super();
    this.id = id;
    this.title = title;
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getContent() {
    return content;
  }
}
