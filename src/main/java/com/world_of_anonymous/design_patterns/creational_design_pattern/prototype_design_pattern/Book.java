package com.world_of_anonymous.design_patterns.creational_design_pattern.prototype_design_pattern;

public class Book {
  private int bid;
  private String bname;

  public Book(int bid, String bname) {
    this.bid = bid;
    this.bname = bname;
  }

  public int getBid() {
    return bid;
  }

  public void setBid(int bid) {
    this.bid = bid;
  }

  public String getBname() {
    return bname;
  }

  public void setBname(String bname) {
    this.bname = bname;
  }

  @Override
  public String toString() {
    return "Book{" +
        "bid=" + bid +
        ", bname='" + bname + '\'' +
        '}';
  }
}
