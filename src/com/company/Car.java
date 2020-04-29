package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Car implements Movable  {

  private String name;
  private String color;
  private boolean status;
  public EnumCars enumCars;
  private int id;
  private String s1;
  private String s2;


Car (EnumCars enumCars) {
  this.enumCars =enumCars;
}

  Car () {}


  public Car (String name,  String color, boolean status, int id, EnumCars enumCars    ) {
    this.name = name;
    this.color = color;
    this.status = status;
    this.id = id;
    this.enumCars = enumCars;
  }



  public abstract void move();

  public abstract void stop();

  public String toString() {
    s1 = "Название машины: " + name + ", " + "цвет: " + color + ", " +
        "cостояние: движется" + ", " + "identification number: " + id + ", " + enumCars.getInfo()+ ".";
    s2 = "Название машины: " + name + ", " + "цвет: " + color + ", " +
        "cостояние: в покое" + ", " + "identification number: " + id + ", " + enumCars.getInfo()+ ".";
    if (status) {
      System.out.println(s1);
      return s1;
    } else {
      System.out.println(s2);
      return s2;
    }
      }

  public String getS1() {
    return s1;
  }

  public String getS2() {
    return s2;
  }

  public String getName() {
    return name;
  }

  public void setName (String name) {
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

  public EnumCars getEnumCars() {
    return enumCars;
  }

  public void setEnumCars(EnumCars enumCars) {
    this.enumCars = enumCars;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

public void checkche () {
  System.out.println("I am ready");
}

  public void foo (Car car) {
    car.checkche();}


}




