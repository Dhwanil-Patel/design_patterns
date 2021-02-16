package com.world_of_anonymous.design_patterns.structural_design_pattern.memento_design_pattern;

import com.world_of_anonymous.design_patterns.structural_design_pattern.memento_design_pattern.domain.Article;
import com.world_of_anonymous.design_patterns.structural_design_pattern.memento_design_pattern.domain.ArticleMemento;

public class MementoMain {
  public static void main(String[] args) {
    Article article = new Article(1, "My article");
    article.setContent("ABC");
    System.out.println(article);

    ArticleMemento memento = article.createMemento();

    article.setContent("PQR");
    System.out.println(article);

    article.restore(memento);
    System.out.println(article);
  }
}
