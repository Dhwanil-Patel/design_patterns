package com.world_of_anonymous.design_patterns.structural_design_pattern.memento_design_pattern.domain;

public class Article {
  private long id;
  private String title;
  private String content;

  public Article() {
  }

  public Article(long id, String title) {
    super();
    this.id = id;
    this.title = title;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public ArticleMemento createMemento() {
    ArticleMemento memento = new ArticleMemento(id, title, content);
    return memento;
  }

  public void restore(ArticleMemento memento) {
    this.id = memento.getId();
    this.title = memento.getTitle();
    this.content = memento.getContent();
  }

  @Override
  public String toString() {
    return "Article{" +
        "id=" + id +
        ", title='" + title + '\'' +
        ", content='" + content + '\'' +
        '}';
  }
}
