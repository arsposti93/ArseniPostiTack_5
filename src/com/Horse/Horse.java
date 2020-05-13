package com.company;

public class Horse implements Movable {

  private String name;
  private int age;

  public Horse(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String toString() {
    return "Лошадь пароды - " + name + ", возраст: " + age + " " + voice();
  }

  @Override
  public void move() {
    System.out.println("When say common");
  }

  @Override
  public void stop() {
    System.out.println("When say stop");
  }

  public String voice() {
    return "IiiiiG0-go-go";
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
