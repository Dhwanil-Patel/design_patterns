package com.world_of_anonymous.design_patterns.creational_design_pattern.prototype_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
  private String shopname;
  private List<Book> books = new ArrayList<Book>();

  public String getShopname() {
    return shopname;
  }

  public void setShopname(String shopname) {
    this.shopname = shopname;
  }

  public List<Book> getBooks() {
    return books;
  }

  public void setBooks(List<Book> books) {
    this.books = books;
  }

  public void loadData() {
    for (int i=1; i<=10; i++) {
      this.books.add(new Book(i, "Book " + i));
    }
  }

  @Override
  protected BookShop clone() throws CloneNotSupportedException {
    BookShop bookShop = new BookShop();
    for (Book book : this.getBooks()) {
      bookShop.getBooks().add(book);
    }
    return bookShop;
  }

  @Override
  public String toString() {
    return "BookShop{" +
        "shopname='" + shopname + '\'' +
        ", books=" + books +
        '}';
  }
}
