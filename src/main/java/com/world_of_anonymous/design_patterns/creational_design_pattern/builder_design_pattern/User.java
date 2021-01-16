package com.world_of_anonymous.design_patterns.creational_design_pattern.builder_design_pattern;

public class User {
  private final String firstname;         // Required
  private final String lastname;          // Required
  private int age;                        // Optional
  private String phone;                   // Optional
  private String address;                 // Optional

  public User(UserBuilder userBuilder) {
    this.firstname = userBuilder.firstname;
    this.lastname = userBuilder.lastname;
    this.age = userBuilder.age;
    this.phone = userBuilder.phone;
    this.address = userBuilder.address;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public int getAge() {
    return age;
  }

  public String getPhone() {
    return phone;
  }

  public String getAddress() {
    return address;
  }

  @Override
  public String toString() {
    return "User{" +
        "firstname='" + firstname + '\'' +
        ", lastname='" + lastname + '\'' +
        ", age=" + age +
        ", phone='" + phone + '\'' +
        ", address='" + address + '\'' +
        '}';
  }

  /**
   * Nested Class
   */

  public static class UserBuilder {
    private final String firstname;
    private final String lastname;
    private int age;
    private String phone;
    private String address;

    public UserBuilder(String firstname, String lastname) {
      this.firstname = firstname;
      this.lastname = lastname;
    }

    public UserBuilder age(int age) {
      this.age = age;
      return this;
    }

    public UserBuilder phone(String phone) {
      this.phone = phone;
      return this;
    }

    public UserBuilder address(String address) {
      this.address = address;
      return this;
    }

    public User build() {
      User user = new User(this);
      return user;
    }
  }
}
