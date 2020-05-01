package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Car implements Movable {

  public EnumCars enumCars;
  private String name;
  private String color;
  private boolean status;
  private int id;
  private LocalDate localDate;

  Car() {}

  Car(EnumCars enumCars) {
    this.enumCars = enumCars;
  }
  public Car(String name, String color, boolean status, int id, EnumCars enumCars,
      LocalDate localDate ) {
    this.name = name;
    this.color = color;
    this.status = status;
    this.id = id;
    this.enumCars = enumCars;
    this.localDate = localDate;
  }

  public abstract void move();

  public abstract void stop();

  public void checkReady() {
    System.out.println("I am ready");
  }

  public String toString() {
    String s1 = "Название машины: " + name + ", " + "цвет: " + color + ", " +
        "cостояние: движется" + ", " + "identification number: " + id + ", " +
        enumCars.getInfo() +", год выпуска: "+ getLocalDate();
    String s2 = "Название машины: " + name + ", " + "цвет: " + color + ", " +
        "cостояние: в покое" + ", " + "identification number: " + id + ", " +
        enumCars.getInfo() +", год выпуска: "+ getLocalDate();
    if (status) {
      return s1;
    } else {
      return s2;
    }
  }

  public void foo(Car car) {
    car.checkReady();
  }

  public String getLocalDate() {
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy");
    return localDate.format(dateTimeFormatter);
  }

  public void setLocalDate (LocalDate localDate) {
    this.localDate = localDate;
  }

  public EnumCars getEnumCars() {
    return enumCars;
  }

  public void setEnumCars(EnumCars enumCars) {
    this.enumCars = enumCars;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}






