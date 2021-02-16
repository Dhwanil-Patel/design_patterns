package com.world_of_anonymous.design_patterns.creational_design_pattern.prototype_design_pattern;

public class BookShopDemo {
  public static void main(String[] args) throws CloneNotSupportedException {
    BookShop bookShop = new BookShop();
    bookShop.setShopname("Novelty");
    bookShop.loadData();
    bookShop.getBooks().remove(2);
    System.out.println(bookShop);

    BookShop bs = (BookShop) bookShop.clone();// new BookShop();
    bs.setShopname("Creativity");
    System.out.println(bs);
  }
}
